/**
 */
package logicalSpecification.actions.UML.impl;

import java.util.Collection;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLMoveComponentAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Component Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getCompToMoveSVP <em>Comp To Move SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getTargetNodesMVP <em>Target Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getAllArtifactsMVP <em>All Artifacts MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getAllTargetsMVP <em>All Targets MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getUmlCompToMove <em>Uml Comp To Move</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getUmlTargetNodes <em>Uml Target Nodes</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveComponentActionImpl#getUmlArtifacts <em>Uml Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLMoveComponentActionImpl extends UMLMoveActionImpl implements UMLMoveComponentAction {
	/**
	 * The cached value of the '{@link #getCompToMoveSVP() <em>Comp To Move SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompToMoveSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter compToMoveSVP;

	/**
	 * The cached value of the '{@link #getTargetNodesMVP() <em>Target Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodesMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter targetNodesMVP;

	/**
	 * The cached value of the '{@link #getAllArtifactsMVP() <em>All Artifacts MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllArtifactsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allArtifactsMVP;

	/**
	 * The cached value of the '{@link #getAllCompsMVP() <em>All Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllCompsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allCompsMVP;

	/**
	 * The cached value of the '{@link #getAllTargetsMVP() <em>All Targets MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTargetsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allTargetsMVP;

	/**
	 * The cached value of the '{@link #getAllNodesMVP() <em>All Nodes MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllNodesMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allNodesMVP;

	/**
	 * The cached value of the '{@link #getAllDeployedElemsMVP() <em>All Deployed Elems MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllDeployedElemsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allDeployedElemsMVP;

	/**
	 * The default value of the '{@link #getUmlCompToMove() <em>Uml Comp To Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToMove()
	 * @generated
	 * @ordered
	 */
	protected static final Component UML_COMP_TO_MOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlCompToMove() <em>Uml Comp To Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToMove()
	 * @generated
	 * @ordered
	 */
	protected Component umlCompToMove = UML_COMP_TO_MOVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUmlTargetNodes() <em>Uml Target Nodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlTargetNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> umlTargetNodes;

	/**
	 * The cached value of the '{@link #getUmlArtifacts() <em>Uml Artifacts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> umlArtifacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLMoveComponentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_MOVE_COMPONENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getCompToMoveSVP() {
		if (compToMoveSVP != null && compToMoveSVP.eIsProxy()) {
			InternalEObject oldCompToMoveSVP = (InternalEObject)compToMoveSVP;
			compToMoveSVP = (SingleValuedParameter)eResolveProxy(oldCompToMoveSVP);
			if (compToMoveSVP != oldCompToMoveSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP, oldCompToMoveSVP, compToMoveSVP));
			}
		}
		return compToMoveSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetCompToMoveSVP() {
		return compToMoveSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompToMoveSVP(SingleValuedParameter newCompToMoveSVP) {
		SingleValuedParameter oldCompToMoveSVP = compToMoveSVP;
		compToMoveSVP = newCompToMoveSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP, oldCompToMoveSVP, compToMoveSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getTargetNodesMVP() {
		if (targetNodesMVP != null && targetNodesMVP.eIsProxy()) {
			InternalEObject oldTargetNodesMVP = (InternalEObject)targetNodesMVP;
			targetNodesMVP = (MultipleValuedParameter)eResolveProxy(oldTargetNodesMVP);
			if (targetNodesMVP != oldTargetNodesMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP, oldTargetNodesMVP, targetNodesMVP));
			}
		}
		return targetNodesMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetTargetNodesMVP() {
		return targetNodesMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNodesMVP(MultipleValuedParameter newTargetNodesMVP) {
		MultipleValuedParameter oldTargetNodesMVP = targetNodesMVP;
		targetNodesMVP = newTargetNodesMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP, oldTargetNodesMVP, targetNodesMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllArtifactsMVP() {
		if (allArtifactsMVP != null && allArtifactsMVP.eIsProxy()) {
			InternalEObject oldAllArtifactsMVP = (InternalEObject)allArtifactsMVP;
			allArtifactsMVP = (MultipleValuedParameter)eResolveProxy(oldAllArtifactsMVP);
			if (allArtifactsMVP != oldAllArtifactsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP, oldAllArtifactsMVP, allArtifactsMVP));
			}
		}
		return allArtifactsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllArtifactsMVP() {
		return allArtifactsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllArtifactsMVP(MultipleValuedParameter newAllArtifactsMVP) {
		MultipleValuedParameter oldAllArtifactsMVP = allArtifactsMVP;
		allArtifactsMVP = newAllArtifactsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP, oldAllArtifactsMVP, allArtifactsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllCompsMVP() {
		if (allCompsMVP != null && allCompsMVP.eIsProxy()) {
			InternalEObject oldAllCompsMVP = (InternalEObject)allCompsMVP;
			allCompsMVP = (MultipleValuedParameter)eResolveProxy(oldAllCompsMVP);
			if (allCompsMVP != oldAllCompsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
			}
		}
		return allCompsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllCompsMVP() {
		return allCompsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllCompsMVP(MultipleValuedParameter newAllCompsMVP) {
		MultipleValuedParameter oldAllCompsMVP = allCompsMVP;
		allCompsMVP = newAllCompsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllTargetsMVP() {
		if (allTargetsMVP != null && allTargetsMVP.eIsProxy()) {
			InternalEObject oldAllTargetsMVP = (InternalEObject)allTargetsMVP;
			allTargetsMVP = (MultipleValuedParameter)eResolveProxy(oldAllTargetsMVP);
			if (allTargetsMVP != oldAllTargetsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP, oldAllTargetsMVP, allTargetsMVP));
			}
		}
		return allTargetsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllTargetsMVP() {
		return allTargetsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllTargetsMVP(MultipleValuedParameter newAllTargetsMVP) {
		MultipleValuedParameter oldAllTargetsMVP = allTargetsMVP;
		allTargetsMVP = newAllTargetsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP, oldAllTargetsMVP, allTargetsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllNodesMVP() {
		if (allNodesMVP != null && allNodesMVP.eIsProxy()) {
			InternalEObject oldAllNodesMVP = (InternalEObject)allNodesMVP;
			allNodesMVP = (MultipleValuedParameter)eResolveProxy(oldAllNodesMVP);
			if (allNodesMVP != oldAllNodesMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
			}
		}
		return allNodesMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllNodesMVP() {
		return allNodesMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllNodesMVP(MultipleValuedParameter newAllNodesMVP) {
		MultipleValuedParameter oldAllNodesMVP = allNodesMVP;
		allNodesMVP = newAllNodesMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllDeployedElemsMVP() {
		if (allDeployedElemsMVP != null && allDeployedElemsMVP.eIsProxy()) {
			InternalEObject oldAllDeployedElemsMVP = (InternalEObject)allDeployedElemsMVP;
			allDeployedElemsMVP = (MultipleValuedParameter)eResolveProxy(oldAllDeployedElemsMVP);
			if (allDeployedElemsMVP != oldAllDeployedElemsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP, oldAllDeployedElemsMVP, allDeployedElemsMVP));
			}
		}
		return allDeployedElemsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllDeployedElemsMVP() {
		return allDeployedElemsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllDeployedElemsMVP(MultipleValuedParameter newAllDeployedElemsMVP) {
		MultipleValuedParameter oldAllDeployedElemsMVP = allDeployedElemsMVP;
		allDeployedElemsMVP = newAllDeployedElemsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP, oldAllDeployedElemsMVP, allDeployedElemsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getUmlCompToMove() {
		return umlCompToMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlCompToMove(Component newUmlCompToMove) {
		Component oldUmlCompToMove = umlCompToMove;
		umlCompToMove = newUmlCompToMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE, oldUmlCompToMove, umlCompToMove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getUmlTargetNodes() {
		if (umlTargetNodes == null) {
			umlTargetNodes = new EDataTypeUniqueEList<Node>(Node.class, this, UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES);
		}
		return umlTargetNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getUmlArtifacts() {
		if (umlArtifacts == null) {
			umlArtifacts = new EDataTypeUniqueEList<Artifact>(Artifact.class, this, UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS);
		}
		return umlArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP:
				if (resolve) return getCompToMoveSVP();
				return basicGetCompToMoveSVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP:
				if (resolve) return getTargetNodesMVP();
				return basicGetTargetNodesMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP:
				if (resolve) return getAllArtifactsMVP();
				return basicGetAllArtifactsMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP:
				if (resolve) return getAllTargetsMVP();
				return basicGetAllTargetsMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP:
				if (resolve) return getAllNodesMVP();
				return basicGetAllNodesMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				if (resolve) return getAllDeployedElemsMVP();
				return basicGetAllDeployedElemsMVP();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE:
				return getUmlCompToMove();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES:
				return getUmlTargetNodes();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS:
				return getUmlArtifacts();
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
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP:
				setCompToMoveSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP:
				setTargetNodesMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP:
				setAllArtifactsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP:
				setAllTargetsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				setAllDeployedElemsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE:
				setUmlCompToMove((Component)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES:
				getUmlTargetNodes().clear();
				getUmlTargetNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS:
				getUmlArtifacts().clear();
				getUmlArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP:
				setCompToMoveSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP:
				setTargetNodesMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP:
				setAllArtifactsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP:
				setAllTargetsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				setAllDeployedElemsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE:
				setUmlCompToMove(UML_COMP_TO_MOVE_EDEFAULT);
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES:
				getUmlTargetNodes().clear();
				return;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS:
				getUmlArtifacts().clear();
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
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__COMP_TO_MOVE_SVP:
				return compToMoveSVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__TARGET_NODES_MVP:
				return targetNodesMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_ARTIFACTS_MVP:
				return allArtifactsMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_TARGETS_MVP:
				return allTargetsMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_NODES_MVP:
				return allNodesMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				return allDeployedElemsMVP != null;
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_COMP_TO_MOVE:
				return UML_COMP_TO_MOVE_EDEFAULT == null ? umlCompToMove != null : !UML_COMP_TO_MOVE_EDEFAULT.equals(umlCompToMove);
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_TARGET_NODES:
				return umlTargetNodes != null && !umlTargetNodes.isEmpty();
			case UMLPackage.UML_MOVE_COMPONENT_ACTION__UML_ARTIFACTS:
				return umlArtifacts != null && !umlArtifacts.isEmpty();
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
		result.append(" (umlCompToMove: ");
		result.append(umlCompToMove);
		result.append(", umlTargetNodes: ");
		result.append(umlTargetNodes);
		result.append(", umlArtifacts: ");
		result.append(umlArtifacts);
		result.append(')');
		return result.toString();
	}

} //UMLMoveComponentActionImpl
