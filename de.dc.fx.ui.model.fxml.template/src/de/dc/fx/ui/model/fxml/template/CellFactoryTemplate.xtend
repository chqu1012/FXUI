package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView
import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXModel

class CellFactoryTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	«val model = data.associatedFXProperty.eContainer as FXModel»
	package «view.packagePath».cell;
	
	import «view.packagePath».cell.*;
	«IF model.useExistingModel!==null»
	import «model.useExistingModel.importUri»;
	«ELSE»
	import «view.packagePath».model.*;
	«ENDIF»
	import javafx.geometry.Pos;
	«val fieldName = data.associatedFXProperty.name.toFirstUpper»
	public class «view.name.toFirstUpper»«fieldName»CellFactory extends BaseCellFactory<«model.name»> {
	
		@Override
		protected String extractValue(«model.name» data) {
			return String.valueOf(data.get«fieldName»());
		}
		
		@Override
		protected Pos getAlignment() {
			return Pos.valueOf("«data.alignment»");
		}
	}
	
	'''
	
	
}