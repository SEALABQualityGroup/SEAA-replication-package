/**
 */
package logicalSpecification.actions.UML.impl;

import java.util.Collection;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLAddComponentAction;
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
 * An implementation of the model object '<em><b>Add Component Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getComponentToAddSVP <em>Component To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getTargetNodesMVP <em>Target Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getDeployedCompsMVP <em>Deployed Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getAllNodesMVP <em>All Nodes MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getUmlCompToAdd <em>Uml Comp To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getUmlSourcePackage <em>Uml Source Package</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddComponentActionImpl#getUmlTargetNodes <em>Uml Target Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAddComponentActionImpl extends UMLAddActionImpl implements UMLAddComponentAction {
	/**
	 * The cached value of the '{@link #getComponentToAddSVP() <em>Component To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentToAddSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter componentToAddSVP;

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
	 * The cached value of the '{@link #getDeployedCompsMVP() <em>Deployed Comps MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedCompsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter deployedCompsMVP;

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
	 * The default value of the '{@link #getUmlCompToAdd() <em>Uml Comp To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToAdd()
	 * @generated
	 * @ordered
	 */
	protected static final Component UML_COMP_TO_ADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlCompToAdd() <em>Uml Comp To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToAdd()
	 * @generated
	 * @ordered
	 */
	protected Component umlCompToAdd = UML_COMP_TO_ADD_EDEFAULT;

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
	 * The cached value of the '{@link #getUmlTargetNodes() <em>Uml Target Nodes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlTargetNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> umlTargetNodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAddComponentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_ADD_COMPONENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getComponentToAddSVP() {
		if (componentToAddSVP != null && componentToAddSVP.eIsProxy()) {
			InternalEObject oldComponentToAddSVP = (InternalEObject)componentToAddSVP;
			componentToAddSVP = (SingleValuedParameter)eResolveProxy(oldComponentToAddSVP);
			if (componentToAddSVP != oldComponentToAddSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP, oldComponentToAddSVP, componentToAddSVP));
			}
		}
		return componentToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetComponentToAddSVP() {
		return componentToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentToAddSVP(SingleValuedParameter newComponentToAddSVP) {
		SingleValuedParameter oldComponentToAddSVP = componentToAddSVP;
		componentToAddSVP = newComponentToAddSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP, oldComponentToAddSVP, componentToAddSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP, oldTargetNodesMVP, targetNodesMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP, oldTargetNodesMVP, targetNodesMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getDeployedCompsMVP() {
		if (deployedCompsMVP != null && deployedCompsMVP.eIsProxy()) {
			InternalEObject oldDeployedCompsMVP = (InternalEObject)deployedCompsMVP;
			deployedCompsMVP = (MultipleValuedParameter)eResolveProxy(oldDeployedCompsMVP);
			if (deployedCompsMVP != oldDeployedCompsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP, oldDeployedCompsMVP, deployedCompsMVP));
			}
		}
		return deployedCompsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetDeployedCompsMVP() {
		return deployedCompsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedCompsMVP(MultipleValuedParameter newDeployedCompsMVP) {
		MultipleValuedParameter oldDeployedCompsMVP = deployedCompsMVP;
		deployedCompsMVP = newDeployedCompsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP, oldDeployedCompsMVP, deployedCompsMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP, oldAllNodesMVP, allNodesMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getUmlCompToAdd() {
		return umlCompToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlCompToAdd(Component newUmlCompToAdd) {
		Component oldUmlCompToAdd = umlCompToAdd;
		umlCompToAdd = newUmlCompToAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD, oldUmlCompToAdd, umlCompToAdd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE, oldUmlSourcePackage, umlSourcePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getUmlTargetNodes() {
		if (umlTargetNodes == null) {
			umlTargetNodes = new EDataTypeUniqueEList<Node>(Node.class, this, UMLPackage.UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES);
		}
		return umlTargetNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP:
				if (resolve) return getComponentToAddSVP();
				return basicGetComponentToAddSVP();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP:
				if (resolve) return getTargetNodesMVP();
				return basicGetTargetNodesMVP();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP:
				if (resolve) return getDeployedCompsMVP();
				return basicGetDeployedCompsMVP();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP:
				if (resolve) return getAllNodesMVP();
				return basicGetAllNodesMVP();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD:
				return getUmlCompToAdd();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE:
				return getUmlSourcePackage();
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES:
				return getUmlTargetNodes();
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
			case UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP:
				setComponentToAddSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP:
				setTargetNodesMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP:
				setDeployedCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD:
				setUmlCompToAdd((Component)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE:
				setUmlSourcePackage((org.eclipse.uml2.uml.Package)newValue);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES:
				getUmlTargetNodes().clear();
				getUmlTargetNodes().addAll((Collection<? extends Node>)newValue);
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
			case UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP:
				setComponentToAddSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP:
				setTargetNodesMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP:
				setDeployedCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP:
				setAllNodesMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD:
				setUmlCompToAdd(UML_COMP_TO_ADD_EDEFAULT);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE:
				setUmlSourcePackage(UML_SOURCE_PACKAGE_EDEFAULT);
				return;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES:
				getUmlTargetNodes().clear();
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
			case UMLPackage.UML_ADD_COMPONENT_ACTION__COMPONENT_TO_ADD_SVP:
				return componentToAddSVP != null;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__TARGET_NODES_MVP:
				return targetNodesMVP != null;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__DEPLOYED_COMPS_MVP:
				return deployedCompsMVP != null;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__ALL_NODES_MVP:
				return allNodesMVP != null;
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_COMP_TO_ADD:
				return UML_COMP_TO_ADD_EDEFAULT == null ? umlCompToAdd != null : !UML_COMP_TO_ADD_EDEFAULT.equals(umlCompToAdd);
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_SOURCE_PACKAGE:
				return UML_SOURCE_PACKAGE_EDEFAULT == null ? umlSourcePackage != null : !UML_SOURCE_PACKAGE_EDEFAULT.equals(umlSourcePackage);
			case UMLPackage.UML_ADD_COMPONENT_ACTION__UML_TARGET_NODES:
				return umlTargetNodes != null && !umlTargetNodes.isEmpty();
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
		result.append(" (umlCompToAdd: ");
		result.append(umlCompToAdd);
		result.append(", umlSourcePackage: ");
		result.append(umlSourcePackage);
		result.append(", umlTargetNodes: ");
		result.append(umlTargetNodes);
		result.append(')');
		return result.toString();
	}

} //UMLAddComponentActionImpl
