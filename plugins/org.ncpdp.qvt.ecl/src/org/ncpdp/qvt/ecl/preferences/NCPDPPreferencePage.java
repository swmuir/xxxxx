package org.ncpdp.qvt.ecl.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.ncpdp.qvt.ecl.EclActivator;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class NCPDPPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	StringFieldEditor svnurl = null;

	StringFieldEditor eclpath = null;

	StringFieldEditor ncpdppath = null;

	StringFieldEditor ncpdpmodelname = null;

	StringFieldEditor ncpdpmergemodelnameformat = null;

	StringFieldEditor commonmodelname = null;

	StringFieldEditor eclmodelname = null;

	public NCPDPPreferencePage() {
		super(GRID);
		
		setPreferenceStore(EclActivator.getDefault().getPreferenceStore());
		
		setDescription("NCPDP ECL Merge Preferences");
	}

	@Override
	public boolean performOk() {

		IPreferenceStore store = getPreferenceStore();

		store.setValue(NCPDPPreferenceConstants.SVNURL, svnurl.getStringValue());

		store.setValue(NCPDPPreferenceConstants.ECLSVNPATH, eclpath.getStringValue());

		store.setValue(NCPDPPreferenceConstants.NCPDPSVNPATH, ncpdppath.getStringValue());

		store.setValue(NCPDPPreferenceConstants.NCPDPMODELNAME, ncpdpmodelname.getStringValue());

		store.setValue(NCPDPPreferenceConstants.NCPDPMERGEMODELNAMEFORMAT, ncpdpmergemodelnameformat.getStringValue());

		store.setValue(NCPDPPreferenceConstants.COMMONMODELNAME, commonmodelname.getStringValue());

		store.setValue(NCPDPPreferenceConstants.ECLMODELNAME, eclmodelname.getStringValue());

		return super.performOk();
	}

	@Override
	protected void initialize() {

		IPreferenceStore store = getPreferenceStore();

		svnurl.setStringValue(store.getString(NCPDPPreferenceConstants.SVNURL));

		eclpath.setStringValue(store.getString(NCPDPPreferenceConstants.ECLSVNPATH));

		ncpdppath.setStringValue(store.getString(NCPDPPreferenceConstants.NCPDPSVNPATH));

		ncpdpmodelname.setStringValue(store.getString(NCPDPPreferenceConstants.NCPDPMODELNAME));

		ncpdpmergemodelnameformat.setStringValue(store.getString(NCPDPPreferenceConstants.NCPDPMERGEMODELNAMEFORMAT));

		commonmodelname.setStringValue(store.getString(NCPDPPreferenceConstants.COMMONMODELNAME));

		eclmodelname.setStringValue(store.getString(NCPDPPreferenceConstants.ECLMODELNAME));

		super.initialize();
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		svnurl = new StringFieldEditor(NCPDPPreferenceConstants.SVNURL, "SVN URL", getFieldEditorParent());

		ncpdppath = new StringFieldEditor(NCPDPPreferenceConstants.NCPDPSVNPATH, "SVN Archive Path for NCPDP Models", getFieldEditorParent());

		eclpath = new StringFieldEditor(NCPDPPreferenceConstants.ECLSVNPATH, "SVN Archive Path for NCPDP ECL Models", getFieldEditorParent());

		ncpdpmodelname = new StringFieldEditor(NCPDPPreferenceConstants.NCPDPMODELNAME, "SVN Archive Name for NCPDP Model", getFieldEditorParent());

		ncpdpmergemodelnameformat = new StringFieldEditor(NCPDPPreferenceConstants.NCPDPMERGEMODELNAMEFORMAT, "NCPDP Merged Model Format", getFieldEditorParent());

		commonmodelname = new StringFieldEditor(NCPDPPreferenceConstants.COMMONMODELNAME, "SVN Archive Name for Common Model", getFieldEditorParent());

		eclmodelname = new StringFieldEditor(NCPDPPreferenceConstants.ECLMODELNAME, "SVN Archive Name for ECL Model", getFieldEditorParent());

		addField(svnurl);
		
		addField(eclpath);
		
		addField(ncpdppath);
		
		addField(ncpdpmodelname);
		
		addField(ncpdpmergemodelnameformat);
		
		addField(commonmodelname);
		
		addField(eclmodelname);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

}