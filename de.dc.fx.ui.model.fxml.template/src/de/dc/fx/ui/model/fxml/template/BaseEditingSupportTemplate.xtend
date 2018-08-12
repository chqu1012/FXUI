package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView

class BaseEditingSupportTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».cell.edit;
	«val name = view.fxEntity.name.toFirstUpper»
	import «view.packagePath».model.«name»;
	import javafx.collections.ObservableList;
	import javafx.event.EventHandler;
	import javafx.scene.control.TableColumn.CellEditEvent;
	
	public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<«name»,T>>{
	
		@Override
		public void handle(CellEditEvent<«name», T> t) {
			ObservableList<«name»> items = t.getTableView().getItems();
			int selection = t.getTablePosition().getRow();
			«name» current = («name») items.get(selection);
			setValue(current, t.getNewValue());
		}
	
		protected abstract void setValue(«name» current, T newValue);
	}
	'''
	
}