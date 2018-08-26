package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class BaseControllerTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	package «view.packagePath».ui;
	
	import java.io.IOException;
	
	import javafx.collections.*;
	import javafx.collections.transformation.*;
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import java.time.*;
	
	public abstract class «view.name»BaseTableViewer<T> extends TableView<T>{
		
		protected ObservableList<T> input = FXCollections.observableArrayList();
		protected FilteredList<T> filteredInput = new FilteredList<>(input, p->true);
		protected SortedList<T> sortedInput = new SortedList<>(filteredInput);
		
	    @FXML
	    protected TableView<T> tableView;
	
		«FOR col : view.fxColumns»
		@FXML
		protected TableColumn<T, T> «col.associatedFXProperty.name.toFirstLower»Column;
		«ENDFOR»
	
		public «view.name»BaseTableViewer() {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getClass().getSimpleName()+".fxml"));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
			
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				throw new RuntimeException(exception);
			}
		}	
	
		public void initialize() {
			sortedInput.comparatorProperty().bind(tableView.comparatorProperty());
			tableView.setItems(sortedInput);
			init();
		}
	
		protected abstract void init();
	
		public SortedList<T> getSortedInput(){
			return sortedInput;
		}
	
		public FilteredList<T> getFilteredInput(){
			return filteredInput;
		}
	
		public ObservableList<T> getInput(){
			return input;
		}
	}
	'''
}