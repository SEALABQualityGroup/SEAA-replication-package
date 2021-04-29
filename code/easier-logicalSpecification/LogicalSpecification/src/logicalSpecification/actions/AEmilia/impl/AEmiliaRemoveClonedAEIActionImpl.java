/**
 */
package logicalSpecification.actions.AEmilia.impl;

import java.util.Collection;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.AEmilia.AEmiliaPackage;
import logicalSpecification.actions.AEmilia.AEmiliaRemoveClonedAEIAction;

import metamodel.mmaemilia.ArchiElemInstance;
import metamodel.mmaemilia.Attachment;
import metamodel.mmaemilia.InputInteraction;
import metamodel.mmaemilia.OutputInteraction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Cloned AEI Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getSourceAEI <em>Source AEI</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getClonedAEI <em>Cloned AEI</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getListOfInputInteractions <em>List Of Input Interactions</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getListOfOutputInteractions <em>List Of Output Interactions</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getListOfNewAttachments <em>List Of New Attachments</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAeiToCloneSVP <em>Aei To Clone SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getClonedAeiSVP <em>Cloned Aei SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllOrInteractsMVP <em>All Or Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllInLocalInteractsMVP <em>All In Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllOutLocalInteractsMVP <em>All Out Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllUniInteractsMVP <em>All Uni Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllLocalInteractsMVP <em>All Local Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllAeisMVP <em>All Aeis MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllInRemoteInteractsMVP <em>All In Remote Interacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.AEmilia.impl.AEmiliaRemoveClonedAEIActionImpl#getAllOutRemoteInteractsMVP <em>All Out Remote Interacts MVP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AEmiliaRemoveClonedAEIActionImpl extends AEmiliaDeleteActionImpl implements AEmiliaRemoveClonedAEIAction {
	/**
	 * The default value of the '{@link #getSourceAEI() <em>Source AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAEI()
	 * @generated
	 * @ordered
	 */
	protected static final ArchiElemInstance SOURCE_AEI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceAEI() <em>Source AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceAEI()
	 * @generated
	 * @ordered
	 */
	protected ArchiElemInstance sourceAEI = SOURCE_AEI_EDEFAULT;

	/**
	 * The default value of the '{@link #getClonedAEI() <em>Cloned AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClonedAEI()
	 * @generated
	 * @ordered
	 */
	protected static final ArchiElemInstance CLONED_AEI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClonedAEI() <em>Cloned AEI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClonedAEI()
	 * @generated
	 * @ordered
	 */
	protected ArchiElemInstance clonedAEI = CLONED_AEI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getListOfInputInteractions() <em>List Of Input Interactions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfInputInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<InputInteraction> listOfInputInteractions;

	/**
	 * The cached value of the '{@link #getListOfOutputInteractions() <em>List Of Output Interactions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfOutputInteractions()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputInteraction> listOfOutputInteractions;

	/**
	 * The cached value of the '{@link #getListOfNewAttachments() <em>List Of New Attachments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfNewAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> listOfNewAttachments;

	/**
	 * The cached value of the '{@link #getAeiToCloneSVP() <em>Aei To Clone SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeiToCloneSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter aeiToCloneSVP;

	/**
	 * The cached value of the '{@link #getClonedAeiSVP() <em>Cloned Aei SVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClonedAeiSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter clonedAeiSVP;

	/**
	 * The cached value of the '{@link #getAllOrInteractsMVP() <em>All Or Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOrInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allOrInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllInLocalInteractsMVP() <em>All In Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllInLocalInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allInLocalInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllOutLocalInteractsMVP() <em>All Out Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOutLocalInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allOutLocalInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllUniInteractsMVP() <em>All Uni Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllUniInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allUniInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllLocalInteractsMVP() <em>All Local Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllLocalInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allLocalInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllAeisMVP() <em>All Aeis MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAeisMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allAeisMVP;

	/**
	 * The cached value of the '{@link #getAllInRemoteInteractsMVP() <em>All In Remote Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllInRemoteInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allInRemoteInteractsMVP;

	/**
	 * The cached value of the '{@link #getAllOutRemoteInteractsMVP() <em>All Out Remote Interacts MVP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOutRemoteInteractsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allOutRemoteInteractsMVP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AEmiliaRemoveClonedAEIActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AEmiliaPackage.Literals.AEMILIA_REMOVE_CLONED_AEI_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance getSourceAEI() {
		return sourceAEI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceAEI(ArchiElemInstance newSourceAEI) {
		ArchiElemInstance oldSourceAEI = sourceAEI;
		sourceAEI = newSourceAEI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI, oldSourceAEI, sourceAEI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiElemInstance getClonedAEI() {
		return clonedAEI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClonedAEI(ArchiElemInstance newClonedAEI) {
		ArchiElemInstance oldClonedAEI = clonedAEI;
		clonedAEI = newClonedAEI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI, oldClonedAEI, clonedAEI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputInteraction> getListOfInputInteractions() {
		if (listOfInputInteractions == null) {
			listOfInputInteractions = new EDataTypeUniqueEList<InputInteraction>(InputInteraction.class, this, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS);
		}
		return listOfInputInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputInteraction> getListOfOutputInteractions() {
		if (listOfOutputInteractions == null) {
			listOfOutputInteractions = new EDataTypeUniqueEList<OutputInteraction>(OutputInteraction.class, this, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS);
		}
		return listOfOutputInteractions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getListOfNewAttachments() {
		if (listOfNewAttachments == null) {
			listOfNewAttachments = new EDataTypeUniqueEList<Attachment>(Attachment.class, this, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS);
		}
		return listOfNewAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getAeiToCloneSVP() {
		return aeiToCloneSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeiToCloneSVP(SingleValuedParameter newAeiToCloneSVP, NotificationChain msgs) {
		SingleValuedParameter oldAeiToCloneSVP = aeiToCloneSVP;
		aeiToCloneSVP = newAeiToCloneSVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP, oldAeiToCloneSVP, newAeiToCloneSVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAeiToCloneSVP(SingleValuedParameter newAeiToCloneSVP) {
		if (newAeiToCloneSVP != aeiToCloneSVP) {
			NotificationChain msgs = null;
			if (aeiToCloneSVP != null)
				msgs = ((InternalEObject)aeiToCloneSVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP, null, msgs);
			if (newAeiToCloneSVP != null)
				msgs = ((InternalEObject)newAeiToCloneSVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP, null, msgs);
			msgs = basicSetAeiToCloneSVP(newAeiToCloneSVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP, newAeiToCloneSVP, newAeiToCloneSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getClonedAeiSVP() {
		return clonedAeiSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClonedAeiSVP(SingleValuedParameter newClonedAeiSVP, NotificationChain msgs) {
		SingleValuedParameter oldClonedAeiSVP = clonedAeiSVP;
		clonedAeiSVP = newClonedAeiSVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP, oldClonedAeiSVP, newClonedAeiSVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClonedAeiSVP(SingleValuedParameter newClonedAeiSVP) {
		if (newClonedAeiSVP != clonedAeiSVP) {
			NotificationChain msgs = null;
			if (clonedAeiSVP != null)
				msgs = ((InternalEObject)clonedAeiSVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP, null, msgs);
			if (newClonedAeiSVP != null)
				msgs = ((InternalEObject)newClonedAeiSVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP, null, msgs);
			msgs = basicSetClonedAeiSVP(newClonedAeiSVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP, newClonedAeiSVP, newClonedAeiSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllOrInteractsMVP() {
		return allOrInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllOrInteractsMVP(MultipleValuedParameter newAllOrInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllOrInteractsMVP = allOrInteractsMVP;
		allOrInteractsMVP = newAllOrInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP, oldAllOrInteractsMVP, newAllOrInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllOrInteractsMVP(MultipleValuedParameter newAllOrInteractsMVP) {
		if (newAllOrInteractsMVP != allOrInteractsMVP) {
			NotificationChain msgs = null;
			if (allOrInteractsMVP != null)
				msgs = ((InternalEObject)allOrInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP, null, msgs);
			if (newAllOrInteractsMVP != null)
				msgs = ((InternalEObject)newAllOrInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllOrInteractsMVP(newAllOrInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP, newAllOrInteractsMVP, newAllOrInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllInLocalInteractsMVP() {
		return allInLocalInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllInLocalInteractsMVP(MultipleValuedParameter newAllInLocalInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllInLocalInteractsMVP = allInLocalInteractsMVP;
		allInLocalInteractsMVP = newAllInLocalInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP, oldAllInLocalInteractsMVP, newAllInLocalInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllInLocalInteractsMVP(MultipleValuedParameter newAllInLocalInteractsMVP) {
		if (newAllInLocalInteractsMVP != allInLocalInteractsMVP) {
			NotificationChain msgs = null;
			if (allInLocalInteractsMVP != null)
				msgs = ((InternalEObject)allInLocalInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP, null, msgs);
			if (newAllInLocalInteractsMVP != null)
				msgs = ((InternalEObject)newAllInLocalInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllInLocalInteractsMVP(newAllInLocalInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP, newAllInLocalInteractsMVP, newAllInLocalInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllOutLocalInteractsMVP() {
		return allOutLocalInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllOutLocalInteractsMVP(MultipleValuedParameter newAllOutLocalInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllOutLocalInteractsMVP = allOutLocalInteractsMVP;
		allOutLocalInteractsMVP = newAllOutLocalInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP, oldAllOutLocalInteractsMVP, newAllOutLocalInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllOutLocalInteractsMVP(MultipleValuedParameter newAllOutLocalInteractsMVP) {
		if (newAllOutLocalInteractsMVP != allOutLocalInteractsMVP) {
			NotificationChain msgs = null;
			if (allOutLocalInteractsMVP != null)
				msgs = ((InternalEObject)allOutLocalInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP, null, msgs);
			if (newAllOutLocalInteractsMVP != null)
				msgs = ((InternalEObject)newAllOutLocalInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllOutLocalInteractsMVP(newAllOutLocalInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP, newAllOutLocalInteractsMVP, newAllOutLocalInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllUniInteractsMVP() {
		return allUniInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllUniInteractsMVP(MultipleValuedParameter newAllUniInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllUniInteractsMVP = allUniInteractsMVP;
		allUniInteractsMVP = newAllUniInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP, oldAllUniInteractsMVP, newAllUniInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllUniInteractsMVP(MultipleValuedParameter newAllUniInteractsMVP) {
		if (newAllUniInteractsMVP != allUniInteractsMVP) {
			NotificationChain msgs = null;
			if (allUniInteractsMVP != null)
				msgs = ((InternalEObject)allUniInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP, null, msgs);
			if (newAllUniInteractsMVP != null)
				msgs = ((InternalEObject)newAllUniInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllUniInteractsMVP(newAllUniInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP, newAllUniInteractsMVP, newAllUniInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllLocalInteractsMVP() {
		return allLocalInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllLocalInteractsMVP(MultipleValuedParameter newAllLocalInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllLocalInteractsMVP = allLocalInteractsMVP;
		allLocalInteractsMVP = newAllLocalInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP, oldAllLocalInteractsMVP, newAllLocalInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllLocalInteractsMVP(MultipleValuedParameter newAllLocalInteractsMVP) {
		if (newAllLocalInteractsMVP != allLocalInteractsMVP) {
			NotificationChain msgs = null;
			if (allLocalInteractsMVP != null)
				msgs = ((InternalEObject)allLocalInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP, null, msgs);
			if (newAllLocalInteractsMVP != null)
				msgs = ((InternalEObject)newAllLocalInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllLocalInteractsMVP(newAllLocalInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP, newAllLocalInteractsMVP, newAllLocalInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllAeisMVP() {
		return allAeisMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllAeisMVP(MultipleValuedParameter newAllAeisMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllAeisMVP = allAeisMVP;
		allAeisMVP = newAllAeisMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP, oldAllAeisMVP, newAllAeisMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllAeisMVP(MultipleValuedParameter newAllAeisMVP) {
		if (newAllAeisMVP != allAeisMVP) {
			NotificationChain msgs = null;
			if (allAeisMVP != null)
				msgs = ((InternalEObject)allAeisMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP, null, msgs);
			if (newAllAeisMVP != null)
				msgs = ((InternalEObject)newAllAeisMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP, null, msgs);
			msgs = basicSetAllAeisMVP(newAllAeisMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP, newAllAeisMVP, newAllAeisMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllInRemoteInteractsMVP() {
		return allInRemoteInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllInRemoteInteractsMVP(MultipleValuedParameter newAllInRemoteInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllInRemoteInteractsMVP = allInRemoteInteractsMVP;
		allInRemoteInteractsMVP = newAllInRemoteInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP, oldAllInRemoteInteractsMVP, newAllInRemoteInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllInRemoteInteractsMVP(MultipleValuedParameter newAllInRemoteInteractsMVP) {
		if (newAllInRemoteInteractsMVP != allInRemoteInteractsMVP) {
			NotificationChain msgs = null;
			if (allInRemoteInteractsMVP != null)
				msgs = ((InternalEObject)allInRemoteInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP, null, msgs);
			if (newAllInRemoteInteractsMVP != null)
				msgs = ((InternalEObject)newAllInRemoteInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllInRemoteInteractsMVP(newAllInRemoteInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP, newAllInRemoteInteractsMVP, newAllInRemoteInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllOutRemoteInteractsMVP() {
		return allOutRemoteInteractsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllOutRemoteInteractsMVP(MultipleValuedParameter newAllOutRemoteInteractsMVP, NotificationChain msgs) {
		MultipleValuedParameter oldAllOutRemoteInteractsMVP = allOutRemoteInteractsMVP;
		allOutRemoteInteractsMVP = newAllOutRemoteInteractsMVP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP, oldAllOutRemoteInteractsMVP, newAllOutRemoteInteractsMVP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllOutRemoteInteractsMVP(MultipleValuedParameter newAllOutRemoteInteractsMVP) {
		if (newAllOutRemoteInteractsMVP != allOutRemoteInteractsMVP) {
			NotificationChain msgs = null;
			if (allOutRemoteInteractsMVP != null)
				msgs = ((InternalEObject)allOutRemoteInteractsMVP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP, null, msgs);
			if (newAllOutRemoteInteractsMVP != null)
				msgs = ((InternalEObject)newAllOutRemoteInteractsMVP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP, null, msgs);
			msgs = basicSetAllOutRemoteInteractsMVP(newAllOutRemoteInteractsMVP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP, newAllOutRemoteInteractsMVP, newAllOutRemoteInteractsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP:
				return basicSetAeiToCloneSVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP:
				return basicSetClonedAeiSVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP:
				return basicSetAllOrInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP:
				return basicSetAllInLocalInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP:
				return basicSetAllOutLocalInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP:
				return basicSetAllUniInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP:
				return basicSetAllLocalInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP:
				return basicSetAllAeisMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP:
				return basicSetAllInRemoteInteractsMVP(null, msgs);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP:
				return basicSetAllOutRemoteInteractsMVP(null, msgs);
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
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI:
				return getSourceAEI();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI:
				return getClonedAEI();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS:
				return getListOfInputInteractions();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS:
				return getListOfOutputInteractions();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS:
				return getListOfNewAttachments();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP:
				return getAeiToCloneSVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP:
				return getClonedAeiSVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP:
				return getAllOrInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP:
				return getAllInLocalInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP:
				return getAllOutLocalInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP:
				return getAllUniInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP:
				return getAllLocalInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP:
				return getAllAeisMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP:
				return getAllInRemoteInteractsMVP();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP:
				return getAllOutRemoteInteractsMVP();
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
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI:
				setSourceAEI((ArchiElemInstance)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI:
				setClonedAEI((ArchiElemInstance)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS:
				getListOfInputInteractions().clear();
				getListOfInputInteractions().addAll((Collection<? extends InputInteraction>)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS:
				getListOfOutputInteractions().clear();
				getListOfOutputInteractions().addAll((Collection<? extends OutputInteraction>)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS:
				getListOfNewAttachments().clear();
				getListOfNewAttachments().addAll((Collection<? extends Attachment>)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP:
				setAeiToCloneSVP((SingleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP:
				setClonedAeiSVP((SingleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP:
				setAllOrInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP:
				setAllInLocalInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP:
				setAllOutLocalInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP:
				setAllUniInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP:
				setAllLocalInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP:
				setAllAeisMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP:
				setAllInRemoteInteractsMVP((MultipleValuedParameter)newValue);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP:
				setAllOutRemoteInteractsMVP((MultipleValuedParameter)newValue);
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
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI:
				setSourceAEI(SOURCE_AEI_EDEFAULT);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI:
				setClonedAEI(CLONED_AEI_EDEFAULT);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS:
				getListOfInputInteractions().clear();
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS:
				getListOfOutputInteractions().clear();
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS:
				getListOfNewAttachments().clear();
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP:
				setAeiToCloneSVP((SingleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP:
				setClonedAeiSVP((SingleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP:
				setAllOrInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP:
				setAllInLocalInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP:
				setAllOutLocalInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP:
				setAllUniInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP:
				setAllLocalInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP:
				setAllAeisMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP:
				setAllInRemoteInteractsMVP((MultipleValuedParameter)null);
				return;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP:
				setAllOutRemoteInteractsMVP((MultipleValuedParameter)null);
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
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__SOURCE_AEI:
				return SOURCE_AEI_EDEFAULT == null ? sourceAEI != null : !SOURCE_AEI_EDEFAULT.equals(sourceAEI);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI:
				return CLONED_AEI_EDEFAULT == null ? clonedAEI != null : !CLONED_AEI_EDEFAULT.equals(clonedAEI);
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_INPUT_INTERACTIONS:
				return listOfInputInteractions != null && !listOfInputInteractions.isEmpty();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_OUTPUT_INTERACTIONS:
				return listOfOutputInteractions != null && !listOfOutputInteractions.isEmpty();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__LIST_OF_NEW_ATTACHMENTS:
				return listOfNewAttachments != null && !listOfNewAttachments.isEmpty();
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__AEI_TO_CLONE_SVP:
				return aeiToCloneSVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__CLONED_AEI_SVP:
				return clonedAeiSVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OR_INTERACTS_MVP:
				return allOrInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_LOCAL_INTERACTS_MVP:
				return allInLocalInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_LOCAL_INTERACTS_MVP:
				return allOutLocalInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_UNI_INTERACTS_MVP:
				return allUniInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_LOCAL_INTERACTS_MVP:
				return allLocalInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_AEIS_MVP:
				return allAeisMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_IN_REMOTE_INTERACTS_MVP:
				return allInRemoteInteractsMVP != null;
			case AEmiliaPackage.AEMILIA_REMOVE_CLONED_AEI_ACTION__ALL_OUT_REMOTE_INTERACTS_MVP:
				return allOutRemoteInteractsMVP != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sourceAEI: ");
		result.append(sourceAEI);
		result.append(", clonedAEI: ");
		result.append(clonedAEI);
		result.append(", listOfInputInteractions: ");
		result.append(listOfInputInteractions);
		result.append(", listOfOutputInteractions: ");
		result.append(listOfOutputInteractions);
		result.append(", listOfNewAttachments: ");
		result.append(listOfNewAttachments);
		result.append(')');
		return result.toString();
	}

} //AEmiliaRemoveClonedAEIActionImpl
