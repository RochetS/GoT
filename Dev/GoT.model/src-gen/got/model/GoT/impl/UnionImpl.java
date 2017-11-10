/**
 */
package got.model.GoT.impl;

import got.model.GoT.GoTPackage;
import got.model.GoT.Union;
import got.model.GoT.UnionKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.impl.UnionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link got.model.GoT.impl.UnionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link got.model.GoT.impl.UnionImpl#getFirstCharacter <em>First Character</em>}</li>
 *   <li>{@link got.model.GoT.impl.UnionImpl#getSecondCharacter <em>Second Character</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnionImpl extends MinimalEObjectImpl.Container implements Union {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<got.model.GoT.Character> child;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final UnionKind KIND_EDEFAULT = UnionKind.MARRIAGE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected UnionKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFirstCharacter() <em>First Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstCharacter()
	 * @generated
	 * @ordered
	 */
	protected got.model.GoT.Character firstCharacter;

	/**
	 * The cached value of the '{@link #getSecondCharacter() <em>Second Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondCharacter()
	 * @generated
	 * @ordered
	 */
	protected got.model.GoT.Character secondCharacter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GoTPackage.Literals.UNION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<got.model.GoT.Character> getChild() {
		if (child == null) {
			child = new EObjectResolvingEList<got.model.GoT.Character>(got.model.GoT.Character.class, this,
					GoTPackage.UNION__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(UnionKind newKind) {
		UnionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.UNION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character getFirstCharacter() {
		if (firstCharacter != null && firstCharacter.eIsProxy()) {
			InternalEObject oldFirstCharacter = (InternalEObject) firstCharacter;
			firstCharacter = (got.model.GoT.Character) eResolveProxy(oldFirstCharacter);
			if (firstCharacter != oldFirstCharacter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoTPackage.UNION__FIRST_CHARACTER,
							oldFirstCharacter, firstCharacter));
			}
		}
		return firstCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character basicGetFirstCharacter() {
		return firstCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstCharacter(got.model.GoT.Character newFirstCharacter) {
		got.model.GoT.Character oldFirstCharacter = firstCharacter;
		firstCharacter = newFirstCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.UNION__FIRST_CHARACTER, oldFirstCharacter,
					firstCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character getSecondCharacter() {
		if (secondCharacter != null && secondCharacter.eIsProxy()) {
			InternalEObject oldSecondCharacter = (InternalEObject) secondCharacter;
			secondCharacter = (got.model.GoT.Character) eResolveProxy(oldSecondCharacter);
			if (secondCharacter != oldSecondCharacter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GoTPackage.UNION__SECOND_CHARACTER,
							oldSecondCharacter, secondCharacter));
			}
		}
		return secondCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character basicGetSecondCharacter() {
		return secondCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondCharacter(got.model.GoT.Character newSecondCharacter) {
		got.model.GoT.Character oldSecondCharacter = secondCharacter;
		secondCharacter = newSecondCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GoTPackage.UNION__SECOND_CHARACTER,
					oldSecondCharacter, secondCharacter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GoTPackage.UNION__CHILD:
			return getChild();
		case GoTPackage.UNION__KIND:
			return getKind();
		case GoTPackage.UNION__FIRST_CHARACTER:
			if (resolve)
				return getFirstCharacter();
			return basicGetFirstCharacter();
		case GoTPackage.UNION__SECOND_CHARACTER:
			if (resolve)
				return getSecondCharacter();
			return basicGetSecondCharacter();
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
		case GoTPackage.UNION__CHILD:
			getChild().clear();
			getChild().addAll((Collection<? extends got.model.GoT.Character>) newValue);
			return;
		case GoTPackage.UNION__KIND:
			setKind((UnionKind) newValue);
			return;
		case GoTPackage.UNION__FIRST_CHARACTER:
			setFirstCharacter((got.model.GoT.Character) newValue);
			return;
		case GoTPackage.UNION__SECOND_CHARACTER:
			setSecondCharacter((got.model.GoT.Character) newValue);
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
		case GoTPackage.UNION__CHILD:
			getChild().clear();
			return;
		case GoTPackage.UNION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case GoTPackage.UNION__FIRST_CHARACTER:
			setFirstCharacter((got.model.GoT.Character) null);
			return;
		case GoTPackage.UNION__SECOND_CHARACTER:
			setSecondCharacter((got.model.GoT.Character) null);
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
		case GoTPackage.UNION__CHILD:
			return child != null && !child.isEmpty();
		case GoTPackage.UNION__KIND:
			return kind != KIND_EDEFAULT;
		case GoTPackage.UNION__FIRST_CHARACTER:
			return firstCharacter != null;
		case GoTPackage.UNION__SECOND_CHARACTER:
			return secondCharacter != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //UnionImpl
