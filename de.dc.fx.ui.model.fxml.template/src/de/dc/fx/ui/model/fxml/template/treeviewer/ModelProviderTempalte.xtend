package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class ModelProviderTempalte implements IGenerator<FXTreeView>{
	
	override gen(FXTreeView data)'''
	«val rootName = data.root.name.toFirstUpper»
	package «data.packagePath».provider;
		
	import «data.packagePath».model.*;
	
	public enum «rootName»ModelProvider {
		instance;
		
		protected «rootName» root = new «rootName»(null);
		
		public «rootName» getRoot() {
			return root;
		}
	}
	'''
	
}