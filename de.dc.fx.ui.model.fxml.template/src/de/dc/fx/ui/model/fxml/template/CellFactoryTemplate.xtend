package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView
import org.eclipse.emf.ecore.util.EcoreUtil

class CellFactoryTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	«val root = EcoreUtil.getRootContainer(data) as FXTableView»
	«val model = root.input»
	package «view.packagePath».cell;
	
	import «view.packagePath».cell.*;
	«IF model.useExistingModel!==null»
	import «model.useExistingModel.importUri»;
	«ELSE»
	import «view.packagePath».model.*;
	«ENDIF»
	import javafx.geometry.Pos;
	«val fieldName = data.associatedFXProperty.name.toFirstUpper»
	«val className = if(model.useExistingModel!==null){model.useExistingModel.importUri}else{model.name}»
	public class «view.name.toFirstUpper»«fieldName»CellFactory extends BaseCellFactory<«className»> {
	
		@Override
		protected String extractValue(«className» data) {
			if(data==null){
				return null;
			}
			return String.valueOf(data.get«fieldName»());
		}
		
		@Override
		protected Pos getAlignment() {
			return Pos.valueOf("«data.alignment»");
		}
	}
	
	'''
	
	
}