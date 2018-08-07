package de.dc.fx.ui.model.core.file;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;

public class FXUIFile {

	public static final String EXTENSION = "fxui";
	
	public FXUIFile() {
		 // Initialize the model
		FxuiPackage.eINSTANCE.eClass();
		
		// Retrieve the default factory singleton
		@SuppressWarnings("unused")
		FxuiFactory einstance = FxuiFactory.eINSTANCE;
	}
	
	public FXTableView load(String filePath) {
        URI uri = URI.createFileURI(filePath);
        
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(EXTENSION, new XMIResourceFactoryImpl());
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(uri, true);
        FXTableView model = (FXTableView) resource.getContents().get(0);
        return model;
    }

    public void write(FXTableView model, String path) {
        URI uri = URI.createFileURI(path);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put(EXTENSION, new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(uri);
        resource.getContents().add((EObject) model);

        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}