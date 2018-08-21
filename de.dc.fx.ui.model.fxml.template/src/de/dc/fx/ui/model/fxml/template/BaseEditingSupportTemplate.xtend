package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView
import de.dc.fx.ui.model.fxui.FXModel
import org.eclipse.emf.ecore.util.EcoreUtil

class BaseEditingSupportTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	«val model = data.associatedFXProperty.eContainer as FXModel»
	package «view.packagePath».cell.edit;
	«IF model.useExistingModel!==null»
	import «model.useExistingModel.importUri»;
	«ELSE»
	import «view.packagePath».model.*;
	«ENDIF»
	import javafx.collections.ObservableList;
	import javafx.event.EventHandler;
	import javafx.scene.control.TableColumn.CellEditEvent;
	«val root = EcoreUtil.getRootContainer(data) as FXTableView»
	«val className = if(root.input.useExistingModel!==null){root.input.useExistingModel.importUri}else{model.name}»
	public abstract class BaseEditingSupport<T> implements EventHandler<CellEditEvent<«className»,T>>{
	
		@Override
		public void handle(CellEditEvent<«className», T> t) {
			ObservableList<«className»> items = t.getTableView().getItems();
			int selection = t.getTablePosition().getRow();
			«className» current = («className») items.get(selection);
			setValue(current, t.getNewValue());
		}
	
		protected abstract void setValue(«className» current, T newValue);
	}
	'''
	
}