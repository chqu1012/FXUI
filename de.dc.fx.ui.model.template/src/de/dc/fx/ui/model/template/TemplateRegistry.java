package de.dc.fx.ui.model.template;

import org.eclipse.emf.ecore.EObject;

public enum TemplateRegistry {
	Application(new ApplicationTemplate()),
	ModelTemplate(new ModelTemplate()),
	TableCellFactoryTemplate(new TableCellFactoryTemplate()),
	TableViewerTemplate(new TableViewerTemplate());
	
	private IGenerator<? extends EObject> template;
	
	private TemplateRegistry(IGenerator<? extends EObject> template) {
		this.template = template;
	}
	
	public IGenerator<? extends EObject> getTemplate(){
		return template;
	}
}
