package org.ncpdp.qvt.ecl.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.ModelExtent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.ncpdp.qvt.ecl.EclActivator;
import org.ncpdp.qvt.ecl.preferences.NCPDPPreferenceConstants;
import org.ncpdp.qvt.ecl.svn.SVNUtil;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNProperties;
import org.tmatesoft.svn.core.io.SVNFileRevision;
import org.tmatesoft.svn.core.io.SVNRepository;

public class ECLAction implements IWorkbenchWindowActionDelegate {

	public static class ECLMergeInputDialog extends Dialog {

		Collection<SVNFileRevision> eclRevisions;

		String eclProjectName;

		String eclVersion;

		String svnUserName ;
		
		String svnPassword;
		
		Text svnUserNameText = null;
		
		Text svnPasswordText = null;
		
		Text eclProjectNameText = null;

		Combo revisionComboBox = null;

		// Text eclVersionText = null;

		org.eclipse.swt.widgets.List availableVersions;

		public String getEclProjectName() {
			return eclProjectName;
		}

		public long getEclVersion() {
			// if for some reason bad string - return defaulted version
			try {
				return Long.parseLong(eclVersion.trim());
			}catch(NumberFormatException nFE) {
				return -1;
			}
				
		}

		public String getSvnPassword() {
			return svnPassword;
		}

		public Text getSvnPasswordText() {
			return svnPasswordText;
		}

		public ECLMergeInputDialog(IShellProvider parentShell) {
			super(parentShell);
			// TODO Auto-generated constructor stub
		}

		public ECLMergeInputDialog(Shell parentShell, Collection<SVNFileRevision> eclRevisions) {
			super(parentShell);
			this.eclRevisions = eclRevisions;
		}

		protected int getInputTextStyle() {
			return SWT.SINGLE | SWT.BORDER;
		}

		protected void validateInput() {

		}

