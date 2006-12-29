/**
 * <copyright>
 * </copyright>
 *
 * $Id: MovieTypeImpl.java,v 1.2 2006/12/29 21:49:53 marcelop Exp $
 */
package org.eclipse.emf.test.models.movie.db.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.test.models.customer.CustomerType;

import org.eclipse.emf.test.models.movie.db.CriticsReviewType;
import org.eclipse.emf.test.models.movie.db.DbPackage;
import org.eclipse.emf.test.models.movie.db.GenreTypes;
import org.eclipse.emf.test.models.movie.db.MovieType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Movie Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getDirector <em>Director</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getCriticsReviewGroup <em>Critics Review Group</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getCriticsReview <em>Critics Review</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getCheckedOutBy <em>Checked Out By</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.movie.db.impl.MovieTypeImpl#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MovieTypeImpl extends EObjectImpl implements MovieType
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getActors() <em>Actors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected static final List<String> ACTORS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected List<String> actors = ACTORS_EDEFAULT;

  /**
   * The default value of the '{@link #getDirector() <em>Director</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirector()
   * @generated
   * @ordered
   */
  protected static final String DIRECTOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirector() <em>Director</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirector()
   * @generated
   * @ordered
   */
  protected String director = DIRECTOR_EDEFAULT;

  /**
   * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected static final GenreTypes GENRE_EDEFAULT = GenreTypes.NEW_RELEASE_LITERAL;

  /**
   * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenre()
   * @generated
   * @ordered
   */
  protected GenreTypes genre = GENRE_EDEFAULT;

  /**
   * This is true if the Genre attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean genreESet = false;

  /**
   * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary()
   * @generated
   * @ordered
   */
  protected String summary = SUMMARY_EDEFAULT;

  /**
   * The cached value of the '{@link #getCriticsReviewGroup() <em>Critics Review Group</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticsReviewGroup()
   * @generated
   * @ordered
   */
  protected FeatureMap criticsReviewGroup = null;

  /**
   * The cached value of the '{@link #getCheckedOutBy() <em>Checked Out By</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCheckedOutBy()
   * @generated
   * @ordered
   */
  protected CustomerType checkedOutBy = null;

  /**
   * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAny()
   * @generated
   * @ordered
   */
  protected FeatureMap any = null;

  /**
   * The default value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getID()
   * @generated
   * @ordered
   */
  protected String iD = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MovieTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DbPackage.Literals.MOVIE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List<String> getActors()
  {
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActors(List<String> newActors)
  {
    List<String> oldActors = actors;
    actors = newActors;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__ACTORS, oldActors, actors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDirector()
  {
    return director;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirector(String newDirector)
  {
    String oldDirector = director;
    director = newDirector;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__DIRECTOR, oldDirector, director));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenreTypes getGenre()
  {
    return genre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenre(GenreTypes newGenre)
  {
    GenreTypes oldGenre = genre;
    genre = newGenre == null ? GENRE_EDEFAULT : newGenre;
    boolean oldGenreESet = genreESet;
    genreESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__GENRE, oldGenre, genre, !oldGenreESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetGenre()
  {
    GenreTypes oldGenre = genre;
    boolean oldGenreESet = genreESet;
    genre = GENRE_EDEFAULT;
    genreESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, DbPackage.MOVIE_TYPE__GENRE, oldGenre, GENRE_EDEFAULT, oldGenreESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetGenre()
  {
    return genreESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary()
  {
    return summary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary(String newSummary)
  {
    String oldSummary = summary;
    summary = newSummary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__SUMMARY, oldSummary, summary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getCriticsReviewGroup()
  {
    if (criticsReviewGroup == null)
    {
      criticsReviewGroup = new BasicFeatureMap(this, DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP);
    }
    return criticsReviewGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CriticsReviewType> getCriticsReview()
  {
    return getCriticsReviewGroup().list(DbPackage.Literals.MOVIE_TYPE__CRITICS_REVIEW);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerType getCheckedOutBy()
  {
    if (checkedOutBy != null && checkedOutBy.eIsProxy())
    {
      InternalEObject oldCheckedOutBy = (InternalEObject)checkedOutBy;
      checkedOutBy = (CustomerType)eResolveProxy(oldCheckedOutBy);
      if (checkedOutBy != oldCheckedOutBy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DbPackage.MOVIE_TYPE__CHECKED_OUT_BY, oldCheckedOutBy, checkedOutBy));
      }
    }
    return checkedOutBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CustomerType basicGetCheckedOutBy()
  {
    return checkedOutBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheckedOutBy(CustomerType newCheckedOutBy)
  {
    CustomerType oldCheckedOutBy = checkedOutBy;
    checkedOutBy = newCheckedOutBy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__CHECKED_OUT_BY, oldCheckedOutBy, checkedOutBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMap getAny()
  {
    if (any == null)
    {
      any = new BasicFeatureMap(this, DbPackage.MOVIE_TYPE__ANY);
    }
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getID()
  {
    return iD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setID(String newID)
  {
    String oldID = iD;
    iD = newID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DbPackage.MOVIE_TYPE__ID, oldID, iD));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP:
        return ((InternalEList<?>)getCriticsReviewGroup()).basicRemove(otherEnd, msgs);
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW:
        return ((InternalEList<?>)getCriticsReview()).basicRemove(otherEnd, msgs);
      case DbPackage.MOVIE_TYPE__ANY:
        return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DbPackage.MOVIE_TYPE__TITLE:
        return getTitle();
      case DbPackage.MOVIE_TYPE__ACTORS:
        return getActors();
      case DbPackage.MOVIE_TYPE__DIRECTOR:
        return getDirector();
      case DbPackage.MOVIE_TYPE__GENRE:
        return getGenre();
      case DbPackage.MOVIE_TYPE__SUMMARY:
        return getSummary();
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP:
        if (coreType) return getCriticsReviewGroup();
        return ((FeatureMap.Internal)getCriticsReviewGroup()).getWrapper();
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW:
        return getCriticsReview();
      case DbPackage.MOVIE_TYPE__CHECKED_OUT_BY:
        if (resolve) return getCheckedOutBy();
        return basicGetCheckedOutBy();
      case DbPackage.MOVIE_TYPE__ANY:
        if (coreType) return getAny();
        return ((FeatureMap.Internal)getAny()).getWrapper();
      case DbPackage.MOVIE_TYPE__ID:
        return getID();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DbPackage.MOVIE_TYPE__TITLE:
        setTitle((String)newValue);
        return;
      case DbPackage.MOVIE_TYPE__ACTORS:
        setActors((List<String>)newValue);
        return;
      case DbPackage.MOVIE_TYPE__DIRECTOR:
        setDirector((String)newValue);
        return;
      case DbPackage.MOVIE_TYPE__GENRE:
        setGenre((GenreTypes)newValue);
        return;
      case DbPackage.MOVIE_TYPE__SUMMARY:
        setSummary((String)newValue);
        return;
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP:
        ((FeatureMap.Internal)getCriticsReviewGroup()).set(newValue);
        return;
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW:
        getCriticsReview().clear();
        getCriticsReview().addAll((Collection<? extends CriticsReviewType>)newValue);
        return;
      case DbPackage.MOVIE_TYPE__CHECKED_OUT_BY:
        setCheckedOutBy((CustomerType)newValue);
        return;
      case DbPackage.MOVIE_TYPE__ANY:
        ((FeatureMap.Internal)getAny()).set(newValue);
        return;
      case DbPackage.MOVIE_TYPE__ID:
        setID((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DbPackage.MOVIE_TYPE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case DbPackage.MOVIE_TYPE__ACTORS:
        setActors(ACTORS_EDEFAULT);
        return;
      case DbPackage.MOVIE_TYPE__DIRECTOR:
        setDirector(DIRECTOR_EDEFAULT);
        return;
      case DbPackage.MOVIE_TYPE__GENRE:
        unsetGenre();
        return;
      case DbPackage.MOVIE_TYPE__SUMMARY:
        setSummary(SUMMARY_EDEFAULT);
        return;
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP:
        getCriticsReviewGroup().clear();
        return;
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW:
        getCriticsReview().clear();
        return;
      case DbPackage.MOVIE_TYPE__CHECKED_OUT_BY:
        setCheckedOutBy((CustomerType)null);
        return;
      case DbPackage.MOVIE_TYPE__ANY:
        getAny().clear();
        return;
      case DbPackage.MOVIE_TYPE__ID:
        setID(ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DbPackage.MOVIE_TYPE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case DbPackage.MOVIE_TYPE__ACTORS:
        return ACTORS_EDEFAULT == null ? actors != null : !ACTORS_EDEFAULT.equals(actors);
      case DbPackage.MOVIE_TYPE__DIRECTOR:
        return DIRECTOR_EDEFAULT == null ? director != null : !DIRECTOR_EDEFAULT.equals(director);
      case DbPackage.MOVIE_TYPE__GENRE:
        return isSetGenre();
      case DbPackage.MOVIE_TYPE__SUMMARY:
        return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW_GROUP:
        return criticsReviewGroup != null && !criticsReviewGroup.isEmpty();
      case DbPackage.MOVIE_TYPE__CRITICS_REVIEW:
        return !getCriticsReview().isEmpty();
      case DbPackage.MOVIE_TYPE__CHECKED_OUT_BY:
        return checkedOutBy != null;
      case DbPackage.MOVIE_TYPE__ANY:
        return any != null && !any.isEmpty();
      case DbPackage.MOVIE_TYPE__ID:
        return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (title: ");
    result.append(title);
    result.append(", actors: ");
    result.append(actors);
    result.append(", director: ");
    result.append(director);
    result.append(", genre: ");
    if (genreESet) result.append(genre); else result.append("<unset>");
    result.append(", summary: ");
    result.append(summary);
    result.append(", criticsReviewGroup: ");
    result.append(criticsReviewGroup);
    result.append(", any: ");
    result.append(any);
    result.append(", iD: ");
    result.append(iD);
    result.append(')');
    return result.toString();
  }

} //MovieTypeImpl
