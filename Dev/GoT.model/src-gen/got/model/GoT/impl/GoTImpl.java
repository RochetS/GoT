/**
 */
package got.model.GoT.impl;

import got.model.GoT.GoT;
import got.model.GoT.GoTPackage;
import got.model.GoT.House;
import got.model.GoT.Place;
import got.model.GoT.Season;
import got.model.GoT.Union;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Go T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.impl.GoTImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link got.model.GoT.impl.GoTImpl#getHouse <em>House</em>}</li>
 *   <li>{@link got.model.GoT.impl.GoTImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link got.model.GoT.impl.GoTImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link got.model.GoT.impl.GoTImpl#getUnion <em>Union</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoTImpl extends MinimalEObjectImpl.Container implements GoT {
	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected EList<got.model.GoT.Character> character;

	/**
	 * The cached value of the '{@link #getHouse() <em>House</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouse()
	 * @generated
	 * @ordered
	 */
	protected EList<House> house;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected EList<Season> season;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<Union> union;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoTPackage.Literals.GO_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<got.model.GoT.Character> getCharacter() {
		if (character == null) {
			character = new EObjectContainmentEList<got.model.GoT.Character>(got.model.GoT.Character.class, this,
					GoTPackage.GO_T__CHARACTER);
		}
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getHouse() {
		if (house == null) {
			house = new EObjectContainmentEList<House>(House.class, this, GoTPackage.GO_T__HOUSE);
		}
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Season> getSeason() {
		if (season == null) {
			season = new EObjectContainmentEList<Season>(Season.class, this, GoTPackage.GO_T__SEASON);
		}
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<Place>(Place.class, this, GoTPackage.GO_T__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Union> getUnion() {
		if (union == null) {
			union = new EObjectContainmentEList<Union>(Union.class, this, GoTPackage.GO_T__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GoTPackage.GO_T__CHARACTER:
			return ((InternalEList<?>) getCharacter()).basicRemove(otherEnd, msgs);
		case GoTPackage.GO_T__HOUSE:
			return ((InternalEList<?>) getHouse()).basicRemove(otherEnd, msgs);
		case GoTPackage.GO_T__SEASON:
			return ((InternalEList<?>) getSeason()).basicRemove(otherEnd, msgs);
		case GoTPackage.GO_T__PLACE:
			return ((InternalEList<?>) getPlace()).basicRemove(otherEnd, msgs);
		case GoTPackage.GO_T__UNION:
			return ((InternalEList<?>) getUnion()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GoTPackage.GO_T__CHARACTER:
			return getCharacter();
		case GoTPackage.GO_T__HOUSE:
			return getHouse();
		case GoTPackage.GO_T__SEASON:
			return getSeason();
		case GoTPackage.GO_T__PLACE:
			return getPlace();
		case GoTPackage.GO_T__UNION:
			return getUnion();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GoTPackage.GO_T__CHARACTER:
			getCharacter().clear();
			getCharacter().addAll((Collection<? extends got.model.GoT.Character>) newValue);
			return;
		case GoTPackage.GO_T__HOUSE:
			getHouse().clear();
			getHouse().addAll((Collection<? extends House>) newValue);
			return;
		case GoTPackage.GO_T__SEASON:
			getSeason().clear();
			getSeason().addAll((Collection<? extends Season>) newValue);
			return;
		case GoTPackage.GO_T__PLACE:
			getPlace().clear();
			getPlace().addAll((Collection<? extends Place>) newValue);
			return;
		case GoTPackage.GO_T__UNION:
			getUnion().clear();
			getUnion().addAll((Collection<? extends Union>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case GoTPackage.GO_T__CHARACTER:
			getCharacter().clear();
			return;
		case GoTPackage.GO_T__HOUSE:
			getHouse().clear();
			return;
		case GoTPackage.GO_T__SEASON:
			getSeason().clear();
			return;
		case GoTPackage.GO_T__PLACE:
			getPlace().clear();
			return;
		case GoTPackage.GO_T__UNION:
			getUnion().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GoTPackage.GO_T__CHARACTER:
			return character != null && !character.isEmpty();
		case GoTPackage.GO_T__HOUSE:
			return house != null && !house.isEmpty();
		case GoTPackage.GO_T__SEASON:
			return season != null && !season.isEmpty();
		case GoTPackage.GO_T__PLACE:
			return place != null && !place.isEmpty();
		case GoTPackage.GO_T__UNION:
			return union != null && !union.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GoTImpl
