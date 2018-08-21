package de.dc.fx.ui.model.demo.registration;

import de.dc.fx.ui.model.demo.registration.ui.*;
import de.dc.fx.ui.model.demo.registration.provider.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RegistrationApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		RegistrationTableViewer registrationTableViewer = new RegistrationTableViewer();
		registrationTableViewer.setItems(RegistrationModelProvider.Instance.getRegistrations());
		Scene scene = new Scene(registrationTableViewer, 1400, 800);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.DECORATED);
		primaryStage.show();
	}
}
