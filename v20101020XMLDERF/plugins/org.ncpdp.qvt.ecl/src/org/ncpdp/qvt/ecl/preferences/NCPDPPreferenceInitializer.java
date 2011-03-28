package org.ncpdp.qvt.ecl.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.ncpdp.qvt.ecl.EclActivator;

/**
 * Class used to initialize default preference values.
 */
public class NCPDPPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = EclActivator.getDefault().getPreferenceStore();

		store.setDefault(NCPDPPreferenceConstants.SVNURL,"https://ncpdp.projects.openhealthtools.org/svn/ncpdp/trunk");
		
		store.setDefault(NCPDPPreferenceConstants.NCPDPSVNPATH,"ncpdp/models/org.ncpdp.uml");
		
		store.setDefault(NCPDPPreferenceConstants.ECLSVNPATH ,"ncpdp/models/org.ncpdp.uml.ecl");
	
		store.setDefault(NCPDPPreferenceConstants.NCPDPMODELNAME ,"org.ncpdp.uml.emx");
		
		store.setDefault(NCPDPPreferenceConstants.NCPDPMERGEMODELNAMEFORMAT ,"org.ncpdp.uml%s.emx");
		
		store.setDefault(NCPDPPreferenceConstants.COMMONMODELNAME ,"org.ncpdp.uml.common.emx");
		
		store.setDefault(NCPDPPreferenceConstants.ECLMODELNAME,"ExternalCodeList.emx");

		
	}

}
