/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLMoveOperationAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getOpToMoveSVP <em>Op To Move SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getTargetCompSVP <em>Target Comp SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getAllOpsMVP <em>All Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getAllTargetCompOpsMVP <em>All Target Comp Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getUmlOpToMove <em>Uml Op To Move</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLMoveOperationActionImpl#getUmlTargetComp <em>Uml Target Comp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLMoveOperationActionImpl extends UMLMoveActionImpl implements UMLMoveOperationAction {
	/**
	 * The cached value of the '{@link #getOpToMoveSVP() <em>Op To Move SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpToMoveSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter opToMoveSVP;

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
	 * The cached value of the '{@link #getAllOpsMVP() <em>All Ops MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOpsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allOpsMVP;

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
	 * The cached value of the '{@link #getAllTargetCompOpsMVP() <em>All Target Comp Ops MVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllTargetCompOpsMVP()
	 * @generated
	 * @ordered
	 */
	protected MultipleValuedParameter allTargetCompOpsMVP;

	/**
	 * The default value of the '{@link #getUmlOpToMove() <em>Uml Op To Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToMove()
	 * @generated
	 * @ordered
	 */
	protected static final Operation UML_OP_TO_MOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlOpToMove() <em>Uml Op To Move</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToMove()
	 * @generated
	 * @ordered
	 */
	protected Operation umlOpToMove = UML_OP_TO_MOVE_EDEFAULT;

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
	protected UMLMoveOperationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_MOVE_OPERATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getOpToMoveSVP() {
		if (opToMoveSVP != null && opToMoveSVP.eIsProxy()) {
			InternalEObject oldOpToMoveSVP = (InternalEObject)opToMoveSVP;
			opToMoveSVP = (SingleValuedParameter)eResolveProxy(oldOpToMoveSVP);
			if (opToMoveSVP != oldOpToMoveSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP, oldOpToMoveSVP, opToMoveSVP));
			}
		}
		return opToMoveSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetOpToMoveSVP() {
		return opToMoveSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpToMoveSVP(SingleValuedParameter newOpToMoveSVP) {
		SingleValuedParameter oldOpToMoveSVP = opToMoveSVP;
		opToMoveSVP = newOpToMoveSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP, oldOpToMoveSVP, opToMoveSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP, oldTargetCompSVP, targetCompSVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP, oldTargetCompSVP, targetCompSVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllOpsMVP() {
		if (allOpsMVP != null && allOpsMVP.eIsProxy()) {
			InternalEObject oldAllOpsMVP = (InternalEObject)allOpsMVP;
			allOpsMVP = (MultipleValuedParameter)eResolveProxy(oldAllOpsMVP);
			if (allOpsMVP != oldAllOpsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP, oldAllOpsMVP, allOpsMVP));
			}
		}
		return allOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllOpsMVP() {
		return allOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllOpsMVP(MultipleValuedParameter newAllOpsMVP) {
		MultipleValuedParameter oldAllOpsMVP = allOpsMVP;
		allOpsMVP = newAllOpsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP, oldAllOpsMVP, allOpsMVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter getAllTargetCompOpsMVP() {
		if (allTargetCompOpsMVP != null && allTargetCompOpsMVP.eIsProxy()) {
			InternalEObject oldAllTargetCompOpsMVP = (InternalEObject)allTargetCompOpsMVP;
			allTargetCompOpsMVP = (MultipleValuedParameter)eResolveProxy(oldAllTargetCompOpsMVP);
			if (allTargetCompOpsMVP != oldAllTargetCompOpsMVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP, oldAllTargetCompOpsMVP, allTargetCompOpsMVP));
			}
		}
		return allTargetCompOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleValuedParameter basicGetAllTargetCompOpsMVP() {
		return allTargetCompOpsMVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllTargetCompOpsMVP(MultipleValuedParameter newAllTargetCompOpsMVP) {
		MultipleValuedParameter oldAllTargetCompOpsMVP = allTargetCompOpsMVP;
		allTargetCompOpsMVP = newAllTargetCompOpsMVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP, oldAllTargetCompOpsMVP, allTargetCompOpsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getUmlOpToMove() {
		return umlOpToMove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlOpToMove(Operation newUmlOpToMove) {
		Operation oldUmlOpToMove = umlOpToMove;
		umlOpToMove = newUmlOpToMove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE, oldUmlOpToMove, umlOpToMove));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP, oldUmlTargetComp, umlTargetComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP:
				if (resolve) return getOpToMoveSVP();
				return basicGetOpToMoveSVP();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP:
				if (resolve) return getTargetCompSVP();
				return basicGetTargetCompSVP();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP:
				if (resolve) return getAllOpsMVP();
				return basicGetAllOpsMVP();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP:
				if (resolve) return getAllTargetCompOpsMVP();
				return basicGetAllTargetCompOpsMVP();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE:
				return getUmlOpToMove();
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP:
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
			case UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP:
				setOpToMoveSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP:
				setTargetCompSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP:
				setAllOpsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP:
				setAllTargetCompOpsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE:
				setUmlOpToMove((Operation)newValue);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP:
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
			case UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP:
				setOpToMoveSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP:
				setTargetCompSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP:
				setAllOpsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP:
				setAllTargetCompOpsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE:
				setUmlOpToMove(UML_OP_TO_MOVE_EDEFAULT);
				return;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP:
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
			case UMLPackage.UML_MOVE_OPERATION_ACTION__OP_TO_MOVE_SVP:
				return opToMoveSVP != null;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__TARGET_COMP_SVP:
				return targetCompSVP != null;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_OPS_MVP:
				return allOpsMVP != null;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__ALL_TARGET_COMP_OPS_MVP:
				return allTargetCompOpsMVP != null;
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_OP_TO_MOVE:
				return UML_OP_TO_MOVE_EDEFAULT == null ? umlOpToMove != null : !UML_OP_TO_MOVE_EDEFAULT.equals(umlOpToMove);
			case UMLPackage.UML_MOVE_OPERATION_ACTION__UML_TARGET_COMP:
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
		result.append(" (umlOpToMove: ");
		result.append(umlOpToMove);
		result.append(", umlTargetComp: ");
		result.append(umlTargetComp);
		result.append(')');
		return result.toString();
	}

} //UMLMoveOperationActionImpl
