package org.ncpdp.qvt.ecl.svn;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.SVNURL;
import org.tmatesoft.svn.core.auth.ISVNAuthenticationManager;
import org.tmatesoft.svn.core.internal.io.dav.DAVRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.fs.FSRepositoryFactory;
import org.tmatesoft.svn.core.internal.io.svn.SVNRepositoryFactoryImpl;
import org.tmatesoft.svn.core.io.SVNRepository;
import org.tmatesoft.svn.core.io.SVNRepositoryFactory;
import org.tmatesoft.svn.core.wc.SVNWCUtil;

public class SVNUtil {

	private static SVNUtil svnUtil = null;

	private static SVNRepository repository = null;

	private SVNUtil() {

	}

	private static SVNUtil getInstance() {

		if (svnUtil == null) {
			svnUtil = new SVNUtil();

			SVNUtil.setupLibrary();
		}

		return svnUtil;
	}

	public static SVNRepository getRepository(String svnUrl, String svnUserName, String svnPassword) {
		if (repository == null) {
			try {

				getInstance();

				repository = SVNRepositoryFactory.create(SVNURL.parseURIEncoded(svnUrl));

				ISVNAuthenticationManager authManager = SVNWCUtil.createDefaultAuthenticationManager(svnUserName, svnPassword);

				repository.setAuthenticationManager(authManager);

			} catch (SVNException e) {

			}
		}

		return repository;

	}

	private static void setupLibrary() {
		/*
		 * For using over http:// and https://
		 */
		DAVRepositoryFactory.setup();
		/*
		 * For using over svn:// and svn+xxx://
		 */
		SVNRepositoryFactoryImpl.setup();

		/*
		 * For using over file:///
		 */
		FSRepositoryFactory.setup();
	}

}
