/**
 * generated by Xtext 2.25.0
 */
package org.tetrabox.example.minitl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitl.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.tetrabox.example.minitl.Rule#getObjectTemplates <em>Object Templates</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitl.MinitlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.tetrabox.example.minitl.MinitlPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.tetrabox.example.minitl.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Object Templates</b></em>' containment reference list.
   * The list contents are of type {@link org.tetrabox.example.minitl.ObjectTemplate}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Templates</em>' containment reference list.
   * @see org.tetrabox.example.minitl.MinitlPackage#getRule_ObjectTemplates()
   * @model containment="true"
   * @generated
   */
  EList<ObjectTemplate> getObjectTemplates();

} // Rule