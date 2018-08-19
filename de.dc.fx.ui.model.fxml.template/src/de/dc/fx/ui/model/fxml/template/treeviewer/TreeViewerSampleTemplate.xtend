//package de.dc.fx.ui.model.fxml.treeviewer
//
//import de.dc.fx.ui.model.fxui.FXModel
//import de.dc.fx.ui.model.fxui.FXProperty
//import de.dc.fx.ui.model.fxui.FXTableView
//
//class IContentProviderTemplate implements IGenerator<FXModel>{
//	
//	override gen(FXModel data)'''
//  public class TreeViewSample extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        primaryStage.setTitle("Tree View Sample");        
//
//        TreeViewer<Element> tree = new TreeViewer<Element> (); 
//        tree.getStylesheets().add(getClass().getResource("/treeviewer/TreeViewer.css").toExternalForm());
//        tree.setContentProvider(new IContentProvider<Element>() {
//            @Override
//            public boolean hasChildren(Element element) {
//              return element.getChildren().size()>0;
//    	    	}
//
//            @Override
//            public Element getParent(Element element) {
//              return element.getParent();
//            }
//
//            @Override
//            public List<Element> getElements(Element inputElement) {
//              return Arrays.asList(inputElement);
//            }
//
//          @Override
//          public List<Element> getChildren(Element parentElement) {
//            return parentElement.getChildren();
//          }
//        });
//
//        Element root = new Element(null, "Vater");
//        Element sohn1 = new Element(root, "Sohn1");
//        sohn1.getChildren().add(new DaughterElement(root, "Tochter1"));
//        sohn1.getChildren().add(new DaughterElement(root, "Tochter2"));
//    		root.getChildren().add(sohn1);
//        root.getChildren().add(new Element(root, "Sohn2"));
//      	tree.setInput(root );
//        StackPane r = new StackPane();
//        r.getChildren().add(tree);
//        primaryStage.setScene(new Scene(r, 300, 250));
//        primaryStage.show();
//      }
//  }
//  '''
//}
