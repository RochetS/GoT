/**
 */
package got.model.GoT.impl;

import got.model.GoT.Episode;
import got.model.GoT.GoTPackage;
import got.model.GoT.House;
import got.model.GoT.MethodCategory;
import got.model.GoT.Place;
import got.model.GoT.Status;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getName <em>Name</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getMethodCategory <em>Method Category</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getDeathPlace <em>Death Place</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getEpisode <em>Episode</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getKilledBy <em>Killed By</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getKilled <em>Killed</em>}</li>
 *   <li>{@link got.model.GoT.impl.CharacterImpl#getAlliegance <em>Alliegance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterImpl extends MinimalEObjectImpl.Container implements got.model.GoT.Character {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.ALIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodCategory() <em>Method Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCategory()
	 * @generated
	 * @ordered
	 */
	protected static final MethodCategory METHOD_CATEGORY_EDEFAULT = MethodCategory.BLADE;

	/**
	 * The cached value of the '{@link #getMethodCategory() <em>Method Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodCategory()
	 * @generated
	 * @ordered
	 */
	protected MethodCategory methodCategory = METHOD_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeathPlace() <em>Death Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeathPlace()
	 * @generated
	 * @ordered
	 */
	protected Place deathPlace;

	/**
	 * The cached value of the '{@link #getEpisode() <em>Episode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisode()
	 * @generated
	 * @ordered
	 */
	protected Episode episode;

	/**
	 * The cached value of the '{@link #getKilledBy() <em>Killed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledBy()
	 * @generated
	 * @ordered
	 */
	protected got.model.GoT.Character killedBy;

	/**
	 * The cached value of the '{@link #getKilled() <em>Killed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilled()
	 * @generated
	 * @ordered
	 */
	protected EList<got.model.GoT.Character> killed;

	/**
	 * The cached value of the '{@link #getAlliegance() <em>Alliegance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlliegance()
	 * @generated
	 * @ordered
	 */
	protected EList<House> alliegance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoTPackage.Literals.CHARACTER;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCategory getMethodCategory() {
		return methodCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodCategory(MethodCategory newMethodCategory) {
		MethodCategory oldMethodCategory = methodCategory;
		methodCategory = newMethodCategory == null ? METHOD_CATEGORY_EDEFAULT : newMethodCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__METHOD_CATEGORY,
					oldMethodCategory, methodCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getDeathPlace() {
		if (deathPlace != null && deathPlace.eIsProxy()) {
			InternalEObject oldDeathPlace = (InternalEObject) deathPlace;
			deathPlace = (Place) eResolveProxy(oldDeathPlace);
			if (deathPlace != oldDeathPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoTPackage.CHARACTER__DEATH_PLACE,
							oldDeathPlace, deathPlace));
			}
		}
		return deathPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetDeathPlace() {
		return deathPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeathPlace(Place newDeathPlace) {
		Place oldDeathPlace = deathPlace;
		deathPlace = newDeathPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__DEATH_PLACE, oldDeathPlace,
					deathPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Episode getEpisode() {
		if (episode != null && episode.eIsProxy()) {
			InternalEObject oldEpisode = (InternalEObject) episode;
			episode = (Episode) eResolveProxy(oldEpisode);
			if (episode != oldEpisode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoTPackage.CHARACTER__EPISODE, oldEpisode,
							episode));
			}
		}
		return episode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Episode basicGetEpisode() {
		return episode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisode(Episode newEpisode) {
		Episode oldEpisode = episode;
		episode = newEpisode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__EPISODE, oldEpisode, episode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character getKilledBy() {
		if (killedBy != null && killedBy.eIsProxy()) {
			InternalEObject oldKilledBy = (InternalEObject) killedBy;
			killedBy = (got.model.GoT.Character) eResolveProxy(oldKilledBy);
			if (killedBy != oldKilledBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoTPackage.CHARACTER__KILLED_BY,
							oldKilledBy, killedBy));
			}
		}
		return killedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character basicGetKilledBy() {
		return killedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKilledBy(got.model.GoT.Character newKilledBy, NotificationChain msgs) {
		got.model.GoT.Character oldKilledBy = killedBy;
		killedBy = newKilledBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GoTPackage.CHARACTER__KILLED_BY, oldKilledBy, newKilledBy);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledBy(got.model.GoT.Character newKilledBy) {
		if (newKilledBy != killedBy) {
			NotificationChain msgs = null;
			if (killedBy != null)
				msgs = ((InternalEObject) killedBy).eInverseRemove(this, GoTPackage.CHARACTER__KILLED,
						got.model.GoT.Character.class, msgs);
			if (newKilledBy != null)
				msgs = ((InternalEObject) newKilledBy).eInverseAdd(this, GoTPackage.CHARACTER__KILLED,
						got.model.GoT.Character.class, msgs);
			msgs = basicSetKilledBy(newKilledBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.CHARACTER__KILLED_BY, newKilledBy,
					newKilledBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<got.model.GoT.Character> getKilled() {
		if (killed == null) {
			killed = new EObjectWithInverseResolvingEList<got.model.GoT.Character>(got.model.GoT.Character.class, this,
					GoTPackage.CHARACTER__KILLED, GoTPackage.CHARACTER__KILLED_BY);
		}
		return killed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<House> getAlliegance() {
		if (alliegance == null) {
			alliegance = new EObjectWithInverseResolvingEList.ManyInverse<House>(House.class, this,
					GoTPackage.CHARACTER__ALLIEGANCE, GoTPackage.HOUSE__FELLOW);
		}
		return alliegance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GoTPackage.CHARACTER__KILLED_BY:
			if (killedBy != null)
				msgs = ((InternalEObject) killedBy).eInverseRemove(this, GoTPackage.CHARACTER__KILLED,
						got.model.GoT.Character.class, msgs);
			return basicSetKilledBy((got.model.GoT.Character) otherEnd, msgs);
		case GoTPackage.CHARACTER__KILLED:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getKilled()).basicAdd(otherEnd, msgs);
		case GoTPackage.CHARACTER__ALLIEGANCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAlliegance()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GoTPackage.CHARACTER__KILLED_BY:
			return basicSetKilledBy(null, msgs);
		case GoTPackage.CHARACTER__KILLED:
			return ((InternalEList<?>) getKilled()).basicRemove(otherEnd, msgs);
		case GoTPackage.CHARACTER__ALLIEGANCE:
			return ((InternalEList<?>) getAlliegance()).basicRemove(otherEnd, msgs);
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
		case GoTPackage.CHARACTER__NAME:
			return getName();
		case GoTPackage.CHARACTER__STATUS:
			return getStatus();
		case GoTPackage.CHARACTER__REASON:
			return getReason();
		case GoTPackage.CHARACTER__METHOD:
			return getMethod();
		case GoTPackage.CHARACTER__METHOD_CATEGORY:
			return getMethodCategory();
		case GoTPackage.CHARACTER__DEATH_PLACE:
			if (resolve)
				return getDeathPlace();
			return basicGetDeathPlace();
		case GoTPackage.CHARACTER__EPISODE:
			if (resolve)
				return getEpisode();
			return basicGetEpisode();
		case GoTPackage.CHARACTER__KILLED_BY:
			if (resolve)
				return getKilledBy();
			return basicGetKilledBy();
		case GoTPackage.CHARACTER__KILLED:
			return getKilled();
		case GoTPackage.CHARACTER__ALLIEGANCE:
			return getAlliegance();
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
		case GoTPackage.CHARACTER__NAME:
			setName((String) newValue);
			return;
		case GoTPackage.CHARACTER__STATUS:
			setStatus((Status) newValue);
			return;
		case GoTPackage.CHARACTER__REASON:
			setReason((String) newValue);
			return;
		case GoTPackage.CHARACTER__METHOD:
			setMethod((String) newValue);
			return;
		case GoTPackage.CHARACTER__METHOD_CATEGORY:
			setMethodCategory((MethodCategory) newValue);
			return;
		case GoTPackage.CHARACTER__DEATH_PLACE:
			setDeathPlace((Place) newValue);
			return;
		case GoTPackage.CHARACTER__EPISODE:
			setEpisode((Episode) newValue);
			return;
		case GoTPackage.CHARACTER__KILLED_BY:
			setKilledBy((got.model.GoT.Character) newValue);
			return;
		case GoTPackage.CHARACTER__KILLED:
			getKilled().clear();
			getKilled().addAll((Collection<? extends got.model.GoT.Character>) newValue);
			return;
		case GoTPackage.CHARACTER__ALLIEGANCE:
			getAlliegance().clear();
			getAlliegance().addAll((Collection<? extends House>) newValue);
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
		case GoTPackage.CHARACTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GoTPackage.CHARACTER__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case GoTPackage.CHARACTER__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case GoTPackage.CHARACTER__METHOD:
			setMethod(METHOD_EDEFAULT);
			return;
		case GoTPackage.CHARACTER__METHOD_CATEGORY:
			setMethodCategory(METHOD_CATEGORY_EDEFAULT);
			return;
		case GoTPackage.CHARACTER__DEATH_PLACE:
			setDeathPlace((Place) null);
			return;
		case GoTPackage.CHARACTER__EPISODE:
			setEpisode((Episode) null);
			return;
		case GoTPackage.CHARACTER__KILLED_BY:
			setKilledBy((got.model.GoT.Character) null);
			return;
		case GoTPackage.CHARACTER__KILLED:
			getKilled().clear();
			return;
		case GoTPackage.CHARACTER__ALLIEGANCE:
			getAlliegance().clear();
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
		case GoTPackage.CHARACTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GoTPackage.CHARACTER__STATUS:
			return status != STATUS_EDEFAULT;
		case GoTPackage.CHARACTER__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case GoTPackage.CHARACTER__METHOD:
			return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
		case GoTPackage.CHARACTER__METHOD_CATEGORY:
			return methodCategory != METHOD_CATEGORY_EDEFAULT;
		case GoTPackage.CHARACTER__DEATH_PLACE:
			return deathPlace != null;
		case GoTPackage.CHARACTER__EPISODE:
			return episode != null;
		case GoTPackage.CHARACTER__KILLED_BY:
			return killedBy != null;
		case GoTPackage.CHARACTER__KILLED:
			return killed != null && !killed.isEmpty();
		case GoTPackage.CHARACTER__ALLIEGANCE:
			return alliegance != null && !alliegance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", reason: ");
		result.append(reason);
		result.append(", method: ");
		result.append(method);
		result.append(", methodCategory: ");
		result.append(methodCategory);
		result.append(')');
		return result.toString();
	}

} //CharacterImpl
