/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.analysis.composition.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transformation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.hu.clickwatch.analysis.composition.model.CompositionPackage#getTransformationKind()
 * @model
 * @generated
 */
public enum TransformationKind implements Enumerator {
	/**
	 * The '<em><b>Predefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	PREDEFINED(0, "predefined", "predefined"),

	/**
	 * The '<em><b>Xtend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XTEND_VALUE
	 * @generated
	 * @ordered
	 */
	XTEND(1, "xtend", "xtend"),

	/**
	 * The '<em><b>Xpand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPAND_VALUE
	 * @generated
	 * @ordered
	 */
	XPAND(2, "xpand", "xpand"),

	/**
	 * The '<em><b>Java</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JAVA_VALUE
	 * @generated
	 * @ordered
	 */
	JAVA(3, "java", "java"), /**
	 * The '<em><b>Xtend2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XTEND2_VALUE
	 * @generated
	 * @ordered
	 */
	XTEND2(4, "xtend2", "xtend2");

	/**
	 * The '<em><b>Predefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Predefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREDEFINED
	 * @model name="predefined"
	 * @generated
	 * @ordered
	 */
	public static final int PREDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Xtend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xtend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XTEND
	 * @model name="xtend"
	 * @generated
	 * @ordered
	 */
	public static final int XTEND_VALUE = 1;

	/**
	 * The '<em><b>Xpand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xpand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XPAND
	 * @model name="xpand"
	 * @generated
	 * @ordered
	 */
	public static final int XPAND_VALUE = 2;

	/**
	 * The '<em><b>Java</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Java</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JAVA
	 * @model name="java"
	 * @generated
	 * @ordered
	 */
	public static final int JAVA_VALUE = 3;

	/**
	 * The '<em><b>Xtend2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xtend2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XTEND2
	 * @model name="xtend2"
	 * @generated
	 * @ordered
	 */
	public static final int XTEND2_VALUE = 4;

	/**
	 * An array of all the '<em><b>Transformation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransformationKind[] VALUES_ARRAY =
		new TransformationKind[] {
			PREDEFINED,
			XTEND,
			XPAND,
			JAVA,
			XTEND2,
		};

	/**
	 * A public read-only list of all the '<em><b>Transformation Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransformationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transformation Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransformationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transformation Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransformationKind get(int value) {
		switch (value) {
			case PREDEFINED_VALUE: return PREDEFINED;
			case XTEND_VALUE: return XTEND;
			case XPAND_VALUE: return XPAND;
			case JAVA_VALUE: return JAVA;
			case XTEND2_VALUE: return XTEND2;
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
	private TransformationKind(int value, String name, String literal) {
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
	
} //TransformationKind
