package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXModel
import de.dc.fx.ui.model.fxui.FXTableView

class EntityTemplate implements IGenerator<FXModel>{
	
	override gen(FXModel data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».model;
	
	import java.time.*;
	«val name = data.name.toFirstUpper»
	public class «name»{
		«FOR property : data.fxProperties»
		private «property.type» «property.name»;
		«ENDFOR»
	
		public «name»() {
		}
		«val fields = data.fxProperties.map[type+" "+name].reduce[p1, p2|p1+', '+p2]»
		public «name»(«fields») {
			«FOR property : data.fxProperties»
			this.«property.name» = «property.name»;
			«ENDFOR»
		}
		«FOR property : data.fxProperties»
		public String get«property.name.toFirstUpper»() {
			return «property.name.toFirstLower»;
		}
		
		public void set«property.name.toFirstUpper»(String «property.name.toFirstLower») {
			this.«property.name.toFirstLower» = «property.name.toFirstLower»;
		}
		«ENDFOR»
	}
	'''
	
}