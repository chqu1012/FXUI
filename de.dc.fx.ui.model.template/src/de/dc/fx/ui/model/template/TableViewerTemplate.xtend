package de.dc.fx.ui.model.template

import de.dc.fx.ui.model.fxui.FXTableView

class TableViewerTemplate implements IGenerator<FXTableView> {
	
	override gen(FXTableView data)'''
	package «data.packagePath»;
	
	import de.dc.fx.ui.model.core.control.FXTableViewer;
	import «data.packagePath».cell.*;
	import «data.packagePath».model.*;
	
	public class «data.fxEntity.name»TableViewer extends FXTableViewer<«data.fxEntity.name»> {
	
		@Override
		protected void initTableColumns() {
			«FOR column : data.fxColumns»
			initCellFactory("«column.associatedFXProperty.name»", new «data.fxEntity.name»TableCell«column.associatedFXProperty.name»Factory());
			«ENDFOR»
		}
		
	}
	
	'''
	
}