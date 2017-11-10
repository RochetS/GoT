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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoTPackageImpl extends EPackageImpl implements GoTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allegianceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see got.model.GoT.GoTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GoTPackageImpl() {
		super(eNS_URI, GoTFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GoTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GoTPackage init() {
		if (isInited)
			return (GoTPackage) EPackage.Registry.INSTANCE.getEPackage(GoTPackage.eNS_URI);

		// Obtain or create and register package
		GoTPackageImpl theGoTPackage = (GoTPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GoTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GoTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGoTPackage.createPackageContents();

		// Initialize created meta-data
		theGoTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGoTPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GoTPackage.eNS_URI, theGoTPackage);
		return theGoTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeason() {
		return seasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeason_Episode() {
		return (EReference) seasonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeason_Name() {
		return (EAttribute) seasonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacter() {
		return characterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Name() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Status() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Reason() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_Method() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacter_MethodCategory() {
		return (EAttribute) characterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_DeathPlace() {
		return (EReference) characterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_Episode() {
		return (EReference) characterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_KilledBy() {
		return (EReference) characterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_Killed() {
		return (EReference) characterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCharacter_Alliegance() {
		return (EReference) characterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouse() {
		return houseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouse_Name() {
		return (EAttribute) houseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouse_Fellow() {
		return (EReference) houseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Name() {
		return (EAttribute) placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisode() {
		return episodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpisode_Name() {
		return (EAttribute) episodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoT() {
		return goTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoT_Character() {
		return (EReference) goTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoT_House() {
		return (EReference) goTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoT_Season() {
		return (EReference) goTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoT_Place() {
		return (EReference) goTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoT_Union() {
		return (EReference) goTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_Child() {
		return (EReference) unionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnion_Kind() {
		return (EAttribute) unionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_FirstCharacter() {
		return (EReference) unionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnion_SecondCharacter() {
		return (EReference) unionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllegianceKind() {
		return allegianceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethodCategory() {
		return methodCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnionKind() {
		return unionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTFactory getGoTFactory() {
		return (GoTFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		seasonEClass = createEClass(SEASON);
		createEReference(seasonEClass, SEASON__EPISODE);
		createEAttribute(seasonEClass, SEASON__NAME);

		characterEClass = createEClass(CHARACTER);
		createEAttribute(characterEClass, CHARACTER__NAME);
		createEAttribute(characterEClass, CHARACTER__STATUS);
		createEAttribute(characterEClass, CHARACTER__REASON);
		createEAttribute(characterEClass, CHARACTER__METHOD);
		createEAttribute(characterEClass, CHARACTER__METHOD_CATEGORY);
		createEReference(characterEClass, CHARACTER__DEATH_PLACE);
		createEReference(characterEClass, CHARACTER__EPISODE);
		createEReference(characterEClass, CHARACTER__KILLED_BY);
		createEReference(characterEClass, CHARACTER__KILLED);
		createEReference(characterEClass, CHARACTER__ALLIEGANCE);

		houseEClass = createEClass(HOUSE);
		createEAttribute(houseEClass, HOUSE__NAME);
		createEReference(houseEClass, HOUSE__FELLOW);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__NAME);

		episodeEClass = createEClass(EPISODE);
		createEAttribute(episodeEClass, EPISODE__NAME);

		goTEClass = createEClass(GO_T);
		createEReference(goTEClass, GO_T__CHARACTER);
		createEReference(goTEClass, GO_T__HOUSE);
		createEReference(goTEClass, GO_T__SEASON);
		createEReference(goTEClass, GO_T__PLACE);
		createEReference(goTEClass, GO_T__UNION);

		unionEClass = createEClass(UNION);
		createEReference(unionEClass, UNION__CHILD);
		createEAttribute(unionEClass, UNION__KIND);
		createEReference(unionEClass, UNION__FIRST_CHARACTER);
		createEReference(unionEClass, UNION__SECOND_CHARACTER);

		// Create enums
		allegianceKindEEnum = createEEnum(ALLEGIANCE_KIND);
		methodCategoryEEnum = createEEnum(METHOD_CATEGORY);
		statusEEnum = createEEnum(STATUS);
		unionKindEEnum = createEEnum(UNION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(seasonEClass, Season.class, "Season", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeason_Episode(), this.getEpisode(), null, "episode", null, 0, -1, Season.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeason_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Season.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterEClass, got.model.GoT.Character.class, "Character", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_Status(), this.getStatus(), "status", null, 0, 1, got.model.GoT.Character.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_Reason(), theXMLTypePackage.getString(), "reason", null, 0, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_Method(), theXMLTypePackage.getString(), "method", null, 0, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacter_MethodCategory(), this.getMethodCategory(), "methodCategory", null, 0, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacter_DeathPlace(), this.getPlace(), null, "deathPlace", null, 0, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacter_Episode(), this.getEpisode(), null, "episode", null, 1, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacter_KilledBy(), this.getCharacter(), this.getCharacter_Killed(), "killedBy", null, 0, 1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacter_Killed(), this.getCharacter(), this.getCharacter_KilledBy(), "killed", null, 0, -1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCharacter_Alliegance(), this.getHouse(), this.getHouse_Fellow(), "alliegance", null, 0, -1,
				got.model.GoT.Character.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseEClass, House.class, "House", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouse_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, House.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHouse_Fellow(), this.getCharacter(), this.getCharacter_Alliegance(), "fellow", null, 0, -1,
				House.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Place.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(episodeEClass, Episode.class, "Episode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpisode_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Episode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goTEClass, GoT.class, "GoT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoT_Character(), this.getCharacter(), null, "character", null, 0, -1, GoT.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoT_House(), this.getHouse(), null, "house", null, 0, -1, GoT.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGoT_Season(), this.getSeason(), null, "season", null, 0, -1, GoT.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGoT_Place(), this.getPlace(), null, "place", null, 0, -1, GoT.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGoT_Union(), this.getUnion(), null, "union", null, 0, -1, GoT.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnion_Child(), this.getCharacter(), null, "child", null, 0, -1, Union.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUnion_Kind(), this.getUnionKind(), "kind", null, 0, 1, Union.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_FirstCharacter(), this.getCharacter(), null, "firstCharacter", null, 1, 1, Union.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnion_SecondCharacter(), this.getCharacter(), null, "secondCharacter", null, 1, 1,
				Union.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(allegianceKindEEnum, AllegianceKind.class, "AllegianceKind");
		addEEnumLiteral(allegianceKindEEnum, AllegianceKind.BIRTH);
		addEEnumLiteral(allegianceKindEEnum, AllegianceKind.MARRIAGE);
		addEEnumLiteral(allegianceKindEEnum, AllegianceKind.PLEDGE);
		addEEnumLiteral(allegianceKindEEnum, AllegianceKind.OATH);

		initEEnum(methodCategoryEEnum, MethodCategory.class, "MethodCategory");
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.BLADE);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.FIRE_BURNING);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.ANIMAL);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.HOUSEHOLD_ITEM);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.UNKNOWN);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.MAGIC);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.OTHER);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.ARROW);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.POISON);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.SPEAR);
		addEEnumLiteral(methodCategoryEEnum, MethodCategory.HANDS);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.ALIVE);
		addEEnumLiteral(statusEEnum, Status.DECEASED);

		initEEnum(unionKindEEnum, UnionKind.class, "UnionKind");
		addEEnumLiteral(unionKindEEnum, UnionKind.MARRIAGE);
		addEEnumLiteral(unionKindEEnum, UnionKind.LOVE);

		// Create resource
		createResource(eNS_URI);
	}

} //GoTPackageImpl
