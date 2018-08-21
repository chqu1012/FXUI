package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView
import de.dc.fx.ui.model.fxui.FXModel

class EditingSupportTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».cell.edit;
	«val model = data.associatedFXProperty.eContainer as FXModel»
	«val name = model.name.toFirstUpper»
	«IF model.useExistingModel!==null»
	import «model.useExistingModel.importUri»;
	«ELSE»
	import «view.packagePath».model.*;
	«ENDIF»
	«IF data.associatedFXProperty.type=='LocalDate'»
	import java.time.LocalDate;
	«ELSEIF data.associatedFXProperty.type=='LocalDateTime'»
	import java.time.LocalDateTime;
	«ENDIF»
	public class «view.name.toFirstUpper»«data.associatedFXProperty.name.toFirstUpper»EditingSupport extends BaseEditingSupport<«data.associatedFXProperty.type»>{
	
		@Override
		protected void setValue(«name» current, «data.associatedFXProperty.type» newValue) {
			current.set«data.associatedFXProperty.name.toFirstUpper»(newValue);
		}
	}
	'''
}