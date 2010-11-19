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
 * A representation of the literals of the enumeration '<em><b>File Structure Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFileStructureType()
 * @model
 * @generated
 */
public enum FileStructureType implements Enumerator {
	/**
	 * The '<em><b>File Structure Type0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE0_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_STRUCTURE_TYPE0(0, "FileStructureType0", "FileStructureType0"),

	/**
	 * The '<em><b>File Structure Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_STRUCTURE_TYPE1(1, "FileStructureType1", "FileStructureType1"),

	/**
	 * The '<em><b>File Structure Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	FILE_STRUCTURE_TYPE2(2, "FileStructureType2", "FileStructureType2");

	/**
	 * The '<em><b>File Structure Type0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Structure Type0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE0
	 * @model name="FileStructureType0"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_STRUCTURE_TYPE0_VALUE = 0;

	/**
	 * The '<em><b>File Structure Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Structure Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE1
	 * @model name="FileStructureType1"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_STRUCTURE_TYPE1_VALUE = 1;

	/**
	 * The '<em><b>File Structure Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File Structure Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE_STRUCTURE_TYPE2
	 * @model name="FileStructureType2"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_STRUCTURE_TYPE2_VALUE = 2;

	/**
	 * An array of all the '<em><b>File Structure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileStructureType[] VALUES_ARRAY =
		new FileStructureType[] {
			FILE_STRUCTURE_TYPE0,
			FILE_STRUCTURE_TYPE1,
			FILE_STRUCTURE_TYPE2,
		};

	/**
	 * A public read-only list of all the '<em><b>File Structure Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileStructureType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Structure Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileStructureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileStructureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Structure Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileStructureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileStructureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Structure Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileStructureType get(int value) {
		switch (value) {
			case FILE_STRUCTURE_TYPE0_VALUE: return FILE_STRUCTURE_TYPE0;
			case FILE_STRUCTURE_TYPE1_VALUE: return FILE_STRUCTURE_TYPE1;
			case FILE_STRUCTURE_TYPE2_VALUE: return FILE_STRUCTURE_TYPE2;
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
	private FileStructureType(int value, String name, String literal) {
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
	
} //FileStructureType
