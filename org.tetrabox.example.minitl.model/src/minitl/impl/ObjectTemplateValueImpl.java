/**
 */
package minitl.impl;

import minitl.MinitlPackage;
import minitl.ObjectTemplate;
import minitl.ObjectTemplateValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Template Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitl.impl.ObjectTemplateValueImpl#getObjecttemplate <em>Objecttemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTemplateValueImpl extends ValueImpl implements ObjectTemplateValue {
	/**
	 * The cached value of the '{@link #getObjecttemplate() <em>Objecttemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjecttemplate()
	 * @generated
	 * @ordered
	 */
	protected ObjectTemplate objecttemplate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTemplateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlPackage.Literals.OBJECT_TEMPLATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplate getObjecttemplate() {
		if (objecttemplate != null && objecttemplate.eIsProxy()) {
			InternalEObject oldObjecttemplate = (InternalEObject)objecttemplate;
			objecttemplate = (ObjectTemplate)eResolveProxy(oldObjecttemplate);
			if (objecttemplate != oldObjecttemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE, oldObjecttemplate, objecttemplate));
			}
		}
		return objecttemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplate basicGetObjecttemplate() {
		return objecttemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjecttemplate(ObjectTemplate newObjecttemplate) {
		ObjectTemplate oldObjecttemplate = objecttemplate;
		objecttemplate = newObjecttemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE, oldObjecttemplate, objecttemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE:
				if (resolve) return getObjecttemplate();
				return basicGetObjecttemplate();
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
			case MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE:
				setObjecttemplate((ObjectTemplate)newValue);
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
			case MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE:
				setObjecttemplate((ObjectTemplate)null);
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
			case MinitlPackage.OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE:
				return objecttemplate != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectTemplateValueImpl
