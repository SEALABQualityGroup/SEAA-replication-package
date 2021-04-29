/**
 */
package logicalSpecification.actions.AEmilia.impl;

import logicalSpecification.actions.AEmilia.*;

import metamodel.mmaemilia.AEmiliaSpecification;
import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.Attachment;
import metamodel.mmaemilia.ElemType;

import metamodel.mmaemilia.Headers.ConstInit;

import metamodel.mmaemilia.InputInteraction;
import metamodel.mmaemilia.OutputInteraction;

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
public class AEmiliaFactoryImpl extends EFactoryImpl implements AEmiliaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AEmiliaFactory init() {
		try {
			AEmiliaFactory theAEmiliaFactory = (AEmiliaFactory)EPackage.Registry.INSTANCE.getEFactory(AEmiliaPackage.eNS_URI);
			if (theAEmiliaFactory != null) {
				return theAEmiliaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AEmiliaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaFactoryImpl() {
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
			case AEmiliaPackage.AEMILIA_CLONE_AEI_ACTION: return createAEmiliaCloneAEIAction();
			case AEmiliaPackage.AEMILIA_CONST_CHANGES_ACTION: return createAEmiliaConstChangesAction();
			case AEmiliaPackage.AEMILIA_CHANGE_ACTION: return createAEmiliaChangeAction();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION: return createAEmiliaRemoveClonedAEIAction();
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
			case AEmiliaPackage.ELEM_TYPE:
				return createElemTypeFromString(eDataType, initialValue);
			case AEmiliaPackage.INPUT_INTERACTION:
				return createInputInteractionFromString(eDataType, initialValue);
			case AEmiliaPackage.ARCHI_ELEM_INSTANCE:
				return createArchiElemInstanceFromString(eDataType, initialValue);
			case AEmiliaPackage.OUTPUT_INTERACTION:
				return createOutputInteractionFromString(eDataType, initialValue);
			case AEmiliaPackage.ATTACHMENT:
				return createAttachmentFromString(eDataType, initialValue);
			case AEmiliaPackage.AEMILIA_SPECIFICATION:
				return createAEmiliaSpecificationFromString(eDataType, initialValue);
			case AEmiliaPackage.CONST_INIT:
				return createConstInitFromString(eDataType, initialValue);
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
			case AEmiliaPackage.ELEM_TYPE:
				return convertElemTypeToString(eDataType, instanceValue);
			case AEmiliaPackage.INPUT_INTERACTION:
				return convertInputInteractionToString(eDataType, instanceValue);
			case AEmiliaPackage.ARCHI_ELEM_INSTANCE:
				return convertArchiElemInstanceToString(eDataType, instanceValue);
			case AEmiliaPackage.OUTPUT_INTERACTION:
				return convertOutputInteractionToString(eDataType, instanceValue);
			case AEmiliaPackage.ATTACHMENT:
				return convertAttachmentToString(eDataType, instanceValue);
			case AEmiliaPackage.AEMILIA_SPECIFICATION:
				return convertAEmiliaSpecificationToString(eDataType, instanceValue);
			case AEmiliaPackage.CONST_INIT:
				return convertConstInitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaCloneAEIAction createAEmiliaCloneAEIAction() {
		AEmiliaCloneAEIActionImpl aEmiliaCloneAEIAction = new AEmiliaCloneAEIActionImpl();
		return aEmiliaCloneAEIAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaConstChangesAction createAEmiliaConstChangesAction() {
		AEmiliaConstChangesActionImpl aEmiliaConstChangesAction = new AEmiliaConstChangesActionImpl();
		return aEmiliaConstChangesAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaChangeAction createAEmiliaChangeAction() {
		AEmiliaChangeActionImpl aEmiliaChangeAction = new AEmiliaChangeActionImpl();
		return aEmiliaChangeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaRemoveClonedAEIAction createAEmiliaRemoveClonedAEIAction() {
		AEmiliaRemoveClonedAEIActionImpl aEmiliaRemoveClonedAEIAction = new AEmiliaRemoveClonedAEIActionImpl();
		return aEmiliaRemoveClonedAEIAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElemType createElemTypeFromString(EDataType eDataType, String initialValue) {
		return (ElemType)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElemTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInteraction createInputInteractionFromString(EDataType eDataType, String initialValue) {
		return (InputInteraction)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputInteractionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance createArchiElemInstanceFromString(EDataType eDataType, String initialValue) {
		return (ArchiElemInstance)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArchiElemInstanceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInteraction createOutputInteractionFromString(EDataType eDataType, String initialValue) {
		return (OutputInteraction)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputInteractionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachmentFromString(EDataType eDataType, String initialValue) {
		return (Attachment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttachmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaSpecification createAEmiliaSpecificationFromString(EDataType eDataType, String initialValue) {
		return (AEmiliaSpecification)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAEmiliaSpecificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstInit createConstInitFromString(EDataType eDataType, String initialValue) {
		return (ConstInit)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstInitToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AEmiliaPackage getAEmiliaPackage() {
		return (AEmiliaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AEmiliaPackage getPackage() {
		return AEmiliaPackage.eINSTANCE;
	}

} //AEmiliaFactoryImpl
