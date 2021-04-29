/**
 */
package logicalSpecification.actions.UML.impl;

import java.util.Collection;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLAddNodeAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Node Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getNodeToAddSVP <em>Node To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getNeighborsMVP <em>Neighbors MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getCompsToDeployMVP <em>Comps To Deploy MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getAllDeployedElemsMVP <em>All Deployed Elems MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getUmlNodeToAdd <em>Uml Node To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getUmlNeighbors <em>Uml Neighbors</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getUmlCompsToDeploy <em>Uml Comps To Deploy</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddNodeActionImpl#getUmlSourcePackage <em>Uml Source Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAddNodeActionImpl extends UMLAddActionImpl implements UMLAddNodeAction {
	/**
	 * The cached value of the '{@link #getNodeToAddSVP() <em>Node To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeToAddSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter nodeToAddSVP;

	/**
	 * The cached value of the '{@link #getNeighborsMVP() <em>Neighbors MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighborsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter neighborsMVP;

	/**
	 * The cached value of the '{@link #getCompsToDeployMVP() <em>Comps To Deploy MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompsToDeployMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter compsToDeployMVP;

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
	 * The default value of the '{@link #getUmlNodeToAdd() <em>Uml Node To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlNodeToAdd()
	 * @generated
	 * @ordered
	 */
	protected static final Node UML_NODE_TO_ADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlNodeToAdd() <em>Uml Node To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlNodeToAdd()
	 * @generated
	 * @ordered
	 */
	protected Node umlNodeToAdd = UML_NODE_TO_ADD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUmlNeighbors() <em>Uml Neighbors</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlNeighbors()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> umlNeighbors;

	/**
	 * The cached value of the '{@link #getUmlCompsToDeploy() <em>Uml Comps To Deploy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompsToDeploy()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> umlCompsToDeploy;

	/**
	 * The default value of the '{@link #getUmlSourcePackage() <em>Uml Source Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlSourcePackage()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.uml2.uml.Package UML_SOURCE_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlSourcePackage() <em>Uml Source Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlSourcePackage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package umlSourcePackage = UML_SOURCE_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAddNodeActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_ADD_NODE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getNodeToAddSVP() {
		if (nodeToAddSVP != null && nodeToAddSVP.eIsProxy()) {
			InternalEObject oldNodeToAddSVP = (InternalEObject)nodeToAddSVP;
			nodeToAddSVP = (SingleValuedParameter)eResolveProxy(oldNodeToAddSVP);
			if (nodeToAddSVP != oldNodeToAddSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP, oldNodeToAddSVP, nodeToAddSVP));
			}
		}
		return nodeToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetNodeToAddSVP() {
		return nodeToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeToAddSVP(SingleValuedParameter newNodeToAddSVP) {
		SingleValuedParameter oldNodeToAddSVP = nodeToAddSVP;
		nodeToAddSVP = newNodeToAddSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP, oldNodeToAddSVP, nodeToAddSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getNeighborsMVP() {
		if (neighborsMVP != null && neighborsMVP.eIsProxy()) {
			InternalEObject oldNeighborsMVP = (InternalEObject)neighborsMVP;
			neighborsMVP = (MultipleValuedParameter)eResolveProxy(oldNeighborsMVP);
			if (neighborsMVP != oldNeighborsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP, oldNeighborsMVP, neighborsMVP));
			}
		}
		return neighborsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetNeighborsMVP() {
		return neighborsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighborsMVP(MultipleValuedParameter newNeighborsMVP) {
		MultipleValuedParameter oldNeighborsMVP = neighborsMVP;
		neighborsMVP = newNeighborsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP, oldNeighborsMVP, neighborsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getCompsToDeployMVP() {
		if (compsToDeployMVP != null && compsToDeployMVP.eIsProxy()) {
			InternalEObject oldCompsToDeployMVP = (InternalEObject)compsToDeployMVP;
			compsToDeployMVP = (MultipleValuedParameter)eResolveProxy(oldCompsToDeployMVP);
			if (compsToDeployMVP != oldCompsToDeployMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP, oldCompsToDeployMVP, compsToDeployMVP));
			}
		}
		return compsToDeployMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetCompsToDeployMVP() {
		return compsToDeployMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompsToDeployMVP(MultipleValuedParameter newCompsToDeployMVP) {
		MultipleValuedParameter oldCompsToDeployMVP = compsToDeployMVP;
		compsToDeployMVP = newCompsToDeployMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP, oldCompsToDeployMVP, compsToDeployMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP, oldAllDeployedElemsMVP, allDeployedElemsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP, oldAllDeployedElemsMVP, allDeployedElemsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getUmlNodeToAdd() {
		return umlNodeToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlNodeToAdd(Node newUmlNodeToAdd) {
		Node oldUmlNodeToAdd = umlNodeToAdd;
		umlNodeToAdd = newUmlNodeToAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__UML_NODE_TO_ADD, oldUmlNodeToAdd, umlNodeToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getUmlNeighbors() {
		if (umlNeighbors == null) {
			umlNeighbors = new EDataTypeUniqueEList<Node>(Node.class, this, UMLPackage.UML_ADD_NODE_ACTION__UML_NEIGHBORS);
		}
		return umlNeighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getUmlCompsToDeploy() {
		if (umlCompsToDeploy == null) {
			umlCompsToDeploy = new EDataTypeUniqueEList<Component>(Component.class, this, UMLPackage.UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY);
		}
		return umlCompsToDeploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getUmlSourcePackage() {
		return umlSourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlSourcePackage(org.eclipse.uml2.uml.Package newUmlSourcePackage) {
		org.eclipse.uml2.uml.Package oldUmlSourcePackage = umlSourcePackage;
		umlSourcePackage = newUmlSourcePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE, oldUmlSourcePackage, umlSourcePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP:
				if (resolve) return getNodeToAddSVP();
				return basicGetNodeToAddSVP();
			case UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP:
				if (resolve) return getNeighborsMVP();
				return basicGetNeighborsMVP();
			case UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP:
				if (resolve) return getCompsToDeployMVP();
				return basicGetCompsToDeployMVP();
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP:
				if (resolve) return getAllNodesMVP();
				return basicGetAllNodesMVP();
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				if (resolve) return getAllDeployedElemsMVP();
				return basicGetAllDeployedElemsMVP();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NODE_TO_ADD:
				return getUmlNodeToAdd();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NEIGHBORS:
				return getUmlNeighbors();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY:
				return getUmlCompsToDeploy();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE:
				return getUmlSourcePackage();
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
			case UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP:
				setNodeToAddSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP:
				setNeighborsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP:
				setCompsToDeployMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				setAllDeployedElemsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NODE_TO_ADD:
				setUmlNodeToAdd((Node)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NEIGHBORS:
				getUmlNeighbors().clear();
				getUmlNeighbors().addAll((Collection<? extends Node>)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY:
				getUmlCompsToDeploy().clear();
				getUmlCompsToDeploy().addAll((Collection<? extends Component>)newValue);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE:
				setUmlSourcePackage((org.eclipse.uml2.uml.Package)newValue);
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
			case UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP:
				setNodeToAddSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP:
				setNeighborsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP:
				setCompsToDeployMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				setAllDeployedElemsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NODE_TO_ADD:
				setUmlNodeToAdd(UML_NODE_TO_ADD_EDEFAULT);
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NEIGHBORS:
				getUmlNeighbors().clear();
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY:
				getUmlCompsToDeploy().clear();
				return;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE:
				setUmlSourcePackage(UML_SOURCE_PACKAGE_EDEFAULT);
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
			case UMLPackage.UML_ADD_NODE_ACTION__NODE_TO_ADD_SVP:
				return nodeToAddSVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__NEIGHBORS_MVP:
				return neighborsMVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__COMPS_TO_DEPLOY_MVP:
				return compsToDeployMVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_NODES_MVP:
				return allNodesMVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__ALL_DEPLOYED_ELEMS_MVP:
				return allDeployedElemsMVP != null;
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NODE_TO_ADD:
				return UML_NODE_TO_ADD_EDEFAULT == null ? umlNodeToAdd != null : !UML_NODE_TO_ADD_EDEFAULT.equals(umlNodeToAdd);
			case UMLPackage.UML_ADD_NODE_ACTION__UML_NEIGHBORS:
				return umlNeighbors != null && !umlNeighbors.isEmpty();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_COMPS_TO_DEPLOY:
				return umlCompsToDeploy != null && !umlCompsToDeploy.isEmpty();
			case UMLPackage.UML_ADD_NODE_ACTION__UML_SOURCE_PACKAGE:
				return UML_SOURCE_PACKAGE_EDEFAULT == null ? umlSourcePackage != null : !UML_SOURCE_PACKAGE_EDEFAULT.equals(umlSourcePackage);
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
		result.append(" (umlNodeToAdd: ");
		result.append(umlNodeToAdd);
		result.append(", umlNeighbors: ");
		result.append(umlNeighbors);
		result.append(", umlCompsToDeploy: ");
		result.append(umlCompsToDeploy);
		result.append(", umlSourcePackage: ");
		result.append(umlSourcePackage);
		result.append(')');
		return result.toString();
	}

} //UMLAddNodeActionImpl
