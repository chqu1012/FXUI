package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView
import de.dc.fx.ui.model.fxui.FXColumn

class CellFactoryTemplate implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».cell;
	
	import «view.packagePath».cell.BaseCellFactory;
	import «view.packagePath».model.«view.fxEntity.name»;
	import javafx.geometry.Pos;
	
	public class «view.fxEntity.name»TableCellAgeFactory extends BaseCellFactory<«view.fxEntity.name»> {
	
		@Override
		protected String extractValue(«view.fxEntity.name» data) {
			return String.valueOf(data.get«data.name.toFirstUpper»());
		}
		
		@Override
		protected Pos getAlignment() {
			return Pos.valueOf(«data.alignment»);
		}
	}
	
	'''
	
	
}