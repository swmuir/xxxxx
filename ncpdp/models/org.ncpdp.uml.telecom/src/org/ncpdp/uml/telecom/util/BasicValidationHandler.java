/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.util;

import org.eclipse.emf.common.util.Diagnostic;
import org.ncpdp.uml.telecom.util.TelecomUtil.ValidationHandler;

public class BasicValidationHandler implements ValidationHandler {
	public void handleError(Diagnostic diagnostic) {
		// do nothing
	}

	public void handleWarning(Diagnostic diagnostic) {
		// do nothing
	}
	
	public void handleInfo(Diagnostic diagnostic) {
		// do nothing
	}
}
