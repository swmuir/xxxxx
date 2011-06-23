package org.ncpdp.qvt.ecl.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.ModelExtent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.ncpdp.qvt.ecl.EclActivator;
import org.ncpdp.qvt.ecl.svn.SVNUtil;
import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNNodeKind;
import org.tmatesoft.svn.core.SVNProperties;
import org.tmatesoft.svn.core.io.SVNRepository;




public class TestECL extends TestCase {
	


	 
	   public String getProjectPath(String projectName)
	   {
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();

			IProject modelProject = myWorkspaceRoot.getProject(projectName);

			try {
				modelProject.create(null);
			} catch (CoreException e1) {
				
			}
			
			return myWorkspaceRoot.getLocation().toOSString() + modelProject.getFullPath().toOSString(); 

	   }
	   
		public void addModelToProject(String projectPath,String modelName, String svnUrl,String svnUserName,String svnPassword,String svnModelPath)
		{
			SVNRepository repository = SVNUtil.getRepository(svnUrl, svnUserName, svnPassword);
			
			SVNProperties fileProperties = new SVNProperties();
			
			FileOutputStream modelOutput = null;
			
			String modelFilePath = projectPath + "\\" +modelName;
			
			String modelSVNPath = svnModelPath + "/" + modelName;
			
			try {
				modelOutput = new FileOutputStream(modelFilePath);
				
				SVNNodeKind nodeKind = repository.checkPath(modelSVNPath, -1);

				if (nodeKind == SVNNodeKind.FILE) {
					repository.getFile(modelSVNPath, -1, fileProperties, modelOutput);
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
		
		public void testNew()
		{
			String svnUrl = "https://ncpdp.projects.openhealthtools.org/svn/ncpdp/trunk";
			
			String svnName = "seanmuir";
			
			String svnPassword = "oht2009";
			
			String releaseProject = "ncpdprelease";
			
			String ncpdpPath = "ncpdp/models/org.ncpdp.uml";
			
			String eclPath = "ncpdp/models/org.ncpdp.uml.ecl";
			
			String projectPath = getProjectPath(releaseProject);
			
			addModelToProject(projectPath,"org.ncpdp.uml.emx", svnUrl,svnName,svnPassword,ncpdpPath);
			
			addModelToProject(projectPath,"org.ncpdp.uml.common.emx", svnUrl,svnName,svnPassword,ncpdpPath);
			
			addModelToProject(projectPath,"ExternalCodeList.emx", svnUrl,svnName,svnPassword,eclPath );
						
			mergeECL(projectPath + "\\org.ncpdp.uml.emx" , projectPath +"\\ExternalCodeList.emx", projectPath + "\\merged.emx");
			
			
						
		}




	public void mergeECL(String domainModelPath, String eclPath, String mergePath) {

		URI transformationURI = URI.createPlatformPluginURI(EclActivator.PLUGIN_ID + "/transforms/eclmerge.qvto", false);

		URI domainModelURI = URI.createFileURI(domainModelPath);

		URI eclURI = URI.createFileURI(eclPath);

		URI mergedModelURI = URI.createFileURI(mergePath);

		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getLoadOptions().put(
				XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		resourceSet.getLoadOptions().put(
				XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.FALSE);

		resourceSet.getLoadOptions().put(
				XMIResource.OPTION_DEFER_ATTACHMENT, Boolean.FALSE);


		// Create the merge model target
		Resource mergeResource = resourceSet.createResource(mergedModelURI);

		// Get the top package from the domain list
		Package domainModel = (Package) UMLUtil.load(resourceSet,domainModelURI, UMLPackage.Literals.PACKAGE); //(Package) EcoreUtil.getObjectByType(domainModelResource.getContents(), UMLPackage.eINSTANCE.getPackage());

		// Get the top model from the ecl
		Model eclModel = (Model) UMLUtil.load(resourceSet,eclURI, UMLPackage.Literals.MODEL); //EcoreUtil.getObjectByType(eclResource.getContents(), UMLPackage.eINSTANCE.getModel());
		
		// Create the qvt transform executer
		EList<EObject> inModels = new BasicEList<EObject>();
		
		inModels.add(domainModel);
		
		inModels.add(eclModel);
		
		QvtoTransformationHelper helper = new QvtoTransformationHelper(transformationURI);
		
		TransfExecutionResult result;
		try {
			
			result = helper.executeTransformation(inModels, Collections.<String, Object> emptyMap(), null);
			
			List <ModelExtent> mes = result.getOutModelExtents();
			
			System.out.println("result.getConsoleOutput() "+result.getConsoleOutput());
			
			for (ModelExtent me : mes)
			{
				
				for (EObject eo : me.getAllRootElements())
				{
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
