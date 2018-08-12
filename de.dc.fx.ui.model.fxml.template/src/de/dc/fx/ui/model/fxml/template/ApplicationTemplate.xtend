package de.dc.fx.ui.model.fxml.template

import de.dc.fx.ui.model.fxui.FXTableView

class ApplicationTemplate implements IGenerator<FXTableView>{
	
	override gen(FXTableView data)'''
	package «data.packagePath»;
	
	import «data.packagePath».ui.«data.name.toFirstUpper»TableViewer;
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.stage.Stage;
	import javafx.stage.StageStyle;
	
	public class «data.name.toFirstUpper»Application extends Application {
	
		public static void main(String[] args) {
			launch(args);
		}
	
		@Override
		public void start(Stage primaryStage) throws Exception {
			«data.name.toFirstUpper»TableViewer «data.name.toFirstLower»TableViewer = new «data.name.toFirstUpper»TableViewer();
			Scene scene = new Scene(«data.name.toFirstLower»TableViewer, 1400, 800);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		}
	}
	'''
	
}