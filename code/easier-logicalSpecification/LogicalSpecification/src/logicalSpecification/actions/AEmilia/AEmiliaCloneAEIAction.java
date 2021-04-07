/**
 */
package logicalSpecification.actions.AEmilia;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.Attachment;
import metamodel.mmaemilia.InputInteraction;
import metamodel.mmaemilia.OutputInteraction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone AEI Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getSourceAEI <em>Source AEI</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAEI <em>Cloned AEI</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfInputInteractions <em>List Of Input Interactions</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfOutputInteractions <em>List Of Output Interactions</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getListOfNewAttachments <em>List Of New Attachments</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAeiToCloneSVP <em>Aei To Clone SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAeiSVP <em>Cloned Aei SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOrInteractsMVP <em>All Or Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInLocalInteractsMVP <em>All In Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutLocalInteractsMVP <em>All Out Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllUniInteractsMVP <em>All Uni Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllLocalInteractsMVP <em>All Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllAeisMVP <em>All Aeis MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInRemoteInteractsMVP <em>All In Remote Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutRemoteInteractsMVP <em>All Out Remote Interacts MVP</em>}</li>
 * </ul>
 *
 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction()
 * @model
 * @generated
 */
public interface AEmiliaCloneAEIAction extends AEmiliaAddAction {
	/**
	 * Returns the value of the '<em><b>Source AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source AEI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source AEI</em>' attribute.
	 * @see #setSourceAEI(ArchiElemInstance)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_SourceAEI()
	 * @model dataType="logicalSpecification.actions.AEmilia.ArchiElemInstance" required="true"
	 * @generated
	 */
	ArchiElemInstance getSourceAEI();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getSourceAEI <em>Source AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source AEI</em>' attribute.
	 * @see #getSourceAEI()
	 * @generated
	 */
	void setSourceAEI(ArchiElemInstance value);

	/**
	 * Returns the value of the '<em><b>Cloned AEI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloned AEI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloned AEI</em>' attribute.
	 * @see #setClonedAEI(ArchiElemInstance)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_ClonedAEI()
	 * @model dataType="logicalSpecification.actions.AEmilia.ArchiElemInstance" required="true"
	 * @generated
	 */
	ArchiElemInstance getClonedAEI();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAEI <em>Cloned AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloned AEI</em>' attribute.
	 * @see #getClonedAEI()
	 * @generated
	 */
	void setClonedAEI(ArchiElemInstance value);

	/**
	 * Returns the value of the '<em><b>List Of Input Interactions</b></em>' attribute list.
	 * The list contents are of type {@link metamodel.mmaemilia.InputInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Input Interactions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Input Interactions</em>' attribute list.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_ListOfInputInteractions()
	 * @model dataType="logicalSpecification.actions.AEmilia.InputInteraction"
	 * @generated
	 */
	EList<InputInteraction> getListOfInputInteractions();

	/**
	 * Returns the value of the '<em><b>List Of Output Interactions</b></em>' attribute list.
	 * The list contents are of type {@link metamodel.mmaemilia.OutputInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Output Interactions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Output Interactions</em>' attribute list.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_ListOfOutputInteractions()
	 * @model dataType="logicalSpecification.actions.AEmilia.OutputInteraction"
	 * @generated
	 */
	EList<OutputInteraction> getListOfOutputInteractions();

	/**
	 * Returns the value of the '<em><b>List Of New Attachments</b></em>' attribute list.
	 * The list contents are of type {@link metamodel.mmaemilia.Attachment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of New Attachments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of New Attachments</em>' attribute list.
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_ListOfNewAttachments()
	 * @model dataType="logicalSpecification.actions.AEmilia.Attachment"
	 * @generated
	 */
	EList<Attachment> getListOfNewAttachments();