		protected Control createDialogArea(Composite parent) {

			Composite composite = (Composite) super.createDialogArea(parent);
			
	/*
	 * 		Currently using anonymous connection - this is a bit of a security issue need to address
	        createLabel(parent, composite, "SVN User Name ");
			
			svnUserNameText =  new Text(composite, getInputTextStyle());
			
			createLabel(parent, composite, "SVN Password ");
			
			svnPasswordText  = new Text(composite, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);		
	 */
			
			createLabel(parent, composite, "Project Name ");

			eclProjectNameText = new Text(composite, getInputTextStyle());
			eclProjectNameText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
			eclProjectNameText.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					validateInput();
				}
			});

	

			createLabel(parent, composite, "ECL Version ");

			revisionComboBox = new Combo(composite, SWT.DROP_DOWN);

			// add latest version and set as default
			revisionComboBox.add("Latest Version");
			revisionComboBox.select(0);

			if (eclRevisions != null) {
				for (SVNFileRevision revision : eclRevisions) {

					SVNProperties svnrp = revision.getRevisionProperties();

					String author = svnrp.getStringValue("svn:author");

					String date = svnrp.getStringValue("svn:date");

					revisionComboBox.add(Long.toString(revision.getRevision()) + " : " + date + " : " + author);

				}
			}

			return composite;
		}

		private void createLabel(Composite parent, Composite composite, String theText) {
			Label labelText = new Label(composite, SWT.WRAP);
			labelText.setText(theText);
			GridData data = new GridData(GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_CENTER);
			data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
			labelText.setLayoutData(data);
			labelText.setFont(parent.getFont());
		}

		protected void buttonPressed(int buttonId) {
			if (buttonId == IDialogConstants.OK_ID) {
				eclProjectName = eclProjectNameText.getText();				
				if (revisionComboBox.getSelectionIndex() != 0) {
					// Pop the version based on the format of the display text
					// This assumes that version is the first text in a :
					// delimited display
					String[] version = revisionComboBox.getText().split(":");
					if (version.length > 0) {
						eclVersion = version[0];
					}
				} else {
					eclVersion = "-1";
				}
//				svnUserName = svnUserNameText.getText();
//				
//				svnPassword = svnPasswordText.getText();

				
			} else {

			}
			super.buttonPressed(buttonId);
		}

	}

	private IWorkbenchWindow window;

	/**
	 * The constructor.
	 */
	public ECLAction() {
	}

	/**
	 * The action has been activated. The argument of the method represents the
	 * 'real' action sitting in the workbench UI.
	 * 
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		IPreferenceStore store = EclActivator.getDefault().getPreferenceStore();

		final String svnName = "seanmuir"; 

		final String svnPassword = "oht2009";
		
		final String svnUrl = store.getString(NCPDPPreferenceConstants.SVNURL);

		final String ncpdpPath = store.getString(NCPDPPreferenceConstants.NCPDPSVNPATH);

		final String eclPath = store.getString(NCPDPPreferenceConstants.ECLSVNPATH);
		
		final String ncpdpModelName =store.getString(NCPDPPreferenceConstants.NCPDPMODELNAME);
		
		final String ncpdpMergeModelNameFormat =store.getString(NCPDPPreferenceConstants.NCPDPMERGEMODELNAMEFORMAT);
		
		final String commonModelName = store.getString(NCPDPPreferenceConstants.COMMONMODELNAME);
		
		final String eclModelName = store.getString(NCPDPPreferenceConstants.ECLMODELNAME);
		

		Collection<SVNFileRevision> eclRevisions = getModelVersions("ExternalCodeList.emx", svnUrl, svnName, svnPassword, eclPath);

		final ECLMergeInputDialog eclMergeDialog = new ECLMergeInputDialog(window.getShell(), eclRevisions);

		int result = eclMergeDialog.open();

		if (result == 0) {

			try {

				new ProgressMonitorDialog(window.getShell()).run(false, true, new IRunnableWithProgress() {

					public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

						monitor.beginTask("Create ECL Project", 100);

						monitor.subTask("Create Project Space");

						String releaseProject = eclMergeDialog.getEclProjectName();

						long eclVersion = eclMergeDialog.getEclVersion();

						String projectPath = getProjectPath(releaseProject);

						monitor.worked(10);

						monitor.subTask("Fetch Domain Model");

						addModelToProject(projectPath, ncpdpModelName, svnUrl, svnName, svnPassword, ncpdpPath);

						monitor.worked(10);

						monitor.subTask("Fetch Common Model");

						addModelToProject(projectPath, commonModelName,eclVersion, svnUrl, svnName, svnPassword, ncpdpPath);

						monitor.worked(20);

						monitor.subTask("Fetch External Code List Model");

						addModelToProject(projectPath, eclModelName, svnUrl, svnName, svnPassword, eclPath);

						monitor.worked(20);

						monitor.subTask("Merge Models");
						
						String.format(ncpdpMergeModelNameFormat, ( (eclVersion == -1) ?  "" : ( "."+eclVersion) )); 
											
						mergeECL(projectPath + System.getProperty("file.separator") + ncpdpModelName, projectPath + System.getProperty("file.separator") + eclModelName, projectPath + System.getProperty("file.separator") + String.format(ncpdpMergeModelNameFormat, ( (eclVersion == -1) ?  "" : ( "."+eclVersion) )));

						monitor.worked(35);

						monitor.subTask("Open Project");

						if (eclVersion != -1) {
							removeModelToProject(projectPath, ncpdpModelName);
						}

						openProject(releaseProject);

						monitor.worked(5);

					}

				});
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// org.eclipse.core.runtime.pr

		}

	}

	/**
	 * Selection in the workbench has been changed. We can change the state of
	 * the 'real' action here if we want, but this can only happen after the
	 * delegate has been created.
	 * 
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system resources we previously
	 * allocated.
	 * 
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to be able to provide parent shell
	 * for the message dialog.
	 * 
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void removeModelToProject(String projectPath, String modelName) {

		String modelFilePath = projectPath + "\\" + modelName;

		File f = new File(modelFilePath);

		// Make sure the file or directory exists and isn't write protected
		if (!f.exists())
			throw new IllegalArgumentException("Delete: no such file or directory: " + modelFilePath);

		if (!f.canWrite())
			throw new IllegalArgumentException("Delete: write protected: " + modelFilePath);

		// If it is a directory, make sure it is empty
		if (f.isDirectory()) {
			String[] files = f.list();
			if (files.length > 0)
				throw new IllegalArgumentException("Delete: directory not empty: " + modelFilePath);
		}

		// Attempt to delete it
		boolean success = f.delete();

		if (!success)
			throw new IllegalArgumentException("Delete: deletion failed");
	}

	@SuppressWarnings("unchecked")
	public Collection<SVNFileRevision> getModelVersions(String modelName, String svnUrl, String svnUserName, String svnPassword, String svnModelPath) {

		Collection<SVNFileRevision> revisions = null;

		SVNRepository repository = SVNUtil.getRepository(svnUrl, svnUserName, svnPassword);

		String modelSVNPath = svnModelPath + "/" + modelName;

		try {

			SVNNodeKind nodeKind = repository.checkPath(modelSVNPath, -1);

			if (nodeKind == SVNNodeKind.FILE) {

				revisions = repository.getFileRevisions(modelSVNPath, null, 0, repository.getLatestRevision());

			}
		}

		catch (SVNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return revisions;

	}

	public void addModelToProject(String projectPath, String modelName, String svnUrl, String svnUserName, String svnPassword, String svnModelPath) {
		addModelToProject(projectPath, modelName, -1, svnUrl, svnUserName, svnPassword, svnModelPath);
	}

	public void addModelToProject(String projectPath, String modelName, long version, String svnUrl, String svnUserName, String svnPassword, String svnModelPath) {
		SVNRepository repository = SVNUtil.getRepository(svnUrl, svnUserName, svnPassword);

		SVNProperties fileProperties = new SVNProperties();

		FileOutputStream modelOutput = null;

		String modelFilePath = projectPath + System.getProperty("file.separator") + modelName;

		String modelSVNPath = svnModelPath +System.getProperty("file.separator") + modelName;

		try {
			modelOutput = new FileOutputStream(modelFilePath);

			SVNNodeKind nodeKind = repository.checkPath(modelSVNPath, version);

			if (nodeKind == SVNNodeKind.FILE) {

				repository.getFile(modelSVNPath, version, fileProperties, modelOutput);

				modelOutput.flush();
				modelOutput.close();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SVNException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	public String getProjectPath(String projectName) {
	
		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject modelProject = myWorkspaceRoot.getProject(projectName);

		if (modelProject.exists()) {
			
			// Move any existing project to a version project
			
			boolean foundNewBucket = false;
			int bucketCtr = 1;
			
			while (!foundNewBucket )
			{
				String bucketName = projectName+"."+bucketCtr++;
				if (!myWorkspaceRoot.getProject(bucketName).exists())
				{
					foundNewBucket = true;
					try {
						modelProject.copy(myWorkspaceRoot.getProject(bucketName).getFullPath(),true,null);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		}
		
		
			try {
				modelProject.create(null);
			} catch (CoreException e1) {

			}
		

		return myWorkspaceRoot.getLocation().toOSString() + modelProject.getFullPath().toOSString();

	}

	public String openProject(String projectName) {

		IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

		IProject modelProject = myWorkspaceRoot.getProject(projectName);

		try {
			modelProject.open(null);
		} catch (CoreException e1) {

		}

		return myWorkspaceRoot.getLocation().toOSString() + modelProject.getFullPath().toOSString();

	}

	public void mergeECL(String domainModelPath, String eclPath, String mergePath) {

		URI transformationURI = URI.createPlatformPluginURI(EclActivator.PLUGIN_ID + "/transforms/eclmerge.qvto", false);

		URI domainModelURI = URI.createFileURI(domainModelPath);

		URI eclURI = URI.createFileURI(eclPath);

		URI mergedModelURI = URI.createFileURI(mergePath);

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);

		resourceSet.getLoadOptions().put(XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);

		// Create the merge model target
		Resource mergeResource = resourceSet.createResource(mergedModelURI);

		// Get the top package from the domain list
		Package domainModel = (Package) UMLUtil.load(resourceSet, domainModelURI, UMLPackage.Literals.PACKAGE); // (Package)
		// EcoreUtil.getObjectByType(domainModelResource.getContents(),
		// UMLPackage.eINSTANCE.getPackage());

		// Get the top model from the ecl
		Model eclModel = (Model) UMLUtil.load(resourceSet, eclURI, UMLPackage.Literals.MODEL); // EcoreUtil.getObjectByType(eclResource.getContents(),
		// UMLPackage.eINSTANCE.getModel());

		// Create the qvt transform executer
		EList<EObject> inModels = new BasicEList<EObject>();

		inModels.add(domainModel);

		inModels.add(eclModel);

		QvtoTransformationHelper helper = new QvtoTransformationHelper(transformationURI);

		TransfExecutionResult result;
		try {

			result = helper.executeTransformation(inModels, Collections.<String, Object> emptyMap(), null);

			List<ModelExtent> mes = result.getOutModelExtents();

			System.out.println("result.getConsoleOutput() " + result.getConsoleOutput());

			for (ModelExtent me : mes) {

				for (EObject eo : me.getAllRootElements()) {
					System.out.println("eo " + eo.toString());
					mergeResource.getContents().add(eo);
				}

			}

			Map<String, String> options = new HashMap<String, String>();

			mergeResource.save(options);

		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}