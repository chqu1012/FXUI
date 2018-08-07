package de.dc.fx.ui.model.template

import de.dc.fx.ui.model.template.IGenerator
import de.dc.fx.ui.model.fxui.FXEntity
import de.dc.fx.ui.model.fxui.FXTableView

class ModelTemplate implements IGenerator<FXEntity> {
	
	override gen(FXEntity data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».model;
	
	public class «data.name» {
		«FOR property : data.fxProperties»
		private «property.type» «property.name»;
		«ENDFOR»
	
		public «data.name»() {
		}
		
		public «data.name»(«data.fxProperties.map[it.type+' '+it.name].reduce[p1, p2|p1+', '+p2]») {
			«FOR property : data.fxProperties»
			this.«property.name» = «property.name»;
			«ENDFOR»
		}
		«FOR property : data.fxProperties»
		public «property.type» get«property.name.toFirstUpper»() {
			return «property.name»;
		}
		
		public void set«property.name.toFirstUpper»(«property.type» «property.name») {
			this.«property.name» = «property.name»;
		}
		«ENDFOR»
	}
	'''
	
}