	/**
	 * Returns the value of the '<em><b>Aei To Clone SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aei To Clone SVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aei To Clone SVP</em>' containment reference.
	 * @see #setAeiToCloneSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AeiToCloneSVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleValuedParameter getAeiToCloneSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAeiToCloneSVP <em>Aei To Clone SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aei To Clone SVP</em>' containment reference.
	 * @see #getAeiToCloneSVP()
	 * @generated
	 */
	void setAeiToCloneSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>Cloned Aei SVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cloned Aei SVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloned Aei SVP</em>' containment reference.
	 * @see #setClonedAeiSVP(SingleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_ClonedAeiSVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleValuedParameter getClonedAeiSVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getClonedAeiSVP <em>Cloned Aei SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloned Aei SVP</em>' containment reference.
	 * @see #getClonedAeiSVP()
	 * @generated
	 */
	void setClonedAeiSVP(SingleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Or Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Or Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Or Interacts MVP</em>' containment reference.
	 * @see #setAllOrInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllOrInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllOrInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOrInteractsMVP <em>All Or Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Or Interacts MVP</em>' containment reference.
	 * @see #getAllOrInteractsMVP()
	 * @generated
	 */
	void setAllOrInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All In Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All In Local Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All In Local Interacts MVP</em>' containment reference.
	 * @see #setAllInLocalInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllInLocalInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllInLocalInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInLocalInteractsMVP <em>All In Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All In Local Interacts MVP</em>' containment reference.
	 * @see #getAllInLocalInteractsMVP()
	 * @generated
	 */
	void setAllInLocalInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Out Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Out Local Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Out Local Interacts MVP</em>' containment reference.
	 * @see #setAllOutLocalInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllOutLocalInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllOutLocalInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutLocalInteractsMVP <em>All Out Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Out Local Interacts MVP</em>' containment reference.
	 * @see #getAllOutLocalInteractsMVP()
	 * @generated
	 */
	void setAllOutLocalInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Uni Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Uni Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Uni Interacts MVP</em>' containment reference.
	 * @see #setAllUniInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllUniInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllUniInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllUniInteractsMVP <em>All Uni Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Uni Interacts MVP</em>' containment reference.
	 * @see #getAllUniInteractsMVP()
	 * @generated
	 */
	void setAllUniInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Local Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Local Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Local Interacts MVP</em>' containment reference.
	 * @see #setAllLocalInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllLocalInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllLocalInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllLocalInteractsMVP <em>All Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Local Interacts MVP</em>' containment reference.
	 * @see #getAllLocalInteractsMVP()
	 * @generated
	 */
	void setAllLocalInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Aeis MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Aeis MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Aeis MVP</em>' containment reference.
	 * @see #setAllAeisMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllAeisMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllAeisMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllAeisMVP <em>All Aeis MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Aeis MVP</em>' containment reference.
	 * @see #getAllAeisMVP()
	 * @generated
	 */
	void setAllAeisMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All In Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All In Remote Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All In Remote Interacts MVP</em>' containment reference.
	 * @see #setAllInRemoteInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllInRemoteInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllInRemoteInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllInRemoteInteractsMVP <em>All In Remote Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All In Remote Interacts MVP</em>' containment reference.
	 * @see #getAllInRemoteInteractsMVP()
	 * @generated
	 */
	void setAllInRemoteInteractsMVP(MultipleValuedParameter value);

	/**
	 * Returns the value of the '<em><b>All Out Remote Interacts MVP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Out Remote Interacts MVP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Out Remote Interacts MVP</em>' containment reference.
	 * @see #setAllOutRemoteInteractsMVP(MultipleValuedParameter)
	 * @see logicalSpecification.actions.AEmilia.AEmiliaPackage#getAEmiliaCloneAEIAction_AllOutRemoteInteractsMVP()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultipleValuedParameter getAllOutRemoteInteractsMVP();

	/**
	 * Sets the value of the '{@link logicalSpecification.actions.AEmilia.AEmiliaCloneAEIAction#getAllOutRemoteInteractsMVP <em>All Out Remote Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Out Remote Interacts MVP</em>' containment reference.
	 * @see #getAllOutRemoteInteractsMVP()
	 * @generated
	 */
	void setAllOutRemoteInteractsMVP(MultipleValuedParameter value);

} // AEmiliaCloneAEIAction
