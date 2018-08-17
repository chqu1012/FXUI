package de.dc.fx.ui.model.fxml.treeviewer

import de.dc.fx.ui.model.fxui.FXModel
import de.dc.fx.ui.model.fxui.FXProperty
import de.dc.fx.ui.model.fxui.FXTableView

class TreeViewerTemplate implements IGenerator<FXModel>{
	
	override gen(FXModel data)'''
	package treeviewer;

	import java.util.List;
	import javafx.scene.control.TreeItem;
	import javafx.scene.control.TreeView;

	public class TreeViewer<T> extends TreeView<T> implements IViewer<T>{

		private ILabelProvider<T> labelprovider;
		private IContentProvider<T> contentprovider;
		private TreeItem<T> root = new TreeItem<>();

		public TreeViewer() {
			setShowRoot(false);
		}

		@Override
		public void setInput(T input) {
			List<T> elements = contentprovider.getElements(input);
			elements.stream().forEach(element->buildTree(root, element));
			setRoot(root);
		}

		private void buildTree(TreeItem<T> parentItem, T element){
			TreeItem<T> currentItem=new TreeItem<T>();
			currentItem.setValue(element);
			parentItem.getChildren().add(currentItem);	
			// Build current item
			// Link with parent
			if(contentprovider.hasChildren(element)){
				// Iterate over all childs
				List<T> children = contentprovider.getChildren(element);
				children.forEach(current->buildTree(currentItem,current));
			}
		}

		@Override
		public void setLabelProvider(ILabelProvider<T> labelprovider) {
			this.labelprovider = labelprovider;
		}

		@Override
		public void setContentProvider(IContentProvider<T> contentprovider) {
			this.contentprovider = contentprovider;
		}
	}
  '''
}