package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class TreeViewerTemplate implements IGenerator<FXTreeView> {

	override gen(FXTreeView data) '''
		package «data.packagePath».viewer;
		
		import java.util.List;
		import javafx.scene.control.*;
		import «data.packagePath».provider.*;
		import javafx.scene.*;
		
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
			setCellFactory(view->new TreeCell<T>(){
				protected void updateItem(T item, boolean empty){
				   super.updateItem(item, empty);
				   if(empty){
				      setText(null);
				   }else{
				       setText(labelprovider.getText(item));
				   }
				   }
			});
			}
		
			private void buildTree(TreeItem<T> parentItem, T element){
			Node image = labelprovider.getImage(element);                        
			TreeItem<T> currentItem=new TreeItem<T>(element, image);		
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
