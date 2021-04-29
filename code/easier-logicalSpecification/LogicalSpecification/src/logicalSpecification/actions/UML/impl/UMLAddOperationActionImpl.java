/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLAddOperationAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getOpToAddSVP <em>Op To Add SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getTargetCompSVP <em>Target Comp SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getTargetCompOpsMVP <em>Target Comp Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getUmlOpToAdd <em>Uml Op To Add</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLAddOperationActionImpl#getUmlTargetComp <em>Uml Target Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLAddOperationActionImpl extends UMLAddActionImpl implements UMLAddOperationAction {
	/**
	 * The cached value of the '{@link #getOpToAddSVP() <em>Op To Add SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpToAddSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter opToAddSVP;

	/**
	 * The cached value of the '{@link #getTargetCompSVP() <em>Target Comp SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCompSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter targetCompSVP;

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
	 * The cached value of the '{@link #getTargetCompOpsMVP() <em>Target Comp Ops MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCompOpsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter targetCompOpsMVP;

	/**
	 * The default value of the '{@link #getUmlOpToAdd() <em>Uml Op To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToAdd()
	 * @generated
	 * @ordered
	 */
	protected static final Operation UML_OP_TO_ADD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlOpToAdd() <em>Uml Op To Add</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToAdd()
	 * @generated
	 * @ordered
	 */
	protected Operation umlOpToAdd = UML_OP_TO_ADD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUmlTargetComp() <em>Uml Target Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlTargetComp()
	 * @generated
	 * @ordered
	 */
	protected static final Component UML_TARGET_COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlTargetComp() <em>Uml Target Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlTargetComp()
	 * @generated
	 * @ordered
	 */
	protected Component umlTargetComp = UML_TARGET_COMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLAddOperationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_ADD_OPERATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getOpToAddSVP() {
		if (opToAddSVP != null && opToAddSVP.eIsProxy()) {
			InternalEObject oldOpToAddSVP = (InternalEObject)opToAddSVP;
			opToAddSVP = (SingleValuedParameter)eResolveProxy(oldOpToAddSVP);
			if (opToAddSVP != oldOpToAddSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP, oldOpToAddSVP, opToAddSVP));
			}
		}
		return opToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetOpToAddSVP() {
		return opToAddSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpToAddSVP(SingleValuedParameter newOpToAddSVP) {
		SingleValuedParameter oldOpToAddSVP = opToAddSVP;
		opToAddSVP = newOpToAddSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP, oldOpToAddSVP, opToAddSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getTargetCompSVP() {
		if (targetCompSVP != null && targetCompSVP.eIsProxy()) {
			InternalEObject oldTargetCompSVP = (InternalEObject)targetCompSVP;
			targetCompSVP = (SingleValuedParameter)eResolveProxy(oldTargetCompSVP);
			if (targetCompSVP != oldTargetCompSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP, oldTargetCompSVP, targetCompSVP));
			}
		}
		return targetCompSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetTargetCompSVP() {
		return targetCompSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCompSVP(SingleValuedParameter newTargetCompSVP) {
		SingleValuedParameter oldTargetCompSVP = targetCompSVP;
		targetCompSVP = newTargetCompSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP, oldTargetCompSVP, targetCompSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getTargetCompOpsMVP() {
		if (targetCompOpsMVP != null && targetCompOpsMVP.eIsProxy()) {
			InternalEObject oldTargetCompOpsMVP = (InternalEObject)targetCompOpsMVP;
			targetCompOpsMVP = (MultipleValuedParameter)eResolveProxy(oldTargetCompOpsMVP);
			if (targetCompOpsMVP != oldTargetCompOpsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP, oldTargetCompOpsMVP, targetCompOpsMVP));
			}
		}
		return targetCompOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetTargetCompOpsMVP() {
		return targetCompOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCompOpsMVP(MultipleValuedParameter newTargetCompOpsMVP) {
		MultipleValuedParameter oldTargetCompOpsMVP = targetCompOpsMVP;
		targetCompOpsMVP = newTargetCompOpsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP, oldTargetCompOpsMVP, targetCompOpsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getUmlOpToAdd() {
		return umlOpToAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlOpToAdd(Operation newUmlOpToAdd) {
		Operation oldUmlOpToAdd = umlOpToAdd;
		umlOpToAdd = newUmlOpToAdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD, oldUmlOpToAdd, umlOpToAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getUmlTargetComp() {
		return umlTargetComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlTargetComp(Component newUmlTargetComp) {
		Component oldUmlTargetComp = umlTargetComp;
		umlTargetComp = newUmlTargetComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_ADD_OPERATION_ACTION__UML_TARGET_COMP, oldUmlTargetComp, umlTargetComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP:
				if (resolve) return getOpToAddSVP();
				return basicGetOpToAddSVP();
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP:
				if (resolve) return getTargetCompSVP();
				return basicGetTargetCompSVP();
			case UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP:
				if (resolve) return getTargetCompOpsMVP();
				return basicGetTargetCompOpsMVP();
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD:
				return getUmlOpToAdd();
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_TARGET_COMP:
				return getUmlTargetComp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP:
				setOpToAddSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP:
				setTargetCompSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP:
				setTargetCompOpsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD:
				setUmlOpToAdd((Operation)newValue);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_TARGET_COMP:
				setUmlTargetComp((Component)newValue);
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
			case UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP:
				setOpToAddSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP:
				setTargetCompSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP:
				setTargetCompOpsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD:
				setUmlOpToAdd(UML_OP_TO_ADD_EDEFAULT);
				return;
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_TARGET_COMP:
				setUmlTargetComp(UML_TARGET_COMP_EDEFAULT);
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
			case UMLPackage.UML_ADD_OPERATION_ACTION__OP_TO_ADD_SVP:
				return opToAddSVP != null;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_SVP:
				return targetCompSVP != null;
			case UMLPackage.UML_ADD_OPERATION_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_ADD_OPERATION_ACTION__TARGET_COMP_OPS_MVP:
				return targetCompOpsMVP != null;
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_OP_TO_ADD:
				return UML_OP_TO_ADD_EDEFAULT == null ? umlOpToAdd != null : !UML_OP_TO_ADD_EDEFAULT.equals(umlOpToAdd);
			case UMLPackage.UML_ADD_OPERATION_ACTION__UML_TARGET_COMP:
				return UML_TARGET_COMP_EDEFAULT == null ? umlTargetComp != null : !UML_TARGET_COMP_EDEFAULT.equals(umlTargetComp);
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
		result.append(" (umlOpToAdd: ");
		result.append(umlOpToAdd);
		result.append(", umlTargetComp: ");
		result.append(umlTargetComp);
		result.append(')');
		return result.toString();
	}

} //UMLAddOperationActionImpl
