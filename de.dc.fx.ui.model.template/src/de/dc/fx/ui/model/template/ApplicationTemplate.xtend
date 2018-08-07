package de.dc.fx.ui.model.template

import de.dc.fx.ui.model.fxui.FXTableView

class ApplicationTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView data)'''
	package «data.packagePath»;
	
	import java.time.LocalDate;
	
	import de.dc.fx.ui.model.core.FXApplication;
	import «data.packagePath».control.«data.name.toFirstUpper»TableViewer;
	import «data.packagePath».model.«data.name.toFirstUpper»;
	import javafx.scene.Parent;
	
	public class «data.fxEntity.name.toFirstUpper»Application extends FXApplication{
	
		public static void main(String[] args) {
			launch(args);
		}
		
		@Override
		protected Parent root() {
			«data.fxEntity.name.toFirstUpper»TableViewer viewer = new «data.fxEntity.name.toFirstUpper»TableViewer();
			// Populate TableViewer Input
			// viewer.getInput().add(new «data.fxEntity.name.toFirstUpper»());
			return viewer;
		}
	
	}
	'''
	
}