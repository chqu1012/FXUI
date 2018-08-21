package de.dc.fx.ui.model.demo.wiki;

import de.dc.fx.ui.model.demo.wiki.ui.*;
import de.dc.fx.ui.model.demo.wiki.provider.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class WikiApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		WikiTableViewer wikiTableViewer = new WikiTableViewer();
		wikiTableViewer.setItems(EntryModelProvider.Instance.getEntrys());
		Scene scene = new Scene(wikiTableViewer, 1400, 800);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.DECORATED);
		primaryStage.show();
	}
}
