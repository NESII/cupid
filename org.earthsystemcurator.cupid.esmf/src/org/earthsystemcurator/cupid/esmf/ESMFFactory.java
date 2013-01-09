/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage
 * @generated
 */
public interface ESMFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ESMFFactory eINSTANCE = org.earthsystemcurator.cupid.esmf.impl.ESMFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gridded Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gridded Component</em>'.
	 * @generated
	 */
	ESMFGriddedComponent createESMFGriddedComponent();

	/**
	 * Returns a new object of class '<em>Coupler Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupler Component</em>'.
	 * @generated
	 */
	ESMFCouplerComponent createESMFCouplerComponent();

	/**
	 * Returns a new object of class '<em>Simple Coupler Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Coupler Component</em>'.
	 * @generated
	 */
	ESMFSimpleCouplerComponent createESMFSimpleCouplerComponent();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	ESMFMethod createESMFMethod();

	/**
	 * Returns a new object of class '<em>Init Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Method</em>'.
	 * @generated
	 */
	ESMFInitMethod createESMFInitMethod();

	/**
	 * Returns a new object of class '<em>Pre Init Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Init Method SIDL</em>'.
	 * @generated
	 */
	ESMFPreInitMethodSIDL createESMFPreInitMethodSIDL();

	/**
	 * Returns a new object of class '<em>Post Init Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Init Method SIDL</em>'.
	 * @generated
	 */
	ESMFPostInitMethodSIDL createESMFPostInitMethodSIDL();

	/**
	 * Returns a new object of class '<em>Run Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Method</em>'.
	 * @generated
	 */
	ESMFRunMethod createESMFRunMethod();

	/**
	 * Returns a new object of class '<em>Finalize Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalize Method</em>'.
	 * @generated
	 */
	ESMFFinalizeMethod createESMFFinalizeMethod();

	/**
	 * Returns a new object of class '<em>Finalize Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finalize Method SIDL</em>'.
	 * @generated
	 */
	ESMFFinalizeMethodSIDL createESMFFinalizeMethodSIDL();

	/**
	 * Returns a new object of class '<em>Register Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register Method</em>'.
	 * @generated
	 */
	ESMFRegisterMethod createESMFRegisterMethod();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	ESMFTimeInterval createESMFTimeInterval();

	/**
	 * Returns a new object of class '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time</em>'.
	 * @generated
	 */
	ESMFTime createESMFTime();

	/**
	 * Returns a new object of class '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock</em>'.
	 * @generated
	 */
	ESMFClock createESMFClock();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	ESMFState createESMFState();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	ESMFField createESMFField();

	/**
	 * Returns a new object of class '<em>Field Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Connection</em>'.
	 * @generated
	 */
	ESMFFieldConnection createESMFFieldConnection();

	/**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
	ESMFArray createESMFArray();

	/**
	 * Returns a new object of class '<em>Route Handle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route Handle</em>'.
	 * @generated
	 */
	ESMFRouteHandle createESMFRouteHandle();

	/**
	 * Returns a new object of class '<em>Array Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Spec</em>'.
	 * @generated
	 */
	ESMFArraySpec createESMFArraySpec();

	/**
	 * Returns a new object of class '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid</em>'.
	 * @generated
	 */
	ESMFGrid createESMFGrid();

	/**
	 * Returns a new object of class '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extent</em>'.
	 * @generated
	 */
	Extent createExtent();

	/**
	 * Returns a new object of class '<em>Dist Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dist Grid</em>'.
	 * @generated
	 */
	ESMFDistGrid createESMFDistGrid();

	/**
	 * Returns a new object of class '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	ESMFWorkspace createESMFWorkspace();

	/**
	 * Returns a new object of class '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Machine</em>'.
	 * @generated
	 */
	ESMFVirtualMachine createESMFVirtualMachine();

	/**
	 * Returns a new object of class '<em>Persistent Execution Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistent Execution Thread</em>'.
	 * @generated
	 */
	ESMFPersistentExecutionThread createESMFPersistentExecutionThread();

	/**
	 * Returns a new object of class '<em>DE Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DE Layout</em>'.
	 * @generated
	 */
	ESMFDELayout createESMFDELayout();

	/**
	 * Returns a new object of class '<em>Decomposition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decomposition Element</em>'.
	 * @generated
	 */
	ESMFDecompositionElement createESMFDecompositionElement();

	/**
	 * Returns a new object of class '<em>Virtual Address Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Virtual Address Space</em>'.
	 * @generated
	 */
	ESMFVirtualAddressSpace createESMFVirtualAddressSpace();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	ESMFAction createESMFAction();

	/**
	 * Returns a new object of class '<em>Action Method Invoke Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Method Invoke Pattern</em>'.
	 * @generated
	 */
	ESMFActionMethodInvokePattern createESMFActionMethodInvokePattern();

	/**
	 * Returns a new object of class '<em>Action Method Invoke Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Method Invoke Sequence</em>'.
	 * @generated
	 */
	ESMFActionMethodInvokeSequence createESMFActionMethodInvokeSequence();

	/**
	 * Returns a new object of class '<em>Action Method Invoke Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Method Invoke Iteration</em>'.
	 * @generated
	 */
	ESMFActionMethodInvokeIteration createESMFActionMethodInvokeIteration();

	/**
	 * Returns a new object of class '<em>Action State Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action State Add</em>'.
	 * @generated
	 */
	ESMFActionStateAdd createESMFActionStateAdd();

	/**
	 * Returns a new object of class '<em>Action State Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action State Create</em>'.
	 * @generated
	 */
	ESMFActionStateCreate createESMFActionStateCreate();

	/**
	 * Returns a new object of class '<em>Action State Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action State Get</em>'.
	 * @generated
	 */
	ESMFActionStateGet createESMFActionStateGet();

	/**
	 * Returns a new object of class '<em>Action State Reconcile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action State Reconcile</em>'.
	 * @generated
	 */
	ESMFActionStateReconcile createESMFActionStateReconcile();

	/**
	 * Returns a new object of class '<em>Action Array Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Array Create</em>'.
	 * @generated
	 */
	ESMFActionArrayCreate createESMFActionArrayCreate();

	/**
	 * Returns a new object of class '<em>Action Array Create Allocate AS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Array Create Allocate AS</em>'.
	 * @generated
	 */
	ESMFActionArrayCreateAllocateAS createESMFActionArrayCreateAllocateAS();

	/**
	 * Returns a new object of class '<em>Action Array Spec Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Array Spec Set</em>'.
	 * @generated
	 */
	ESMFActionArraySpecSet createESMFActionArraySpecSet();

	/**
	 * Returns a new object of class '<em>Action Clock Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Clock Create</em>'.
	 * @generated
	 */
	ESMFActionClockCreate createESMFActionClockCreate();

	/**
	 * Returns a new object of class '<em>Action Clock Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Clock Get</em>'.
	 * @generated
	 */
	ESMFActionClockGet createESMFActionClockGet();

	/**
	 * Returns a new object of class '<em>Action Clock Get Timestep</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Clock Get Timestep</em>'.
	 * @generated
	 */
	ESMFActionClockGetTimestep createESMFActionClockGetTimestep();

	/**
	 * Returns a new object of class '<em>Action Cpl Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Cpl Comp Create</em>'.
	 * @generated
	 */
	ESMFActionCplCompCreate createESMFActionCplCompCreate();

	/**
	 * Returns a new object of class '<em>Action Cpl Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Cpl Comp Initialize</em>'.
	 * @generated
	 */
	ESMFActionCplCompInitialize createESMFActionCplCompInitialize();

	/**
	 * Returns a new object of class '<em>Action Cpl Comp Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Cpl Comp Run</em>'.
	 * @generated
	 */
	ESMFActionCplCompRun createESMFActionCplCompRun();

	/**
	 * Returns a new object of class '<em>Action Cpl Comp Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Cpl Comp Finalize</em>'.
	 * @generated
	 */
	ESMFActionCplCompFinalize createESMFActionCplCompFinalize();

	/**
	 * Returns a new object of class '<em>Action Cpl Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Cpl Comp Set Services</em>'.
	 * @generated
	 */
	ESMFActionCplCompSetServices createESMFActionCplCompSetServices();

	/**
	 * Returns a new object of class '<em>Action Dist Grid Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Dist Grid Create</em>'.
	 * @generated
	 */
	ESMFActionDistGridCreate createESMFActionDistGridCreate();

	/**
	 * Returns a new object of class '<em>Action Field Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Create</em>'.
	 * @generated
	 */
	ESMFActionFieldCreate createESMFActionFieldCreate();

	/**
	 * Returns a new object of class '<em>Action Field Create Grid Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Create Grid Array</em>'.
	 * @generated
	 */
	ESMFActionFieldCreateGridArray createESMFActionFieldCreateGridArray();

	/**
	 * Returns a new object of class '<em>Action Field Create Grid Array Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Create Grid Array Spec</em>'.
	 * @generated
	 */
	ESMFActionFieldCreateGridArraySpec createESMFActionFieldCreateGridArraySpec();

	/**
	 * Returns a new object of class '<em>Action Field Create TKR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Create TKR</em>'.
	 * @generated
	 */
	ESMFActionFieldCreateTKR createESMFActionFieldCreateTKR();

	/**
	 * Returns a new object of class '<em>Action Field Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Get</em>'.
	 * @generated
	 */
	ESMFActionFieldGet createESMFActionFieldGet();

	/**
	 * Returns a new object of class '<em>Action Field Get Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Get Bounds</em>'.
	 * @generated
	 */
	ESMFActionFieldGetBounds createESMFActionFieldGetBounds();

	/**
	 * Returns a new object of class '<em>Action Field Halo Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Halo Store</em>'.
	 * @generated
	 */
	ESMFActionFieldHaloStore createESMFActionFieldHaloStore();

	/**
	 * Returns a new object of class '<em>Action Field Halo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Halo</em>'.
	 * @generated
	 */
	ESMFActionFieldHalo createESMFActionFieldHalo();

	/**
	 * Returns a new object of class '<em>Action Field Halo Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Halo Release</em>'.
	 * @generated
	 */
	ESMFActionFieldHaloRelease createESMFActionFieldHaloRelease();

	/**
	 * Returns a new object of class '<em>Action Field Redist Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Redist Store</em>'.
	 * @generated
	 */
	ESMFActionFieldRedistStore createESMFActionFieldRedistStore();

	/**
	 * Returns a new object of class '<em>Action Field Redist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Redist</em>'.
	 * @generated
	 */
	ESMFActionFieldRedist createESMFActionFieldRedist();

	/**
	 * Returns a new object of class '<em>Action Field Redist Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Field Redist Release</em>'.
	 * @generated
	 */
	ESMFActionFieldRedistRelease createESMFActionFieldRedistRelease();

	/**
	 * Returns a new object of class '<em>Action Framework Init</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Framework Init</em>'.
	 * @generated
	 */
	ESMFActionFrameworkInit createESMFActionFrameworkInit();

	/**
	 * Returns a new object of class '<em>Action Framework Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Framework Finalize</em>'.
	 * @generated
	 */
	ESMFActionFrameworkFinalize createESMFActionFrameworkFinalize();

	/**
	 * Returns a new object of class '<em>Action Grid Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Create</em>'.
	 * @generated
	 */
	ESMFActionGridCreate createESMFActionGridCreate();

	/**
	 * Returns a new object of class '<em>Action Grid Get PLocal De</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Get PLocal De</em>'.
	 * @generated
	 */
	ESMFActionGridGetPLocalDe createESMFActionGridGetPLocalDe();

	/**
	 * Returns a new object of class '<em>Action Grid Get PLocal De PSloc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Get PLocal De PSloc</em>'.
	 * @generated
	 */
	ESMFActionGridGetPLocalDePSloc createESMFActionGridGetPLocalDePSloc();

	/**
	 * Returns a new object of class '<em>Action Grid Get Coord</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Get Coord</em>'.
	 * @generated
	 */
	ESMFActionGridGetCoord createESMFActionGridGetCoord();

	/**
	 * Returns a new object of class '<em>Action Grid Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Comp Create</em>'.
	 * @generated
	 */
	ESMFActionGridCompCreate createESMFActionGridCompCreate();

	/**
	 * Returns a new object of class '<em>Action Grid Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Comp Initialize</em>'.
	 * @generated
	 */
	ESMFActionGridCompInitialize createESMFActionGridCompInitialize();

	/**
	 * Returns a new object of class '<em>Action Grid Comp Run</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Comp Run</em>'.
	 * @generated
	 */
	ESMFActionGridCompRun createESMFActionGridCompRun();

	/**
	 * Returns a new object of class '<em>Action Grid Comp Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Comp Finalize</em>'.
	 * @generated
	 */
	ESMFActionGridCompFinalize createESMFActionGridCompFinalize();

	/**
	 * Returns a new object of class '<em>Action Grid Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Grid Comp Set Services</em>'.
	 * @generated
	 */
	ESMFActionGridCompSetServices createESMFActionGridCompSetServices();

	/**
	 * Returns a new object of class '<em>Action Method Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Method Invoke</em>'.
	 * @generated
	 */
	ESMFActionMethodInvoke createESMFActionMethodInvoke();

	/**
	 * Returns a new object of class '<em>Action Time Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Time Set</em>'.
	 * @generated
	 */
	ESMFActionTimeSet createESMFActionTimeSet();

	/**
	 * Returns a new object of class '<em>Action Time Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Time Get</em>'.
	 * @generated
	 */
	ESMFActionTimeGet createESMFActionTimeGet();

	/**
	 * Returns a new object of class '<em>Action Time Interval Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Time Interval Set</em>'.
	 * @generated
	 */
	ESMFActionTimeIntervalSet createESMFActionTimeIntervalSet();

	/**
	 * Returns a new object of class '<em>Action Time Interval Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Time Interval Get</em>'.
	 * @generated
	 */
	ESMFActionTimeIntervalGet createESMFActionTimeIntervalGet();

	/**
	 * Returns a new object of class '<em>Action User Service Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action User Service Invoke</em>'.
	 * @generated
	 */
	ESMFActionUserServiceInvoke createESMFActionUserServiceInvoke();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	ESMFCall createESMFCall();

	/**
	 * Returns a new object of class '<em>Call Grid Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Grid Comp Create</em>'.
	 * @generated
	 */
	ESMFCallGridCompCreate createESMFCallGridCompCreate();

	/**
	 * Returns a new object of class '<em>Call Grid Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Grid Comp Initialize</em>'.
	 * @generated
	 */
	ESMFCallGridCompInitialize createESMFCallGridCompInitialize();

	/**
	 * Returns a new object of class '<em>Call Grid Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Grid Comp Set Services</em>'.
	 * @generated
	 */
	ESMFCallGridCompSetServices createESMFCallGridCompSetServices();

	/**
	 * Returns a new object of class '<em>Call Cpl Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Cpl Comp Create</em>'.
	 * @generated
	 */
	ESMFCallCplCompCreate createESMFCallCplCompCreate();

	/**
	 * Returns a new object of class '<em>Call Cpl Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Cpl Comp Initialize</em>'.
	 * @generated
	 */
	ESMFCallCplCompInitialize createESMFCallCplCompInitialize();

	/**
	 * Returns a new object of class '<em>Call Cpl Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Cpl Comp Set Services</em>'.
	 * @generated
	 */
	ESMFCallCplCompSetServices createESMFCallCplCompSetServices();

	/**
	 * Returns a new object of class '<em>Call Field Create SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Field Create SIDL</em>'.
	 * @generated
	 */
	ESMFCallFieldCreateSIDL createESMFCallFieldCreateSIDL();

	/**
	 * Returns a new object of class '<em>Call SIDL Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call SIDL Method</em>'.
	 * @generated
	 */
	ESMFCallSIDLMethod createESMFCallSIDLMethod();

	/**
	 * Returns a new object of class '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Entity</em>'.
	 * @generated
	 */
	ESMFNamedEntity createESMFNamedEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ESMFPackage getESMFPackage();

} //ESMFFactory