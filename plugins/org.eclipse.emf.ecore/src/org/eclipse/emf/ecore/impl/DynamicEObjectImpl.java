/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: DynamicEObjectImpl.java,v 1.6 2006/04/20 18:56:16 emerks Exp $
 */
package org.eclipse.emf.ecore.impl;


import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * An implementation of the model object '<em><b>EObject</b></em>' that's tuned for dynamic use.
 */
public class DynamicEObjectImpl extends EObjectImpl implements EStructuralFeature.Internal.DynamicValueHolder
{
  public static final class BasicEMapEntry extends DynamicEObjectImpl implements BasicEMap.Entry
  {
    protected int hash;
    protected EStructuralFeature keyFeature;
    protected EStructuralFeature valueFeature;

    /**
     * Creates a dynamic EObject.
     */
    public BasicEMapEntry()
    {
      super();
    }

    /**
     * Creates a dynamic EObject.
     */
    public BasicEMapEntry(EClass eClass) 
    {
      super(eClass);
    }

    public Object getKey()
    {
      return eGet(keyFeature);
    }

    public void setKey(Object key)
    {
      eSet(keyFeature, key);
    }

    public int getHash()
    {
      if (hash == -1)
      {
        Object theKey = getKey();
        hash = (theKey == null ? 0 : theKey.hashCode());
      }
      return hash;
    }

    public void setHash(int hash)
    {
      this.hash = hash;
    }

    public Object getValue()
    {
      return eGet(valueFeature);
    }

    public Object setValue(Object value)
    {
      Object result = eGet(valueFeature);
      eSet(valueFeature, value);
      return result;
    }

    public void eSetClass(EClass eClass)
    {
      super.eSetClass(eClass);
      keyFeature = eClass.getEStructuralFeature("key");
      valueFeature = eClass.getEStructuralFeature("value");
    }
  }

  /**
   * An internal class for holding less frequently members variables.
   */
  protected static class DynamicEPropertiesHolderImpl implements BasicEObjectImpl.EPropertiesHolder
  {
    protected URI eProxyURI;
    protected Resource.Internal eResource;
    protected EList eContents;
    protected EList eCrossReferences;

    public EClass getEClass()
    {
      throw new UnsupportedOperationException();
    }

    public void setEClass(EClass eClass)
    {
      throw new UnsupportedOperationException();
    }

    public URI getEProxyURI()
    {
      return eProxyURI;
    }

    public void setEProxyURI(URI eProxyURI)
    {
      this.eProxyURI = eProxyURI;
    }

    public Resource.Internal getEResource()
    {
      return eResource;
    }

    public void setEResource(Resource.Internal eResource)
    {
      this.eResource = eResource;
    }

    public EList getEContents()
    {
      return eContents;
    }

    public void setEContents(EList eContents)
    {
      this.eContents = eContents;
    }

    public EList getECrossReferences()
    {
      return eCrossReferences;
    }

    public void setECrossReferences(EList eCrossReferences)
    {
      this.eCrossReferences = eCrossReferences;
    }

    public boolean hasSettings()
    {
      throw new UnsupportedOperationException();
    }

    public void allocateSettings(int maximumDynamicFeatureID)
    {
      throw new UnsupportedOperationException();
    }

    public Object dynamicGet(int dynamicFeatureID)
    {
      throw new UnsupportedOperationException();
    }

    public void dynamicSet(int dynamicFeatureID, Object value)
    {
      throw new UnsupportedOperationException();
    }

    public void dynamicUnset(int dynamicFeatureID)
    {
      throw new UnsupportedOperationException();
    }
  }

  protected EClass eClass;
  protected Object [] eSettings;

  protected static final Object [] ENO_SETTINGS = new Object [0];

  /**
   * Creates a dynamic EObject.
   */
  public DynamicEObjectImpl()
  {
    super();
  }

  /**
   * Creates a dynamic EObject.
   */
  public DynamicEObjectImpl(EClass eClass) 
  {
    super();
    eSetClass(eClass);
  }

  protected int eStaticFeatureCount()
  {
    return 0;
  }

  public int eDerivedStructuralFeatureID(EStructuralFeature eStructuralFeature)
  {
    return eClass().getFeatureID(eStructuralFeature);
  }

  protected BasicEObjectImpl.EPropertiesHolder eProperties()
  {
    if (eProperties == null)
    {
      eProperties = new DynamicEPropertiesHolderImpl();
    }
    return eProperties;
  }

  protected boolean eHasSettings()
  {
    return eSettings != null;
  }

  protected EStructuralFeature.Internal.DynamicValueHolder eSettings()
  {
    if (eSettings == null)
    {
      int size = eClass().getFeatureCount() - eStaticFeatureCount();
      eSettings = size == 0 ? ENO_SETTINGS : new Object [size];
    }

    return this;
  }

  protected EClass eDynamicClass()
  {
    return eClass;
  }

  public EClass eClass()
  {
    return eClass;
  }

  public void eSetClass(EClass eClass)
  {
    this.eClass = eClass;
  }

  public Object dynamicGet(int dynamicFeatureID)
  {
    return eSettings[dynamicFeatureID];
  }

  public void dynamicSet(int dynamicFeatureID, Object value)
  {
    eSettings[dynamicFeatureID] = value;
  }

  public void dynamicUnset(int dynamicFeatureID)
  {
    eSettings[dynamicFeatureID] = null;
  }

/*
  public String toString()
  {
    String result = super.toString();
    int index = result.indexOf("DynamicEObjectImpl");
    return index == -1 ? result : result.substring(0, index) + result.substring(index + 7);
  }
*/
}
