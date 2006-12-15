/**
 * <copyright>
 * </copyright>
 *
 * $Id: HRFactory.java,v 1.1 2006/12/15 20:41:37 marcelop Exp $
 */
package org.examples.hr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.examples.hr.HRPackage
 * @generated
 */
public interface HRFactory extends EFactory
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String copyright = "This is my code."; //$NON-NLS-1$

  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HRFactory eINSTANCE = org.examples.hr.impl.HRFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HRPackage getHRPackage();

} //HRFactory
