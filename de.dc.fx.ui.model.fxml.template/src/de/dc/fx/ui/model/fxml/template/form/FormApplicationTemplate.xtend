package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class FormApplicationTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath»;
	
	import «data.packagePath».form.*;
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
			Scene scene = new Scene(new «data.name.toFirstUpper»Form(), 1400, 800);
			primaryStage.setScene(scene);
			primaryStage.initStyle(StageStyle.DECORATED);
			primaryStage.show();
		}
	}
	'''
	
}