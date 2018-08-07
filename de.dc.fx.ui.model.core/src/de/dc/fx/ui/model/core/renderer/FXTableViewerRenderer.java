package de.dc.fx.ui.model.core.renderer;

import java.util.HashMap;
import java.util.Map;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.util.FxuiSwitch;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXTableViewerRenderer<T> extends FxuiSwitch<Object>{
	
	protected SortedList<T> sortedList;

	protected Map<String, TableColumn<T, T>> columns = new HashMap<String, TableColumn<T, T>>();

	public FXTableViewerRenderer(SortedList<T> sortedList) {
		this.sortedList=sortedList;
	}

	public TableColumn<T, T> getColumnBy(String key){
		return columns.get(key);
	}
	
	@Override
	public TableColumn<T, T> caseFXColumn(FXColumn object) {
		String name = object.getName();
		FXProperty property = object.getAssociatedFXProperty();
		String propertyName = "";
		if (property!=null) {
			propertyName = property.getName();
		}
		if (name==null) {
				name = propertyName;
		}
		TableColumn<T, T> column = new TableColumn<T,T>(name);
		column.setCellValueFactory(new PropertyValueFactory<T, T>(propertyName));
		column.setMinWidth(object.getWidth());
		columns.put(propertyName, column);
		return column;
	}
	
	@Override
	public TableView<T> caseFXTableView(FXTableView object) {
		TableView<T> tableView = new TableView<>();
		object.getFxColumns().forEach(column -> tableView.getColumns().add(caseFXColumn(column)));
		sortedList.comparatorProperty().bind(tableView.comparatorProperty());
		tableView.setItems(sortedList);
		return tableView;
	}

}