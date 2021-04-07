/**
 */
package logicalSpecification.actions.UML.impl;

import logicalSpecification.MultipleValuedParameter;
import logicalSpecification.SingleValuedParameter;

import logicalSpecification.actions.UML.UMLDeleteComponentAction;
import logicalSpecification.actions.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Component Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl#getCompToDelSVP <em>Comp To Del SVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl#getAllCompsMVP <em>All Comps MVP</em>}</li>
 *   <li>{@link logicalSpecification.actions.UML.impl.UMLDeleteComponentActionImpl#getUmlCompToDel <em>Uml Comp To Del</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UMLDeleteComponentActionImpl extends UMLDeleteActionImpl implements UMLDeleteComponentAction {
	/**
	 * The cached value of the '{@link #getCompToDelSVP() <em>Comp To Del SVP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompToDelSVP()
	 * @generated
	 * @ordered
	 */
	protected SingleValuedParameter compToDelSVP;

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
	 * The default value of the '{@link #getUmlCompToDel() <em>Uml Comp To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToDel()
	 * @generated
	 * @ordered
	 */
	protected static final Component UML_COMP_TO_DEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlCompToDel() <em>Uml Comp To Del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlCompToDel()
	 * @generated
	 * @ordered
	 */
	protected Component umlCompToDel = UML_COMP_TO_DEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLDeleteComponentActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.UML_DELETE_COMPONENT_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter getCompToDelSVP() {
		if (compToDelSVP != null && compToDelSVP.eIsProxy()) {
			InternalEObject oldCompToDelSVP = (InternalEObject)compToDelSVP;
			compToDelSVP = (SingleValuedParameter)eResolveProxy(oldCompToDelSVP);
			if (compToDelSVP != oldCompToDelSVP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP, oldCompToDelSVP, compToDelSVP));
			}
		}
		return compToDelSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValuedParameter basicGetCompToDelSVP() {
		return compToDelSVP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompToDelSVP(SingleValuedParameter newCompToDelSVP) {
		SingleValuedParameter oldCompToDelSVP = compToDelSVP;
		compToDelSVP = newCompToDelSVP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP, oldCompToDelSVP, compToDelSVP));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP, oldAllCompsMVP, allCompsMVP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getUmlCompToDel() {
		return umlCompToDel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlCompToDel(Component newUmlCompToDel) {
		Component oldUmlCompToDel = umlCompToDel;
		umlCompToDel = newUmlCompToDel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL, oldUmlCompToDel, umlCompToDel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP:
				if (resolve) return getCompToDelSVP();
				return basicGetCompToDelSVP();
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP:
				if (resolve) return getAllCompsMVP();
				return basicGetAllCompsMVP();
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL:
				return getUmlCompToDel();
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
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP:
				setCompToDelSVP((SingleValuedParameter)newValue);
				return;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)newValue);
				return;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL:
				setUmlCompToDel((Component)newValue);
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
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP:
				setCompToDelSVP((SingleValuedParameter)null);
				return;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP:
				setAllCompsMVP((MultipleValuedParameter)null);
				return;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL:
				setUmlCompToDel(UML_COMP_TO_DEL_EDEFAULT);
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
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__COMP_TO_DEL_SVP:
				return compToDelSVP != null;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__ALL_COMPS_MVP:
				return allCompsMVP != null;
			case UMLPackage.UML_DELETE_COMPONENT_ACTION__UML_COMP_TO_DEL:
				return UML_COMP_TO_DEL_EDEFAULT == null ? umlCompToDel != null : !UML_COMP_TO_DEL_EDEFAULT.equals(umlCompToDel);
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
		result.append(" (umlCompToDel: ");
		result.append(umlCompToDel);
		result.append(')');
		return result.toString();
	}

} //UMLDeleteComponentActionImpl
