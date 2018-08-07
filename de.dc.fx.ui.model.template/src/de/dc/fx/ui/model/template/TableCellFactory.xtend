package de.dc.fx.ui.model.template

import de.dc.fx.ui.model.fxui.FXColumn
import de.dc.fx.ui.model.fxui.FXTableView

class TableCellFactory implements IGenerator<FXColumn>{
	
	override gen(FXColumn data)'''
	«val view = data.eContainer as FXTableView»
	package «view.packagePath».cell;
	«val modelName = view.fxEntity.name.toFirstUpper»
	«val property = data.associatedFXProperty.name.toFirstUpper»
	
	import de.dc.fx.ui.model.core.FXTableCellFactory;
	import «view.packagePath».model.«modelName»;
	import javafx.geometry.Pos;
	public class «modelName»TableCell«property»Factory extends FXTableCellFactory<«modelName»> {
	
		@Override
		protected String extractValue(«modelName» data) {
			return String.valueOf(data.get«property»());
		}
		
		@Override
		protected Pos getAlignment() {
			return Pos.valuesOf("«data.alignment»");
		}
	}
	
	'''
	
}