/*
* generated by Xtext
*/
package org.earthsystemmodeling.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.earthsystemmodeling.services.PsycheGrammarAccess;

public class PsycheParser extends AbstractContentAssistParser {
	
	@Inject
	private PsycheGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.earthsystemmodeling.ui.contentassist.antlr.internal.InternalPsycheParser createParser() {
		org.earthsystemmodeling.ui.contentassist.antlr.internal.InternalPsycheParser result = new org.earthsystemmodeling.ui.contentassist.antlr.internal.InternalPsycheParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSubconceptOrAttributeAccess().getAlternatives(), "rule__SubconceptOrAttribute__Alternatives");
					put(grammarAccess.getSubconceptAccess().getAlternatives_2(), "rule__Subconcept__Alternatives_2");
					put(grammarAccess.getSubconceptAccess().getAlternatives_3(), "rule__Subconcept__Alternatives_3");
					put(grammarAccess.getAttributeAccess().getAlternatives_3(), "rule__Attribute__Alternatives_3");
					put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
					put(grammarAccess.getImplicitContextMappingAccess().getAlternatives(), "rule__ImplicitContextMapping__Alternatives");
					put(grammarAccess.getIntentAccess().getAlternatives(), "rule__Intent__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getLocalExpressionAccess().getAlternatives(), "rule__LocalExpression__Alternatives");
					put(grammarAccess.getExprAccess().getAlternatives(), "rule__Expr__Alternatives");
					put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
					put(grammarAccess.getLanguageAccess().getGroup(), "rule__Language__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_1(), "rule__Annotation__Group_1__0");
					put(grammarAccess.getAnonymousConceptDefAccess().getGroup(), "rule__AnonymousConceptDef__Group__0");
					put(grammarAccess.getAnonymousConceptDefAccess().getGroup_1(), "rule__AnonymousConceptDef__Group_1__0");
					put(grammarAccess.getAnonymousConceptDefAccess().getGroup_2(), "rule__AnonymousConceptDef__Group_2__0");
					put(grammarAccess.getNamedConceptDefAccess().getGroup(), "rule__NamedConceptDef__Group__0");
					put(grammarAccess.getNamedConceptDefAccess().getGroup_2(), "rule__NamedConceptDef__Group_2__0");
					put(grammarAccess.getNamedConceptDefAccess().getGroup_3(), "rule__NamedConceptDef__Group_3__0");
					put(grammarAccess.getTopConceptDefAccess().getGroup(), "rule__TopConceptDef__Group__0");
					put(grammarAccess.getTopConceptDefAccess().getGroup_3(), "rule__TopConceptDef__Group_3__0");
					put(grammarAccess.getTopConceptDefAccess().getGroup_4(), "rule__TopConceptDef__Group_4__0");
					put(grammarAccess.getSubconceptAccess().getGroup(), "rule__Subconcept__Group__0");
					put(grammarAccess.getSubconceptAccess().getGroup_3_0(), "rule__Subconcept__Group_3_0__0");
					put(grammarAccess.getSubconceptAccess().getGroup_3_2(), "rule__Subconcept__Group_3_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_5(), "rule__Attribute__Group_5__0");
					put(grammarAccess.getMappingAccess().getGroup(), "rule__Mapping__Group__0");
					put(grammarAccess.getMappingAccess().getGroup_2(), "rule__Mapping__Group_2__0");
					put(grammarAccess.getMappingAccess().getGroup_3(), "rule__Mapping__Group_3__0");
					put(grammarAccess.getImplicitContextMappingAccess().getGroup_9(), "rule__ImplicitContextMapping__Group_9__0");
					put(grammarAccess.getModuleAccess().getGroup(), "rule__Module__Group__0");
					put(grammarAccess.getModuleAccess().getGroup_2(), "rule__Module__Group_2__0");
					put(grammarAccess.getModuleNameAccess().getGroup(), "rule__ModuleName__Group__0");
					put(grammarAccess.getUsesModuleAccess().getGroup(), "rule__UsesModule__Group__0");
					put(grammarAccess.getUsesEntityAccess().getGroup(), "rule__UsesEntity__Group__0");
					put(grammarAccess.getSubroutineAccess().getGroup(), "rule__Subroutine__Group__0");
					put(grammarAccess.getSubroutineAccess().getGroup_3(), "rule__Subroutine__Group_3__0");
					put(grammarAccess.getSubroutineAccess().getGroup_3_1(), "rule__Subroutine__Group_3_1__0");
					put(grammarAccess.getSubroutineAccess().getGroup_3_1_1(), "rule__Subroutine__Group_3_1_1__0");
					put(grammarAccess.getFormalParamAccess().getGroup(), "rule__FormalParam__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_4(), "rule__Type__Group_4__0");
					put(grammarAccess.getTypeAccess().getGroup_5(), "rule__Type__Group_5__0");
					put(grammarAccess.getSubroutineNameAccess().getGroup(), "rule__SubroutineName__Group__0");
					put(grammarAccess.getSubroutineNameAccess().getGroup_2(), "rule__SubroutineName__Group_2__0");
					put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
					put(grammarAccess.getCallAccess().getGroup_3(), "rule__Call__Group_3__0");
					put(grammarAccess.getCallAccess().getGroup_3_1(), "rule__Call__Group_3_1__0");
					put(grammarAccess.getCallAccess().getGroup_3_1_1(), "rule__Call__Group_3_1_1__0");
					put(grammarAccess.getActualParamAccess().getGroup(), "rule__ActualParam__Group__0");
					put(grammarAccess.getActualParamAccess().getGroup_0(), "rule__ActualParam__Group_0__0");
					put(grammarAccess.getActualParamByKeywordAccess().getGroup(), "rule__ActualParamByKeyword__Group__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getFunctionAssignmentAccess().getGroup(), "rule__FunctionAssignment__Group__0");
					put(grammarAccess.getFunctionAssignmentAccess().getGroup_5(), "rule__FunctionAssignment__Group_5__0");
					put(grammarAccess.getFunctionAssignmentAccess().getGroup_5_1(), "rule__FunctionAssignment__Group_5_1__0");
					put(grammarAccess.getFunctionAssignmentAccess().getGroup_5_1_1(), "rule__FunctionAssignment__Group_5_1_1__0");
					put(grammarAccess.getArrayConstructorAccess().getGroup(), "rule__ArrayConstructor__Group__0");
					put(grammarAccess.getArrayConstructorAccess().getGroup_3(), "rule__ArrayConstructor__Group_3__0");
					put(grammarAccess.getPathExprAccess().getGroup(), "rule__PathExpr__Group__0");
					put(grammarAccess.getPathExprNodeAccess().getGroup(), "rule__PathExprNode__Group__0");
					put(grammarAccess.getPathExprNodeAccess().getGroup_1(), "rule__PathExprNode__Group_1__0");
					put(grammarAccess.getPathExprTermAccess().getGroup(), "rule__PathExprTerm__Group__0");
					put(grammarAccess.getLanguageAccess().getNameAssignment_1(), "rule__Language__NameAssignment_1");
					put(grammarAccess.getLanguageAccess().getUriAssignment_2(), "rule__Language__UriAssignment_2");
					put(grammarAccess.getLanguageAccess().getConceptDefAssignment_4(), "rule__Language__ConceptDefAssignment_4");
					put(grammarAccess.getLanguageAccess().getConceptDefAssignment_5(), "rule__Language__ConceptDefAssignment_5");
					put(grammarAccess.getAnnotationAccess().getKeyAssignment_0(), "rule__Annotation__KeyAssignment_0");
					put(grammarAccess.getAnnotationAccess().getValueAssignment_1_1(), "rule__Annotation__ValueAssignment_1_1");
					put(grammarAccess.getAnonymousConceptDefAccess().getMappingAssignment_1_1(), "rule__AnonymousConceptDef__MappingAssignment_1_1");
					put(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAssignment_2_1(), "rule__AnonymousConceptDef__AnnotationAssignment_2_1");
					put(grammarAccess.getAnonymousConceptDefAccess().getChildAssignment_2_2(), "rule__AnonymousConceptDef__ChildAssignment_2_2");
					put(grammarAccess.getNamedConceptDefAccess().getNamedAssignment_0(), "rule__NamedConceptDef__NamedAssignment_0");
					put(grammarAccess.getNamedConceptDefAccess().getNameAssignment_1(), "rule__NamedConceptDef__NameAssignment_1");
					put(grammarAccess.getNamedConceptDefAccess().getMappingAssignment_2_1(), "rule__NamedConceptDef__MappingAssignment_2_1");
					put(grammarAccess.getNamedConceptDefAccess().getAnnotationAssignment_3_1(), "rule__NamedConceptDef__AnnotationAssignment_3_1");
					put(grammarAccess.getNamedConceptDefAccess().getChildAssignment_3_2(), "rule__NamedConceptDef__ChildAssignment_3_2");
					put(grammarAccess.getTopConceptDefAccess().getTopAssignment_0(), "rule__TopConceptDef__TopAssignment_0");
					put(grammarAccess.getTopConceptDefAccess().getNamedAssignment_1(), "rule__TopConceptDef__NamedAssignment_1");
					put(grammarAccess.getTopConceptDefAccess().getNameAssignment_2(), "rule__TopConceptDef__NameAssignment_2");
					put(grammarAccess.getTopConceptDefAccess().getMappingAssignment_3_1(), "rule__TopConceptDef__MappingAssignment_3_1");
					put(grammarAccess.getTopConceptDefAccess().getAnnotationAssignment_4_1(), "rule__TopConceptDef__AnnotationAssignment_4_1");
					put(grammarAccess.getTopConceptDefAccess().getChildAssignment_4_2(), "rule__TopConceptDef__ChildAssignment_4_2");
					put(grammarAccess.getSubconceptAccess().getNameAssignment_0(), "rule__Subconcept__NameAssignment_0");
					put(grammarAccess.getSubconceptAccess().getCardinalityAssignment_1(), "rule__Subconcept__CardinalityAssignment_1");
					put(grammarAccess.getSubconceptAccess().getEssentialAssignment_2_0(), "rule__Subconcept__EssentialAssignment_2_0");
					put(grammarAccess.getSubconceptAccess().getMustBeNullAssignment_2_1(), "rule__Subconcept__MustBeNullAssignment_2_1");
					put(grammarAccess.getSubconceptAccess().getDefAssignment_3_0_1(), "rule__Subconcept__DefAssignment_3_0_1");
					put(grammarAccess.getSubconceptAccess().getDefAssignment_3_1(), "rule__Subconcept__DefAssignment_3_1");
					put(grammarAccess.getSubconceptAccess().getReferenceAssignment_3_2_0(), "rule__Subconcept__ReferenceAssignment_3_2_0");
					put(grammarAccess.getSubconceptAccess().getRefAssignment_3_2_1(), "rule__Subconcept__RefAssignment_3_2_1");
					put(grammarAccess.getAttributeAccess().getAttribAssignment_0(), "rule__Attribute__AttribAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getCardinalityAssignment_2(), "rule__Attribute__CardinalityAssignment_2");
					put(grammarAccess.getAttributeAccess().getEssentialAssignment_3_0(), "rule__Attribute__EssentialAssignment_3_0");
					put(grammarAccess.getAttributeAccess().getMustBeNullAssignment_3_1(), "rule__Attribute__MustBeNullAssignment_3_1");
					put(grammarAccess.getAttributeAccess().getAttribMappingAssignment_4_1(), "rule__Attribute__AttribMappingAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getAnnotationAssignment_5_1(), "rule__Attribute__AnnotationAssignment_5_1");
					put(grammarAccess.getCardinalityAccess().getZeroOrOneAssignment_0(), "rule__Cardinality__ZeroOrOneAssignment_0");
					put(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_1(), "rule__Cardinality__ZeroOrMoreAssignment_1");
					put(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_2(), "rule__Cardinality__OneOrMoreAssignment_2");
					put(grammarAccess.getMappingAccess().getContextAssignment_0(), "rule__Mapping__ContextAssignment_0");
					put(grammarAccess.getMappingAccess().getMappingAssignment_1(), "rule__Mapping__MappingAssignment_1");
					put(grammarAccess.getMappingAccess().getBeforeAssignment_2_2(), "rule__Mapping__BeforeAssignment_2_2");
					put(grammarAccess.getMappingAccess().getAfterAssignment_3_2(), "rule__Mapping__AfterAssignment_3_2");
					put(grammarAccess.getModuleAccess().getNameAssignment_2_1(), "rule__Module__NameAssignment_2_1");
					put(grammarAccess.getUsesModuleAccess().getNameAssignment_2(), "rule__UsesModule__NameAssignment_2");
					put(grammarAccess.getUsesEntityAccess().getNameAssignment_2(), "rule__UsesEntity__NameAssignment_2");
					put(grammarAccess.getSubroutineAccess().getNameAssignment_2(), "rule__Subroutine__NameAssignment_2");
					put(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0(), "rule__Subroutine__ParamsAssignment_3_1_0");
					put(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1(), "rule__Subroutine__ParamsAssignment_3_1_1_1");
					put(grammarAccess.getFormalParamAccess().getIntentAssignment_0(), "rule__FormalParam__IntentAssignment_0");
					put(grammarAccess.getFormalParamAccess().getTypeAssignment_1(), "rule__FormalParam__TypeAssignment_1");
					put(grammarAccess.getFormalParamAccess().getNameAssignment_2(), "rule__FormalParam__NameAssignment_2");
					put(grammarAccess.getIntentAccess().getInAssignment_0(), "rule__Intent__InAssignment_0");
					put(grammarAccess.getIntentAccess().getOutAssignment_1(), "rule__Intent__OutAssignment_1");
					put(grammarAccess.getIntentAccess().getInoutAssignment_2(), "rule__Intent__InoutAssignment_2");
					put(grammarAccess.getTypeAccess().getIntegerAssignment_0(), "rule__Type__IntegerAssignment_0");
					put(grammarAccess.getTypeAccess().getCharacterAssignment_1(), "rule__Type__CharacterAssignment_1");
					put(grammarAccess.getTypeAccess().getLogicalAssignment_2(), "rule__Type__LogicalAssignment_2");
					put(grammarAccess.getTypeAccess().getRealAssignment_3(), "rule__Type__RealAssignment_3");
					put(grammarAccess.getTypeAccess().getDoubleAssignment_4_0(), "rule__Type__DoubleAssignment_4_0");
					put(grammarAccess.getTypeAccess().getDerivedAssignment_5_0(), "rule__Type__DerivedAssignment_5_0");
					put(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2(), "rule__Type__DerivedTypeAssignment_5_2");
					put(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1(), "rule__SubroutineName__NameAssignment_2_1");
					put(grammarAccess.getCallAccess().getSubroutineNameAssignment_2(), "rule__Call__SubroutineNameAssignment_2");
					put(grammarAccess.getCallAccess().getParamsAssignment_3_1_0(), "rule__Call__ParamsAssignment_3_1_0");
					put(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1(), "rule__Call__ParamsAssignment_3_1_1_1");
					put(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0(), "rule__ActualParam__KeywordAssignment_0_0");
					put(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1(), "rule__ActualParam__OptionalAssignment_0_1");
					put(grammarAccess.getActualParamAccess().getValueAssignment_1(), "rule__ActualParam__ValueAssignment_1");
					put(grammarAccess.getActualParamByKeywordAccess().getKeywordAssignment_2(), "rule__ActualParamByKeyword__KeywordAssignment_2");
					put(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2(), "rule__VariableDeclaration__TypeAssignment_2");
					put(grammarAccess.getFunctionAssignmentAccess().getLhsAssignment_2(), "rule__FunctionAssignment__LhsAssignment_2");
					put(grammarAccess.getFunctionAssignmentAccess().getFunctionNameAssignment_4(), "rule__FunctionAssignment__FunctionNameAssignment_4");
					put(grammarAccess.getFunctionAssignmentAccess().getParamsAssignment_5_1_0(), "rule__FunctionAssignment__ParamsAssignment_5_1_0");
					put(grammarAccess.getFunctionAssignmentAccess().getParamsAssignment_5_1_1_1(), "rule__FunctionAssignment__ParamsAssignment_5_1_1_1");
					put(grammarAccess.getLocalExpressionAccess().getIdAssignment_0(), "rule__LocalExpression__IdAssignment_0");
					put(grammarAccess.getLocalExpressionAccess().getLiteralAssignment_1(), "rule__LocalExpression__LiteralAssignment_1");
					put(grammarAccess.getLocalExpressionAccess().getArrayConstructorAssignment_2(), "rule__LocalExpression__ArrayConstructorAssignment_2");
					put(grammarAccess.getArrayConstructorAccess().getItemAssignment_2(), "rule__ArrayConstructor__ItemAssignment_2");
					put(grammarAccess.getArrayConstructorAccess().getItemAssignment_3_1(), "rule__ArrayConstructor__ItemAssignment_3_1");
					put(grammarAccess.getExprAccess().getWildcardAssignment_0(), "rule__Expr__WildcardAssignment_0");
					put(grammarAccess.getExprAccess().getExprAssignment_1(), "rule__Expr__ExprAssignment_1");
					put(grammarAccess.getExprAccess().getPathExprAssignment_2(), "rule__Expr__PathExprAssignment_2");
					put(grammarAccess.getPathExprNodeAccess().getTailAssignment_1_2(), "rule__PathExprNode__TailAssignment_1_2");
					put(grammarAccess.getPathExprTermAccess().getAxisAssignment_1(), "rule__PathExprTerm__AxisAssignment_1");
					put(grammarAccess.getPathExprTermAccess().getRefAssignment_2(), "rule__PathExprTerm__RefAssignment_2");
					put(grammarAccess.getAxisAccess().getAncestorAssignment(), "rule__Axis__AncestorAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.earthsystemmodeling.ui.contentassist.antlr.internal.InternalPsycheParser typedParser = (org.earthsystemmodeling.ui.contentassist.antlr.internal.InternalPsycheParser) parser;
			typedParser.entryRuleLanguage();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PsycheGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PsycheGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
