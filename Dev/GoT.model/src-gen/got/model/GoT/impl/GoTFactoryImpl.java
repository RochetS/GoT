/**
 */
package got.model.GoT.impl;

import got.model.GoT.AllegianceKind;
import got.model.GoT.Episode;
import got.model.GoT.GoT;
import got.model.GoT.GoTFactory;
import got.model.GoT.GoTPackage;
import got.model.GoT.House;
import got.model.GoT.MethodCategory;
import got.model.GoT.Place;
import got.model.GoT.Season;
import got.model.GoT.Status;
import got.model.GoT.Union;
import got.model.GoT.UnionKind;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoTFactoryImpl extends EFactoryImpl implements GoTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GoTFactory init() {
		try {
			GoTFactory theGoTFactory = (GoTFactory) EPackage.Registry.INSTANCE.getEFactory(GoTPackage.eNS_URI);
			if (theGoTFactory != null) {
				return theGoTFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GoTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case GoTPackage.SEASON:
			return createSeason();
		case GoTPackage.CHARACTER:
			return createCharacter();
		case GoTPackage.HOUSE:
			return createHouse();
		case GoTPackage.PLACE:
			return createPlace();
		case GoTPackage.EPISODE:
			return createEpisode();
		case GoTPackage.GO_T:
			return createGoT();
		case GoTPackage.UNION:
			return createUnion();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case GoTPackage.ALLEGIANCE_KIND:
			return createAllegianceKindFromString(eDataType, initialValue);
		case GoTPackage.METHOD_CATEGORY:
			return createMethodCategoryFromString(eDataType, initialValue);
		case GoTPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		case GoTPackage.UNION_KIND:
			return createUnionKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case GoTPackage.ALLEGIANCE_KIND:
			return convertAllegianceKindToString(eDataType, instanceValue);
		case GoTPackage.METHOD_CATEGORY:
			return convertMethodCategoryToString(eDataType, instanceValue);
		case GoTPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		case GoTPackage.UNION_KIND:
			return convertUnionKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public got.model.GoT.Character createCharacter() {
		CharacterImpl character = new CharacterImpl();
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Episode createEpisode() {
		EpisodeImpl episode = new EpisodeImpl();
		return episode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoT createGoT() {
		GoTImpl goT = new GoTImpl();
		return goT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllegianceKind createAllegianceKindFromString(EDataType eDataType, String initialValue) {
		AllegianceKind result = AllegianceKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAllegianceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCategory createMethodCategoryFromString(EDataType eDataType, String initialValue) {
		MethodCategory result = MethodCategory.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionKind createUnionKindFromString(EDataType eDataType, String initialValue) {
		UnionKind result = UnionKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTPackage getGoTPackage() {
		return (GoTPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GoTPackage getPackage() {
		return GoTPackage.eINSTANCE;
	}

} //GoTFactoryImpl
