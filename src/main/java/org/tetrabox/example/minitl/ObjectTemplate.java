/**
 * generated by Xtext 2.25.0
 */
package org.tetrabox.example.minitl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitl.ObjectTemplate#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.example.minitl.ObjectTemplate#getType <em>Type</em>}</li>
 *   <li>{@link org.tetrabox.example.minitl.ObjectTemplate#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitl.MinitlPackage#getObjectTemplate()
 * @model
 * @generated
 */
public interface ObjectTemplate extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.tetrabox.example.minitl.MinitlPackage#getObjectTemplate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.tetrabox.example.minitl.ObjectTemplate#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see org.tetrabox.example.minitl.MinitlPackage#getObjectTemplate_Type()
   * @model
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link org.tetrabox.example.minitl.ObjectTemplate#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.tetrabox.example.minitl.Binding}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.tetrabox.example.minitl.MinitlPackage#getObjectTemplate_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<Binding> getBindings();

} // ObjectTemplate
