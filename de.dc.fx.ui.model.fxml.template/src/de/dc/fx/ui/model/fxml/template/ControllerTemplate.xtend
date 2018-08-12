package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class ControllerTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	package «view.packagePath».controller;
	
	public class «view.name»Controller extends Base«view.name»Controller{
		
		public void initialize(){
		}
	}
	'''
	
}