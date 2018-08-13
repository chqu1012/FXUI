package de.dc.fx.ui.model.personviewer;

import de.dc.fx.ui.model.personviewer.ui.*;
import de.dc.fx.ui.model.personviewer.provider.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PersonApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		PersonTableViewer personTableViewer = new PersonTableViewer();
		personTableViewer.setItems(PersonModelProvider.Instance.getPersons());
		Scene scene = new Scene(personTableViewer, 1400, 800);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.DECORATED);
		primaryStage.show();
	}
}
