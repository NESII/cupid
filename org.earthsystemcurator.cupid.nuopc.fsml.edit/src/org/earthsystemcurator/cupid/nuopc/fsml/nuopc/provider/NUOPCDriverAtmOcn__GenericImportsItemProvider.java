/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.provider;


import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NUOPCDriverAtmOcn__GenericImportsItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__GenericImportsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addImportsGenericSSPropertyDescriptor(object);
			addImportsTypeDriverISPropertyDescriptor(object);
			addImportsLabelSetModelCountPropertyDescriptor(object);
			addImportsLabelSetModelServicesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Imports Generic SS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsGenericSSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriverAtmOcn__GenericImports_importsGenericSS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriverAtmOcn__GenericImports_importsGenericSS_feature", "_UI_NUOPCDriverAtmOcn__GenericImports_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_GENERIC_SS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports Type Driver IS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsTypeDriverISPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriverAtmOcn__GenericImports_importsTypeDriverIS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriverAtmOcn__GenericImports_importsTypeDriverIS_feature", "_UI_NUOPCDriverAtmOcn__GenericImports_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports Label Set Model Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsLabelSetModelCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriverAtmOcn__GenericImports_importsLabelSetModelCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriverAtmOcn__GenericImports_importsLabelSetModelCount_feature", "_UI_NUOPCDriverAtmOcn__GenericImports_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports Label Set Model Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsLabelSetModelServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NUOPCDriverAtmOcn__GenericImports_importsLabelSetModelServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NUOPCDriverAtmOcn__GenericImports_importsLabelSetModelServices_feature", "_UI_NUOPCDriverAtmOcn__GenericImports_type"),
				 NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NUOPCDriverAtmOcn__GenericImports.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NUOPCDriverAtmOcn__GenericImports"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NUOPCDriverAtmOcn__GenericImports)object).getImportsGenericSS();
		return label == null || label.length() == 0 ?
			getString("_UI_NUOPCDriverAtmOcn__GenericImports_type") :
			getString("_UI_NUOPCDriverAtmOcn__GenericImports_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NUOPCDriverAtmOcn__GenericImports.class)) {
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT:
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NuopcEditPlugin.INSTANCE;
	}

}
