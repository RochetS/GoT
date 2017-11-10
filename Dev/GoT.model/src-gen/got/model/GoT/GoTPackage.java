/**
 */
package got.model.GoT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see got.model.GoT.GoTFactory
 * @model kind="package"
 * @generated
 */
public interface GoTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GoT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/GoT";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GoT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GoTPackage eINSTANCE = got.model.GoT.impl.GoTPackageImpl.init();

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.SeasonImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 0;

	/**
	 * The feature id for the '<em><b>Episode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__EPISODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__NAME = 1;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.CharacterImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__REASON = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__METHOD = 3;

	/**
	 * The feature id for the '<em><b>Method Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__METHOD_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Death Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__DEATH_PLACE = 5;

	/**
	 * The feature id for the '<em><b>Episode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__EPISODE = 6;

	/**
	 * The feature id for the '<em><b>Killed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__KILLED_BY = 7;

	/**
	 * The feature id for the '<em><b>Killed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__KILLED = 8;

	/**
	 * The feature id for the '<em><b>Alliegance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__ALLIEGANCE = 9;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.HouseImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fellow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__FELLOW = 1;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.PlaceImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.EpisodeImpl <em>Episode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.EpisodeImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getEpisode()
	 * @generated
	 */
	int EPISODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Episode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPISODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.GoTImpl <em>Go T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.GoTImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getGoT()
	 * @generated
	 */
	int GO_T = 5;

	/**
	 * The feature id for the '<em><b>Character</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T__CHARACTER = 0;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T__HOUSE = 1;

	/**
	 * The feature id for the '<em><b>Season</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T__SEASON = 2;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T__PLACE = 3;

	/**
	 * The feature id for the '<em><b>Union</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T__UNION = 4;

	/**
	 * The number of structural features of the '<em>Go T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Go T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.impl.UnionImpl <em>Union</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.impl.UnionImpl
	 * @see got.model.GoT.impl.GoTPackageImpl#getUnion()
	 * @generated
	 */
	int UNION = 6;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__KIND = 1;

	/**
	 * The feature id for the '<em><b>First Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__FIRST_CHARACTER = 2;

	/**
	 * The feature id for the '<em><b>Second Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION__SECOND_CHARACTER = 3;

	/**
	 * The number of structural features of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Union</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link got.model.GoT.AllegianceKind <em>Allegiance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.AllegianceKind
	 * @see got.model.GoT.impl.GoTPackageImpl#getAllegianceKind()
	 * @generated
	 */
	int ALLEGIANCE_KIND = 7;

	/**
	 * The meta object id for the '{@link got.model.GoT.MethodCategory <em>Method Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.MethodCategory
	 * @see got.model.GoT.impl.GoTPackageImpl#getMethodCategory()
	 * @generated
	 */
	int METHOD_CATEGORY = 8;

	/**
	 * The meta object id for the '{@link got.model.GoT.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.Status
	 * @see got.model.GoT.impl.GoTPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

	/**
	 * The meta object id for the '{@link got.model.GoT.UnionKind <em>Union Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see got.model.GoT.UnionKind
	 * @see got.model.GoT.impl.GoTPackageImpl#getUnionKind()
	 * @generated
	 */
	int UNION_KIND = 10;

	/**
	 * Returns the meta object for class '{@link got.model.GoT.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see got.model.GoT.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.Season#getEpisode <em>Episode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Episode</em>'.
	 * @see got.model.GoT.Season#getEpisode()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Episode();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Season#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see got.model.GoT.Season#getName()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Name();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see got.model.GoT.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Character#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see got.model.GoT.Character#getName()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Name();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Character#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see got.model.GoT.Character#getStatus()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Status();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Character#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see got.model.GoT.Character#getReason()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Reason();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Character#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see got.model.GoT.Character#getMethod()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_Method();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Character#getMethodCategory <em>Method Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Category</em>'.
	 * @see got.model.GoT.Character#getMethodCategory()
	 * @see #getCharacter()
	 * @generated
	 */
	EAttribute getCharacter_MethodCategory();

	/**
	 * Returns the meta object for the reference '{@link got.model.GoT.Character#getDeathPlace <em>Death Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Death Place</em>'.
	 * @see got.model.GoT.Character#getDeathPlace()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_DeathPlace();

	/**
	 * Returns the meta object for the reference '{@link got.model.GoT.Character#getEpisode <em>Episode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Episode</em>'.
	 * @see got.model.GoT.Character#getEpisode()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_Episode();

	/**
	 * Returns the meta object for the reference '{@link got.model.GoT.Character#getKilledBy <em>Killed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Killed By</em>'.
	 * @see got.model.GoT.Character#getKilledBy()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_KilledBy();

	/**
	 * Returns the meta object for the reference list '{@link got.model.GoT.Character#getKilled <em>Killed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Killed</em>'.
	 * @see got.model.GoT.Character#getKilled()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_Killed();

	/**
	 * Returns the meta object for the reference list '{@link got.model.GoT.Character#getAlliegance <em>Alliegance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alliegance</em>'.
	 * @see got.model.GoT.Character#getAlliegance()
	 * @see #getCharacter()
	 * @generated
	 */
	EReference getCharacter_Alliegance();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see got.model.GoT.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.House#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see got.model.GoT.House#getName()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Name();

	/**
	 * Returns the meta object for the reference list '{@link got.model.GoT.House#getFellow <em>Fellow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fellow</em>'.
	 * @see got.model.GoT.House#getFellow()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Fellow();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see got.model.GoT.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see got.model.GoT.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.Episode <em>Episode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Episode</em>'.
	 * @see got.model.GoT.Episode
	 * @generated
	 */
	EClass getEpisode();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Episode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see got.model.GoT.Episode#getName()
	 * @see #getEpisode()
	 * @generated
	 */
	EAttribute getEpisode_Name();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.GoT <em>Go T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go T</em>'.
	 * @see got.model.GoT.GoT
	 * @generated
	 */
	EClass getGoT();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.GoT#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Character</em>'.
	 * @see got.model.GoT.GoT#getCharacter()
	 * @see #getGoT()
	 * @generated
	 */
	EReference getGoT_Character();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.GoT#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>House</em>'.
	 * @see got.model.GoT.GoT#getHouse()
	 * @see #getGoT()
	 * @generated
	 */
	EReference getGoT_House();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.GoT#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Season</em>'.
	 * @see got.model.GoT.GoT#getSeason()
	 * @see #getGoT()
	 * @generated
	 */
	EReference getGoT_Season();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.GoT#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see got.model.GoT.GoT#getPlace()
	 * @see #getGoT()
	 * @generated
	 */
	EReference getGoT_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link got.model.GoT.GoT#getUnion <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Union</em>'.
	 * @see got.model.GoT.GoT#getUnion()
	 * @see #getGoT()
	 * @generated
	 */
	EReference getGoT_Union();

	/**
	 * Returns the meta object for class '{@link got.model.GoT.Union <em>Union</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union</em>'.
	 * @see got.model.GoT.Union
	 * @generated
	 */
	EClass getUnion();

	/**
	 * Returns the meta object for the reference list '{@link got.model.GoT.Union#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see got.model.GoT.Union#getChild()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_Child();

	/**
	 * Returns the meta object for the attribute '{@link got.model.GoT.Union#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see got.model.GoT.Union#getKind()
	 * @see #getUnion()
	 * @generated
	 */
	EAttribute getUnion_Kind();

	/**
	 * Returns the meta object for the reference '{@link got.model.GoT.Union#getFirstCharacter <em>First Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Character</em>'.
	 * @see got.model.GoT.Union#getFirstCharacter()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_FirstCharacter();

	/**
	 * Returns the meta object for the reference '{@link got.model.GoT.Union#getSecondCharacter <em>Second Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Character</em>'.
	 * @see got.model.GoT.Union#getSecondCharacter()
	 * @see #getUnion()
	 * @generated
	 */
	EReference getUnion_SecondCharacter();

	/**
	 * Returns the meta object for enum '{@link got.model.GoT.AllegianceKind <em>Allegiance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Allegiance Kind</em>'.
	 * @see got.model.GoT.AllegianceKind
	 * @generated
	 */
	EEnum getAllegianceKind();

	/**
	 * Returns the meta object for enum '{@link got.model.GoT.MethodCategory <em>Method Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Category</em>'.
	 * @see got.model.GoT.MethodCategory
	 * @generated
	 */
	EEnum getMethodCategory();

	/**
	 * Returns the meta object for enum '{@link got.model.GoT.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see got.model.GoT.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link got.model.GoT.UnionKind <em>Union Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Union Kind</em>'.
	 * @see got.model.GoT.UnionKind
	 * @generated
	 */
	EEnum getUnionKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GoTFactory getGoTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.SeasonImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Episode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__EPISODE = eINSTANCE.getSeason_Episode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__NAME = eINSTANCE.getSeason_Name();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.CharacterImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__NAME = eINSTANCE.getCharacter_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__STATUS = eINSTANCE.getCharacter_Status();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__REASON = eINSTANCE.getCharacter_Reason();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__METHOD = eINSTANCE.getCharacter_Method();

		/**
		 * The meta object literal for the '<em><b>Method Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER__METHOD_CATEGORY = eINSTANCE.getCharacter_MethodCategory();

		/**
		 * The meta object literal for the '<em><b>Death Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__DEATH_PLACE = eINSTANCE.getCharacter_DeathPlace();

		/**
		 * The meta object literal for the '<em><b>Episode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__EPISODE = eINSTANCE.getCharacter_Episode();

		/**
		 * The meta object literal for the '<em><b>Killed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__KILLED_BY = eINSTANCE.getCharacter_KilledBy();

		/**
		 * The meta object literal for the '<em><b>Killed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__KILLED = eINSTANCE.getCharacter_Killed();

		/**
		 * The meta object literal for the '<em><b>Alliegance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTER__ALLIEGANCE = eINSTANCE.getCharacter_Alliegance();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.HouseImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__NAME = eINSTANCE.getHouse_Name();

		/**
		 * The meta object literal for the '<em><b>Fellow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__FELLOW = eINSTANCE.getHouse_Fellow();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.PlaceImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.EpisodeImpl <em>Episode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.EpisodeImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getEpisode()
		 * @generated
		 */
		EClass EPISODE = eINSTANCE.getEpisode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPISODE__NAME = eINSTANCE.getEpisode_Name();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.GoTImpl <em>Go T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.GoTImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getGoT()
		 * @generated
		 */
		EClass GO_T = eINSTANCE.getGoT();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_T__CHARACTER = eINSTANCE.getGoT_Character();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_T__HOUSE = eINSTANCE.getGoT_House();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_T__SEASON = eINSTANCE.getGoT_Season();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_T__PLACE = eINSTANCE.getGoT_Place();

		/**
		 * The meta object literal for the '<em><b>Union</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_T__UNION = eINSTANCE.getGoT_Union();

		/**
		 * The meta object literal for the '{@link got.model.GoT.impl.UnionImpl <em>Union</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.impl.UnionImpl
		 * @see got.model.GoT.impl.GoTPackageImpl#getUnion()
		 * @generated
		 */
		EClass UNION = eINSTANCE.getUnion();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__CHILD = eINSTANCE.getUnion_Child();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNION__KIND = eINSTANCE.getUnion_Kind();

		/**
		 * The meta object literal for the '<em><b>First Character</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__FIRST_CHARACTER = eINSTANCE.getUnion_FirstCharacter();

		/**
		 * The meta object literal for the '<em><b>Second Character</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNION__SECOND_CHARACTER = eINSTANCE.getUnion_SecondCharacter();

		/**
		 * The meta object literal for the '{@link got.model.GoT.AllegianceKind <em>Allegiance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.AllegianceKind
		 * @see got.model.GoT.impl.GoTPackageImpl#getAllegianceKind()
		 * @generated
		 */
		EEnum ALLEGIANCE_KIND = eINSTANCE.getAllegianceKind();

		/**
		 * The meta object literal for the '{@link got.model.GoT.MethodCategory <em>Method Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.MethodCategory
		 * @see got.model.GoT.impl.GoTPackageImpl#getMethodCategory()
		 * @generated
		 */
		EEnum METHOD_CATEGORY = eINSTANCE.getMethodCategory();

		/**
		 * The meta object literal for the '{@link got.model.GoT.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.Status
		 * @see got.model.GoT.impl.GoTPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link got.model.GoT.UnionKind <em>Union Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see got.model.GoT.UnionKind
		 * @see got.model.GoT.impl.GoTPackageImpl#getUnionKind()
		 * @generated
		 */
		EEnum UNION_KIND = eINSTANCE.getUnionKind();

	}

} //GoTPackage
