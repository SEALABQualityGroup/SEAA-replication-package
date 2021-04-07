/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLDeleteOperationAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Operation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl#getOpToDelSVP <em>Op To Del SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl#getAllOpsMVP <em>All Ops MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteOperationActionImpl#getUmlOpToDel <em>Uml Op To Del</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLDeleteOperationActionImpl extends UMLDeleteActionImpl implements UMLDeleteOperationAction {
	/**
	 * The cached value of the '{@link #getOpToDelSVP() <em>Op To Del SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpToDelSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter opToDelSVP;

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
	 * The default value of the '{@link #getUmlOpToDel() <em>Uml Op To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToDel()
	 * @generated
	 * @ordered
	 */
	protected static final Operation UML_OP_TO_DEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlOpToDel() <em>Uml Op To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlOpToDel()
	 * @generated
	 * @ordered
	 */
	protected Operation umlOpToDel = UML_OP_TO_DEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDeleteOperationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_DELETE_OPERATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getOpToDelSVP() {
		if (opToDelSVP != null && opToDelSVP.eIsProxy()) {
			InternalEObject oldOpToDelSVP = (InternalEObject)opToDelSVP;
			opToDelSVP = (SingleValuedParameter)eResolveProxy(oldOpToDelSVP);
			if (opToDelSVP != oldOpToDelSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP, oldOpToDelSVP, opToDelSVP));
			}
		}
		return opToDelSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetOpToDelSVP() {
		return opToDelSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpToDelSVP(SingleValuedParameter newOpToDelSVP) {
		SingleValuedParameter oldOpToDelSVP = opToDelSVP;
		opToDelSVP = newOpToDelSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP, oldOpToDelSVP, opToDelSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP, oldAllOpsMVP, allOpsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP, oldAllOpsMVP, allOpsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getUmlOpToDel() {
		return umlOpToDel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlOpToDel(Operation newUmlOpToDel) {
		Operation oldUmlOpToDel = umlOpToDel;
		umlOpToDel = newUmlOpToDel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL, oldUmlOpToDel, umlOpToDel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP:
				if (resolve) return getOpToDelSVP();
				return basicGetOpToDelSVP();
			case UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP:
				if (resolve) return getAllOpsMVP();
				return basicGetAllOpsMVP();
			case UMLPackage.UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL:
				return getUmlOpToDel();
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
			case UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP:
				setOpToDelSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP:
				setAllOpsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL:
				setUmlOpToDel((Operation)newValue);
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
			case UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP:
				setOpToDelSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP:
				setAllOpsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL:
				setUmlOpToDel(UML_OP_TO_DEL_EDEFAULT);
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
			case UMLPackage.UML_DELETE_OPERATION_ACTION__OP_TO_DEL_SVP:
				return opToDelSVP != null;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__ALL_OPS_MVP:
				return allOpsMVP != null;
			case UMLPackage.UML_DELETE_OPERATION_ACTION__UML_OP_TO_DEL:
				return UML_OP_TO_DEL_EDEFAULT == null ? umlOpToDel != null : !UML_OP_TO_DEL_EDEFAULT.equals(umlOpToDel);
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
		result.append(" (umlOpToDel: ");
		result.append(umlOpToDel);
		result.append(')');
		return result.toString();
	}

} //UMLDeleteOperationActionImpl
