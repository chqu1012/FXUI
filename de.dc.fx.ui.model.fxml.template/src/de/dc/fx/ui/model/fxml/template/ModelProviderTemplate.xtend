package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXModel
import de.dc.fx.ui.model.fxui.FXProperty
import de.dc.fx.ui.model.fxui.FXTableView

class ModelProviderTemplate implements IGenerator<FXModel>{
	
	override gen(FXModel data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».provider;
	
	import java.time.*;
	import java.util.*;
	import «view.packagePath».model.*;
	import javafx.collections.*;

	public enum «data.name.toFirstUpper»ModelProvider {
		Instance;
		
		private ObservableList<«view.input.name.toFirstUpper»> «data.name.toFirstLower»s = FXCollections.observableArrayList();
		private Random random = new Random();
	
		private «data.name.toFirstUpper»ModelProvider() {
			for (int j = 0; j < 100; j++) {
			«FOR n : 0..data.fxProperties.size-1»
			«data.fxProperties.get(n).getType(n)»
			«ENDFOR»«val parameter = data.fxProperties.map[it.name.toFirstLower].reduce[p1, p2|p1+', '+p2]»
			«data.name.toFirstLower»s.add(new «data.name.toFirstUpper»(«parameter»));
			}
		}
		
		public ObservableList<«view.input.name.toFirstUpper»> get«data.name.toFirstUpper»s() {
			return «data.name.toFirstLower»s;
		}
	
		public void set«data.name.toFirstUpper»s(ObservableList<«view.input.name.toFirstUpper»> «data.name.toFirstLower»s) {
			this.«data.name.toFirstLower»s = «data.name.toFirstLower»s;
		}
	}
	'''
	def getType(FXProperty property, int loopIndex)'''«property.type» «property.name.toFirstLower» = «property.createTypeValue(loopIndex)»;'''
	
	def String createTypeValue(FXProperty property, int loopIndex){
		if (property.type=='String') {
			return '''"«property.name»"+j'''
		}else if (property.type=="Integer" || property.type=="int") {
			return '''random.nextInt()'''
		}else if (property.type=="double" || property.type=="Double") {
			return '''random.nextDouble()'''
		}else if (property.type=="float" || property.type=="Float") {
			return '''random.nextFloat()'''
		}else if (property.type=="long" || property.type=="Long") {
			return '''random.nextLong()'''
		}else if (property.type=="Boolean" || property.type=="boolean") {
			return '''random.nextBoolean()'''
		}else if (property.type=="LocalDate") {
			return '''LocalDate.now()'''
		}else if (property.type=="LocalDateTime") {
			return '''LocalDateTime.now()'''
		}
		return "\"\""
	}
}