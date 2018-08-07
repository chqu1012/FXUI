package de.dc.fx.ui.model.core.control;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.core.file.FXUIFile;
import de.dc.fx.ui.model.core.renderer.FXTableViewerRenderer;
import de.dc.fx.ui.model.fxui.FXTableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public abstract class FXTableViewer<T> extends AnchorPane {

	protected ObservableList<T> input = FXCollections.observableArrayList();
	protected FilteredList<T> filteredInput = new FilteredList<T>(input, p -> true);
	protected SortedList<T> sortedList = new SortedList<T>(filteredInput);

	private FXTableViewerRenderer<T> renderer = new FXTableViewerRenderer<T>(sortedList);

	protected FXUIFile file = new FXUIFile();

	public FXTableViewer() {
		TableView<T> tableView = initUI(fxuiName());
		AnchorPane.setBottomAnchor(tableView, 0d);
		AnchorPane.setTopAnchor(tableView, 0d);
		AnchorPane.setLeftAnchor(tableView, 0d);
		AnchorPane.setRightAnchor(tableView, 0d);
		getChildren().add(tableView);
		initTableColumns();
	}

	protected abstract void initTableColumns();

	public ObservableList<T> getInput() {
		return input;
	}

	public void initCellFactory(String columnKey, FXTableCellFactory<T> cellFactory) {
		getColumnBy(columnKey).setCellFactory(cellFactory);
	}
	
	public TableColumn<T, T> getColumnBy(String key) {
		return renderer.getColumnBy(key);
	}

	protected String fxuiName() {
		return getClass().getSimpleName();
	}

	protected TableView<T> initUI(String fxuiName) {
		FXTableView model = file.load(getClass().getResource(fxuiName+".fxui").getFile());
		return renderer.caseFXTableView(model);
	}

	public FXTableViewerRenderer<T> getRenderer() {
		return renderer;
	}
}