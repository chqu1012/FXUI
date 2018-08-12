package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class BaseControllerTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	package «view.packagePath».controller;
	
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.collections.transformation.FilteredList;
	import javafx.fxml.FXML;
	import javafx.scene.control.TableView;
	
	public abstract class «view.name»BaseController {
		
		protected ObservableList<«view.fxEntity.name»> input = FXCollections.observableArrayList();
		protected FilteredList<«view.fxEntity.name»> filteredInput = new FilteredList<>(inputData, p->true);
		protected SortedList<«view.fxEntity.name»> sortedInput = new SortedList<>(filteredInput);
		
	    @FXML
	    protected TableView<«view.fxEntity.name»> tableView;
	
		«FOR col : view.fxColumns»
		@FXML
		protected TableColumn<«view.fxEntity.name», «view.fxEntity.name»> «col.name»Column;
		«ENDFOR»
	
		public abstract void initialize();
	
		public SortedList<«view.fxEntity.name»> getSortedInput(){
			return sortedInput;
		}
	
		public FilteredList<«view.fxEntity.name»> getFilteredInput(){
			return filteredInput;
		}
	
		public FilteredList<«view.fxEntity.name»> getInput(){
			return input;
		}
	}
	'''
	
}