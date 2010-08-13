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
 * A representation of the literals of the enumeration '<em><b>Segment Identifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSegmentIdentifier()
 * @model
 * @generated
 */
public enum SegmentIdentifier implements Enumerator {
	/**
	 * The '<em><b>Segment Identifier00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER00_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT_IDENTIFIER00(0, "SegmentIdentifier00", "SegmentIdentifier00"),

	/**
	 * The '<em><b>Segment Identifier G1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER_G1_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT_IDENTIFIER_G1(1, "SegmentIdentifierG1", "SegmentIdentifierG1"),

	/**
	 * The '<em><b>Segment Identifier99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER99_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENT_IDENTIFIER99(2, "SegmentIdentifier99", "SegmentIdentifier99");

	/**
	 * The '<em><b>Segment Identifier00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segment Identifier00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER00
	 * @model name="SegmentIdentifier00"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_IDENTIFIER00_VALUE = 0;

	/**
	 * The '<em><b>Segment Identifier G1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segment Identifier G1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER_G1
	 * @model name="SegmentIdentifierG1"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_IDENTIFIER_G1_VALUE = 1;

	/**
	 * The '<em><b>Segment Identifier99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segment Identifier99</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENT_IDENTIFIER99
	 * @model name="SegmentIdentifier99"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENT_IDENTIFIER99_VALUE = 2;

	/**
	 * An array of all the '<em><b>Segment Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SegmentIdentifier[] VALUES_ARRAY =
		new SegmentIdentifier[] {
			SEGMENT_IDENTIFIER00,
			SEGMENT_IDENTIFIER_G1,
			SEGMENT_IDENTIFIER99,
		};

	/**
	 * A public read-only list of all the '<em><b>Segment Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SegmentIdentifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Segment Identifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SegmentIdentifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SegmentIdentifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Segment Identifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SegmentIdentifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SegmentIdentifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Segment Identifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SegmentIdentifier get(int value) {
		switch (value) {
			case SEGMENT_IDENTIFIER00_VALUE: return SEGMENT_IDENTIFIER00;
			case SEGMENT_IDENTIFIER_G1_VALUE: return SEGMENT_IDENTIFIER_G1;
			case SEGMENT_IDENTIFIER99_VALUE: return SEGMENT_IDENTIFIER99;
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
	private SegmentIdentifier(int value, String name, String literal) {
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
	
} //SegmentIdentifier
