/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.actions.UML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UMLFactoryImpl extends EFactoryImpl implements UMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UMLFactory init() {
		try {
			UMLFactory theUMLFactory = (UMLFactory)EPackage.Registry.INSTANCE.getEFactory(UMLPackage.eNS_URI);
			if (theUMLFactory != null) {
				return theUMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLFactoryImpl() {
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
			case UMLPackage.UML_ADD_NODE_ACTION: return createUMLAddNodeAction();
			case UMLPackage.UML_ADD_COMPONENT_ACTION: return createUMLAddComponentAction();
			case UMLPackage.UML_ADD_OPERATION_ACTION: return createUMLAddOperationAction();
			case UMLPackage.UML_DELETE_NODE_ACTION: return createUMLDeleteNodeAction();
			case UMLPackage.UML_DELETE_COMPONENT_ACTION: return createUMLDeleteComponentAction();
			case UMLPackage.UML_DELETE_OPERATION_ACTION: return createUMLDeleteOperationAction();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION: return createUMLMoveComponentAction();
			case UMLPackage.UML_MOVE_OPERATION_ACTION: return createUMLMoveOperationAction();
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
			case UMLPackage.COMPONENT:
				return createComponentFromString(eDataType, initialValue);
			case UMLPackage.NODE:
				return createNodeFromString(eDataType, initialValue);
			case UMLPackage.PACKAGE:
				return createPackageFromString(eDataType, initialValue);
			case UMLPackage.OPERATION:
				return createOperationFromString(eDataType, initialValue);
			case UMLPackage.ARTIFACT:
				return createArtifactFromString(eDataType, initialValue);
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
			case UMLPackage.COMPONENT:
				return convertComponentToString(eDataType, instanceValue);
			case UMLPackage.NODE:
				return convertNodeToString(eDataType, instanceValue);
			case UMLPackage.PACKAGE:
				return convertPackageToString(eDataType, instanceValue);
			case UMLPackage.OPERATION:
				return convertOperationToString(eDataType, instanceValue);
			case UMLPackage.ARTIFACT:
				return convertArtifactToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAddNodeAction createUMLAddNodeAction() {
		UMLAddNodeActionImpl umlAddNodeAction = new UMLAddNodeActionImpl();
		return umlAddNodeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAddComponentAction createUMLAddComponentAction() {
		UMLAddComponentActionImpl umlAddComponentAction = new UMLAddComponentActionImpl();
		return umlAddComponentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLAddOperationAction createUMLAddOperationAction() {
		UMLAddOperationActionImpl umlAddOperationAction = new UMLAddOperationActionImpl();
		return umlAddOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDeleteNodeAction createUMLDeleteNodeAction() {
		UMLDeleteNodeActionImpl umlDeleteNodeAction = new UMLDeleteNodeActionImpl();
		return umlDeleteNodeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDeleteComponentAction createUMLDeleteComponentAction() {
		UMLDeleteComponentActionImpl umlDeleteComponentAction = new UMLDeleteComponentActionImpl();
		return umlDeleteComponentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLDeleteOperationAction createUMLDeleteOperationAction() {
		UMLDeleteOperationActionImpl umlDeleteOperationAction = new UMLDeleteOperationActionImpl();
		return umlDeleteOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLMoveComponentAction createUMLMoveComponentAction() {
		UMLMoveComponentActionImpl umlMoveComponentAction = new UMLMoveComponentActionImpl();
		return umlMoveComponentAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLMoveOperationAction createUMLMoveOperationAction() {
		UMLMoveOperationActionImpl umlMoveOperationAction = new UMLMoveOperationActionImpl();
		return umlMoveOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponentFromString(EDataType eDataType, String initialValue) {
		return (Component)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNodeFromString(EDataType eDataType, String initialValue) {
		return (Node)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package createPackageFromString(EDataType eDataType, String initialValue) {
		return (org.eclipse.uml2.uml.Package)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPackageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperationFromString(EDataType eDataType, String initialValue) {
		return (Operation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifactFromString(EDataType eDataType, String initialValue) {
		return (Artifact)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLPackage getUMLPackage() {
		return (UMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLPackage getPackage() {
		return UMLPackage.eINSTANCE;
	}

} //UMLFactoryImpl
