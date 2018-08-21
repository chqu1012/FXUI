package de.dc.fx.ui.model.fxml.template.treeviewer

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXTreeView

class TreeViewSampleTemplate implements IGenerator<FXTreeView> {

	override gen(FXTreeView data) '''
		package «data.packagePath»;
		
		import java.util.*;
		
		import «data.packagePath».provider.*;
		import «data.packagePath».viewer.*;
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
		
				TreeViewer<Element> tree = new TreeViewer<Element>();
				tree.getStylesheets().add(getClass().getResource("/treeviewer/TreeViewer.css").toExternalForm());
				tree.setContentProvider(new IContentProvider<Element>() {
					@Override
					public boolean hasChildren(Element element) {
						return element.getChildren().size() > 0;
					}
		
					@Override
					public Element getParent(Element element) {
						return element.getParent();
					}
		
					@Override
					public List<Element> getElements(Element inputElement) {
						return Arrays.asList(inputElement);
					}
		
					@Override
					public List<Element> getChildren(Element parentElement) {
						return parentElement.getChildren();
					}
				});
		
				Element root = new Element(null, "Vater");
				Element sohn1 = new Element(root, "Sohn1");
				sohn1.getChildren().add(new DaughterElement(root, "Tochter1"));
				sohn1.getChildren().add(new DaughterElement(root, "Tochter2"));
				root.getChildren().add(sohn1);
				root.getChildren().add(new Element(root, "Sohn2"));
				tree.setInput(root);
				StackPane r = new StackPane();
				r.getChildren().add(tree);
				primaryStage.setScene(new Scene(r, 300, 250));
				primaryStage.show();
			}
		}
	'''
}
