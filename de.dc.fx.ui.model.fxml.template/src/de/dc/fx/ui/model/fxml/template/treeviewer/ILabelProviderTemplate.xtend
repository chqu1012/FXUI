package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class ILabelProviderTemplate implements IGenerator<FXTreeView> {

	override gen(FXTreeView data) '''
	package «data.packagePath».provider;
	
	import javafx.scene.image.*;
	
	public interface ILabelProvider<T> {
		String getText(T data);
		ImageView getImage(T data);
	}
	'''
}
