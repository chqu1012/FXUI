package de.dc.fx.ui.model.demo.tree;

import de.dc.fx.ui.model.demo.tree.model.Department;
import de.dc.fx.ui.model.demo.tree.model.IT;
import de.dc.fx.ui.model.demo.tree.model.Node;
import de.dc.fx.ui.model.demo.tree.provider.TreeViewContentProvider;
import de.dc.fx.ui.model.demo.tree.provider.TreeViewerLabelProvider;
import de.dc.fx.ui.model.demo.tree.viewer.TreeViewer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TreeViewSample extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tree View Sample");

		TreeViewer<Node> tree = new TreeViewer<Node>();
//		tree.getStylesheets().add(getClass().getResource("/treeviewer/TreeViewer.css").toExternalForm());
		tree.setContentProvider(new TreeViewContentProvider());
		tree.setLabelProvider(new TreeViewerLabelProvider());

		Department root = new Department("H&M");
		IT javaNode = new IT(root, "Java");
		javaNode.add(new IT(javaNode, "Eclipse"));
		javaNode.add(new IT(javaNode, "Netbeans"));
		javaNode.add(new IT(javaNode, "IntelliJ"));
		root.add(javaNode);
		root.add(new IT(root, "C#"));
		root.add(new IT(root, "VB"));

		tree.setInput(root);
		StackPane r = new StackPane();
		r.getChildren().add(tree);
		primaryStage.setScene(new Scene(r, 300, 250));
		primaryStage.show();
	}
}
