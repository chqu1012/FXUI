package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView

class EditingSupportTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».cell.edit;
	«val name = view.fxEntity.name.toFirstUpper»
	import «view.packagePath».model.«name»;
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