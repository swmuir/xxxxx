/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.ecl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>File Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFileType()
 * @model
 * @generated
 */
public enum FileType implements Enumerator {
	/**
	 * The '<em><b>File Type T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_TYPE_T_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_TYPE_T(0, "FileTypeT", "FileTypeT"),

	/**
	 * The '<em><b>File Type P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_TYPE_P_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_TYPE_P(1, "FileTypeP", "FileTypeP");

	/**
	 * The '<em><b>File Type T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Type T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_TYPE_T
	 * @model name="FileTypeT"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_TYPE_T_VALUE = 0;

	/**
	 * The '<em><b>File Type P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Type P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_TYPE_P
	 * @model name="FileTypeP"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_TYPE_P_VALUE = 1;

	/**
	 * An array of all the '<em><b>File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileType[] VALUES_ARRAY =
		new FileType[] {
			FILE_TYPE_T,
			FILE_TYPE_P,
		};

	/**
	 * A public read-only list of all the '<em><b>File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileType get(int value) {
		switch (value) {
			case FILE_TYPE_T_VALUE: return FILE_TYPE_T;
			case FILE_TYPE_P_VALUE: return FILE_TYPE_P;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FileType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FileType
