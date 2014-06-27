/*
 * generated by Xtext
 */
package org.earthsystemcurator.generator

import org.earthsystemcurator.CupidToEcore
import org.earthsystemcurator.cupidLanguage.Cardinality
import org.earthsystemcurator.cupidLanguage.ConceptDef
import org.earthsystemcurator.cupidLanguage.Language
import org.earthsystemcurator.cupidLanguage.Mapping
import org.earthsystemcurator.cupidLanguage.SubconceptOrAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension2
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class CupidLanguageGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
	
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))

		//temp
		//CupidToEcore.saveAsXMI(resource);
		
		
		var lang = resource.contents.get(0) as Language
		
		fsa.generateFile(lang.name + '.oclinecore', lang.toPackage);
		
		if (fsa instanceof IFileSystemAccessExtension2) {
			var outputURI = fsa.getURI(lang.name + '.oclinecore')
			CupidToEcore.generateEcoreModel(outputURI, lang.uri);
		}
		
		
	}
	
	 
	def toPackage(Language lang) '''
		import ecore : 'http://www.eclipse.org/emf/2002/Ecore#/';
		
		package «lang.name.toLowerCase» : «lang.name.toLowerCase» = '«lang.uri»'
		{
			
			--
			--common types and classes
			--datatype AST__Module : 'org.eclipse.photran.internal.core.parser.ASTModuleNode' { };
			--datatype AST__Call : 'org.eclipse.photran.internal.core.parser.ASTCallStmtNode' { };
			--datatype AST__Subroutine : 'org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode' { };
			--datatype AST__UsesModule : 'org.eclipse.photran.internal.core.parser.ASTUseStmtNode' { };
		
			abstract class MappedElement
			{
				attribute mapsTo : ecore::EJavaObject [0..1] { transient };
			}
		
			--language specific types and classes
			
			«FOR cd : lang.conceptDef SEPARATOR '\n\n'»
			«cd.toClass»
			«ENDFOR»
		}
		
	''' 
	
	def CharSequence toMappingDataType(Mapping m) {
		if (m==null) 'EObject'	
		else 'AST__' + m.mapping.eClass.name
	}
	
	def CharSequence toClass(ConceptDef cd) '''
		class «cd.toClassName» extends MappedElement
		{
			«IF (!cd.annotation.empty)»
			annotation _'http://www.earthsystemcog.org/projects/nuopc' 
			(
				«FOR a : cd.annotation SEPARATOR ','»
				«a.key.substring(1)» = '«a.value.replace("'", "\\'")»'
				«ENDFOR»
			);
			«ENDIF»
			«FOR subconcept : cd.child»«subconcept.toProperty»«ENDFOR»
			
		}
		
		«FOR subconcept : cd.child.filter[c|!c.attrib && !c.reference]»«subconcept.toClass»«ENDFOR»
	'''
	
	
	def toClass(SubconceptOrAttribute soa) '''
		«IF !soa.attrib && !soa.reference»
			«soa.def.toClass»
		«ENDIF»
	'''
	 
	def toProperty(SubconceptOrAttribute soa) '''
		«IF soa.attrib»
			attribute «soa.name» : String «soa.toCardinality»;
		«ELSE»
			property «soa.name» : «soa.toClassName»«soa.toCardinality» { composes };
		«ENDIF»
	'''
	
	//def defaultValue(SubconceptOrAttribute soa) {
	//	var ann = soa.annotation?.findFirst[a|a.key.equals('@default')]
	//	if (ann != null) " = '" + ann.value + "'"
	//	else ""
	//}
	
	def toCardinality(SubconceptOrAttribute soa) {
		if (soa.mustBeNull) '[0..1]'
		else soa.cardinality?.toCardinality	
	}
	
	def toCardinality(Cardinality c) {
		if (c.zeroOrMore) '[*]'
		else if (c.oneOrMore) '[+]'
		else if (c.zeroOrOne) '[0..1]'
		else ''
	}
	
	def String toClassName(ConceptDef cd) {
		var parent = cd.eContainer.nearest(ConceptDef)
		if (cd.named) {
			if (parent != null)	parent.toClassName + '__' + cd.name.toFirstUpper
			else cd.name.toFirstUpper
		}
		else {
			parent.toClassName + '__' + cd.eContainer.nearest(SubconceptOrAttribute).name.toFirstUpper
		}
	}
	
	def String toClassName(SubconceptOrAttribute soa) {
		//println('toClassName (soa): ' + soa.name)
		if (soa.reference) {
			soa.ref.toClassName
		}
		else {	
			soa.def.toClassName
		}	
	}
	
	def <T extends EObject> T nearest(EObject obj, Class<T> clazz) {
		if (obj==null) null
		else if (clazz.isInstance(obj)) obj as T
		else nearest(obj.eContainer, clazz) as T
	}
	
}
