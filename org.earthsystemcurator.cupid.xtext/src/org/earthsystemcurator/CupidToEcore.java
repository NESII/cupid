package org.earthsystemcurator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.earthsystemcurator.cupid.model2text.common.GenerateCupidLanguage;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManagerResourceAdapter;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;

public class CupidToEcore {

	/*
	public static void main(String[] args) throws IOException {
		Injector injector = new CupidLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		URI uri = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.cupid");
		// Resource xtextResource = resourceSet.createResource(uri);
		Resource xtextResource = resourceSet.getResource(uri, true);
		
		EcoreUtil.resolveAll(xtextResource);
		
		Resource xmiResource = resourceSet.createResource(URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.xmi"));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		URI inputURI = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.oclinecore");
		URI ecoreURI = URI.createURI("../org.earthsystemcurator.cupid.gen/model/nuopc.ecore");
		Resource ecoreResource = doLoadOCLinEcore(inputURI, ecoreURI);
		
	}
	*/
	
	public static void generateEcoreModel(Resource xtextResource) throws IOException {
		
		//get XMI representation
		//EcoreUtil.resolveAll(xtextResource);
		//URI xmiURI = xtextResource.getURI().trimFileExtension().appendFileExtension("xmi");
		
		//Resource xmiResource = xtextResource.getResourceSet().createResource(xmiURI);
		//xmiResource.getContents().add(xtextResource.getContents().get(0));
		//try {
		//	xmiResource.save(null);
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		
		//generate Ecore model in oclinecore abstract syntax
		File targetDir = getJavaFile(xtextResource.getURI()).getParentFile();
		GenerateCupidLanguage gcl = new GenerateCupidLanguage(xtextResource.getContents().get(0), targetDir, new ArrayList<Object>());	
		gcl.doGenerate(new BasicMonitor());
		
		//convert to ecore file
		URI inputURI = xtextResource.getURI().trimFileExtension().appendFileExtension("oclinecore");
		URI ecoreURI = xtextResource.getURI().trimFileExtension().appendFileExtension("ecore");
		
		IFile oclinecoreFile = getFile(inputURI);
		if (oclinecoreFile.exists()) {
			try {
				oclinecoreFile.delete(true, false, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		Resource ecoreResource = doLoadOCLinEcore(inputURI, ecoreURI);
		ecoreResource.save(null);
		
	
	}
	
	 static OCL ocl = OCL.newInstance();
	 
	 public static Resource doLoadOCLinEcore(URI inputURI, URI ecoreURI) throws IOException {
		 
		 //OCLinEcoreStandaloneSetup.
		 
		 //OCL ocl = OCL.newInstance();
		 
		 MetaModelManager metaModelManager = ocl.getMetaModelManager();
         //String inputName = stem + ".oclinecore";
         //String ecoreName = stem + ".ecore";
         //URI inputURI = getProjectFileURI(inputName);
         //URI ecoreURI = getProjectFileURI(ecoreName);
		 ResourceSet externalResourceSet = metaModelManager.getExternalResourceSet();
         //OCL.initialize(externalResourceSet);
		 
		 BaseCSResource xtextResource = (BaseCSResource) externalResourceSet.createResource(inputURI);
         MetaModelManagerResourceAdapter.getAdapter(xtextResource, metaModelManager);
         xtextResource.load(null);
         //assertNoResourceErrors("Load failed", xtextResource);
         Resource asResource = ocl.cs2pivot(xtextResource);
         //assertNoUnresolvedProxies("Unresolved proxies", xtextResource);
         //assertNoValidationErrors("Pivot validation errors", asResource.getContents().get(0));
         Resource ecoreResource = ocl.pivot2ecore(asResource, ecoreURI);
         return ecoreResource;
	 
	 }	

	 
	 /**
		 * Convert EMF URI to Eclipse file
		 */
	public static IFile getFile(URI uri) {
		String platformString = uri.toPlatformString(true);
		if (platformString != null) {
			Path path = new Path(platformString);
			return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}
		return null;
	}
	
	/**
	 * Get the Java file for a URI
	 * 
	 * @param uri
	 * @return Java file
	 */
	public static File getJavaFile(URI uri) {
		if (uri.isPlatform()) {
			IFile file = getFile(uri);
			IPath location = file.getLocation();
			return location.toFile();
		}
		return new File(uri.toFileString());
	}
		
}
