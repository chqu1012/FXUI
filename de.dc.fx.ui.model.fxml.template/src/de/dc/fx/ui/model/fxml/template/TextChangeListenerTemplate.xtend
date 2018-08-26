package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView
import de.dc.fx.ui.model.fxui.FXColumn

class TextChangeListenerTemplate implements IGenerator<FXTableView> {

	override gen(FXTableView data) '''
		package «data.packagePath».filter;
		
		import «data.packagePath».model.*;
		import javafx.beans.value.*;
		import javafx.collections.transformation.*;
		
		public class «data.name.toFirstUpper»SearchTextChangeListener implements ChangeListener<String> {
			«val modelName = if(data.input.useExistingModel!==null){data.input.useExistingModel.importUri}else{data.input.name.toFirstUpper}»
			protected FilteredList<«modelName»> filteredList;
		
			public TicketSearchTextChangeListener(FilteredList<modelName> filteredList) {
				this.filteredList = filteredList;
			}
		
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				filteredList.setPredicate(t -> {
					// If filter text is empty, display all persons.
					if (newValue == null || newValue.isEmpty()) {
						return true;
					}
		
					// Compare first name and last name of every person with filter text.
					String lowerCaseFilter = newValue.toLowerCase();
					«FOR i : 0..data.fxColumns.size-1»
						«i.criteria(data.fxColumns.get(i))»
					«ENDFOR»
					return false; // Does not match.
				});
			}
		}
	'''

	def String criteria(int index, FXColumn col) {
		var token = '''«IF index==0»if«ELSE»else if«ENDIF»'''
		val name = col.associatedFXProperty.name.toFirstUpper
		var content = '''t.get«name»().toLowerCase()'''
		if (col.associatedFXProperty.type!='String') {
			content='''String.valueOf(t.get«name»())'''
		}
		'''«token»(«content».contains(lowerCaseFilter)) {
				return true;
		}'''
	}

}
