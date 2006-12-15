/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryXMLProcessor.java,v 1.1 2006/12/15 20:41:36 marcelop Exp $
 */
package org.examples.library.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.examples.library.LibraryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryXMLProcessor extends XMLProcessor
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final String copyright = "This is my code.";


  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LibraryXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    LibraryPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the LibraryResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new LibraryResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new LibraryResourceFactoryImpl());
    }
    return registrations;
  }

} //LibraryXMLProcessor
