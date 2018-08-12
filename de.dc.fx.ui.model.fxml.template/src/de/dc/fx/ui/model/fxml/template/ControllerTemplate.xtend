package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class ControllerTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView view)'''
	package «view.packagePath».ui;
	
	import java.io.IOException;
	
	import javafx.fxml.FXMLLoader;
	
	import «view.packagePath».model.*;
	
	public class «view.name»TableViewer extends «view.name»BaseTableViewer<«view.fxEntity.name.toFirstUpper»>{
		
		public «view.name»TableViewer(){
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("«view.name»TableViewer.fxml"));
			fxmlLoader.setRoot(this);
			fxmlLoader.setController(this);
	
			try {
				fxmlLoader.load();
			} catch (IOException exception) {
				throw new RuntimeException(exception);
			}
		}
		
		public void initialize(){
		}
	}
	'''
	
}