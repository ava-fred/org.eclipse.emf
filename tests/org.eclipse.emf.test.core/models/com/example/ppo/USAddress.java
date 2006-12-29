/**
 * <copyright>
 * </copyright>
 *
 * $Id: USAddress.java,v 1.2 2006/12/29 21:49:52 marcelop Exp $
 */
package com.example.ppo;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.ppo.USAddress#getName <em>Name</em>}</li>
 *   <li>{@link com.example.ppo.USAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link com.example.ppo.USAddress#getCity <em>City</em>}</li>
 *   <li>{@link com.example.ppo.USAddress#getState <em>State</em>}</li>
 *   <li>{@link com.example.ppo.USAddress#getZip <em>Zip</em>}</li>
 *   <li>{@link com.example.ppo.USAddress#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.ppo.PPOPackage#getUSAddress()
 * @model
 * @generated
 */
public interface USAddress extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.example.ppo.PPOPackage#getUSAddress_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.example.ppo.USAddress#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Street</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Street</em>' attribute.
   * @see #setStreet(String)
   * @see com.example.ppo.PPOPackage#getUSAddress_Street()
   * @model
   * @generated
   */
  String getStreet();

  /**
   * Sets the value of the '{@link com.example.ppo.USAddress#getStreet <em>Street</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Street</em>' attribute.
   * @see #getStreet()
   * @generated
   */
  void setStreet(String value);

  /**
   * Returns the value of the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>City</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>City</em>' attribute.
   * @see #setCity(String)
   * @see com.example.ppo.PPOPackage#getUSAddress_City()
   * @model
   * @generated
   */
  String getCity();

  /**
   * Sets the value of the '{@link com.example.ppo.USAddress#getCity <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>City</em>' attribute.
   * @see #getCity()
   * @generated
   */
  void setCity(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see com.example.ppo.PPOPackage#getUSAddress_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link com.example.ppo.USAddress#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Returns the value of the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zip</em>' attribute.
   * @see #setZip(int)
   * @see com.example.ppo.PPOPackage#getUSAddress_Zip()
   * @model
   * @generated
   */
  int getZip();

  /**
   * Sets the value of the '{@link com.example.ppo.USAddress#getZip <em>Zip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zip</em>' attribute.
   * @see #getZip()
   * @generated
   */
  void setZip(int value);

  /**
   * Returns the value of the '<em><b>Country</b></em>' attribute.
   * The default value is <code>"US"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Country</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Country</em>' attribute.
   * @see com.example.ppo.PPOPackage#getUSAddress_Country()
   * @model default="US" changeable="false"
   * @generated
   */
  String getCountry();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model
   * @generated
   */
  boolean hasUSState(DiagnosticChain diagnostics, Map<Object, Object> context);

} // USAddress
