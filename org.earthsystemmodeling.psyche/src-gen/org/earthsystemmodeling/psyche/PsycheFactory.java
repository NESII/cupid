/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.psyche.PsychePackage
 * @generated
 */
public interface PsycheFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PsycheFactory eINSTANCE = org.earthsystemmodeling.psyche.impl.PsycheFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language</em>'.
   * @generated
   */
  Language createLanguage();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Concept Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept Def</em>'.
   * @generated
   */
  ConceptDef createConceptDef();

  /**
   * Returns a new object of class '<em>Subconcept Or Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subconcept Or Attribute</em>'.
   * @generated
   */
  SubconceptOrAttribute createSubconceptOrAttribute();

  /**
   * Returns a new object of class '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality</em>'.
   * @generated
   */
  Cardinality createCardinality();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Implicit Context Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implicit Context Mapping</em>'.
   * @generated
   */
  ImplicitContextMapping createImplicitContextMapping();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Name</em>'.
   * @generated
   */
  ModuleName createModuleName();

  /**
   * Returns a new object of class '<em>Uses Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Module</em>'.
   * @generated
   */
  UsesModule createUsesModule();

  /**
   * Returns a new object of class '<em>Uses Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Entity</em>'.
   * @generated
   */
  UsesEntity createUsesEntity();

  /**
   * Returns a new object of class '<em>Subroutine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subroutine</em>'.
   * @generated
   */
  Subroutine createSubroutine();

  /**
   * Returns a new object of class '<em>Formal Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Param</em>'.
   * @generated
   */
  FormalParam createFormalParam();

  /**
   * Returns a new object of class '<em>Intent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intent</em>'.
   * @generated
   */
  Intent createIntent();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Subroutine Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subroutine Name</em>'.
   * @generated
   */
  SubroutineName createSubroutineName();

  /**
   * Returns a new object of class '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call</em>'.
   * @generated
   */
  Call createCall();

  /**
   * Returns a new object of class '<em>Actual Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Param</em>'.
   * @generated
   */
  ActualParam createActualParam();

  /**
   * Returns a new object of class '<em>Actual Param By Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Param By Keyword</em>'.
   * @generated
   */
  ActualParamByKeyword createActualParamByKeyword();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Function Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Assignment</em>'.
   * @generated
   */
  FunctionAssignment createFunctionAssignment();

  /**
   * Returns a new object of class '<em>Local Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Expression</em>'.
   * @generated
   */
  LocalExpression createLocalExpression();

  /**
   * Returns a new object of class '<em>Array Constructor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Constructor</em>'.
   * @generated
   */
  ArrayConstructor createArrayConstructor();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expr</em>'.
   * @generated
   */
  PathExpr createPathExpr();

  /**
   * Returns a new object of class '<em>Axis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axis</em>'.
   * @generated
   */
  Axis createAxis();

  /**
   * Returns a new object of class '<em>Declared Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declared Entity</em>'.
   * @generated
   */
  DeclaredEntity createDeclaredEntity();

  /**
   * Returns a new object of class '<em>Path Expr Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expr Term</em>'.
   * @generated
   */
  PathExprTerm createPathExprTerm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PsychePackage getPsychePackage();

} //PsycheFactory
