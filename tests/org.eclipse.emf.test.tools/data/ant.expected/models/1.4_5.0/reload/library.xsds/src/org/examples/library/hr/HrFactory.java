/**
 * <copyright>
 * </copyright>
 *
 * $Id: HrFactory.java,v 1.1 2006/12/15 20:41:38 marcelop Exp $
 */
package org.examples.library.hr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.examples.library.hr.HrPackage
 * @generated
 */
public interface HrFactory extends EFactory
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
  HrFactory eINSTANCE = org.examples.library.hr.impl.HrFactoryImpl.init();

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
  HrPackage getHrPackage();

} //HrFactory
