package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class IContentProviderTemplate implements IGenerator<FXTreeView> {

	override gen(FXTreeView data) '''
	package «data.packagePath».provider;
	
	import java.util.List;
	
	public interface IContentProvider<T> {
	  boolean hasChildren(T element);
	  T getParent(T element);
	  List<T> getElements(T inputElement);
	  List<T> getChildren(T parentElement);
	}
	'''
}
