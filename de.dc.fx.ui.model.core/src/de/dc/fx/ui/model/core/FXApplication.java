package de.dc.fx.ui.model.core;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public abstract class FXApplication extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(root(), width(), height());
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.DECORATED);
		primaryStage.show();
	}
	
	protected abstract Parent root();
	
	protected int width() {
		return 800;
	}
	
	protected int height() {
		return 600;
	};
	
}
