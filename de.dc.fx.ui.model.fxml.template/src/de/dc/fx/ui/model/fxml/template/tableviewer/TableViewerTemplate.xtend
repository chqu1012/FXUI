//package de.dc.fx.ui.model.fxml.treeviewer
//
//import de.dc.fx.ui.model.fxui.FXModel
//import de.dc.fx.ui.model.fxui.FXProperty
//import de.dc.fx.ui.model.fxui.FXTableView
//
//class TreeViewerTemplate implements IGenerator<FXModel>{
//	
//	override gen(FXModel data)'''
//	package tableviewer;
//
//	import java.util.List;
//	import javafx.scene.control.TreeItem;
//	import javafx.scene.control.TreeView;
//
//	public class TableViewer<T> extends TableView<T> implements IViewer<T>{
//
//		private ILabelProvider<T> labelprovider;
//		private IContentProvider<T> contentprovider;
//		private TreeItem<T> root = new TreeItem<>();
//
//    private ObservableList<T> inputList = FXCollections.observableArrayList();
//    private FilteredList<T> filteredList = new FilteredList<T>(inputList, p->true);
//    private SortedList<T> sortedList = new SortedList<T>(filteredList);
//
//		public TableViewer() {
//			setItems(sortedList);
//  		sortedList.comparatorProperty().bind(comparatorProperty());
//		}
//
//		@Override
//		public void setLabelProvider(ILabelProvider<T> labelprovider) {
//			this.labelprovider = labelprovider;
//		}
//
//		@Override
//		public void setContentProvider(IContentProvider<T> contentprovider) {
//			this.contentprovider = contentprovider;
//		}
//	
//  	public void addColumn(TableColumn<T, T> column){
//		getColumns().add(column);
//		column.setCellFactory(col->new TableCell<T, T>(){
//			@Override
//	        protected void updateItem(T item, boolean empty) {
//				super.updateItem(item, empty);
//	            if (item == null || empty) {
//	            	setText(null);
//	            }else{
//	            	setText(labelprovider.getText(item));
//	            }
//			}
//		});
//	}
//
//	@Override
//	public void setInput(Object input) {
//		List<T> elements = contentprovider.getElements(input);
//		inputList.clear();
//		inputList.addAll(elements);
//	}
//  '''
//}
