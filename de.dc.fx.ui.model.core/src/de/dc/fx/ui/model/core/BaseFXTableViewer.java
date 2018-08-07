package de.dc.fx.ui.model.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

public abstract class BaseFXTableViewer<T> extends AnchorPane{

	@FXML TableView<T> tableView;
	
	protected ObservableList<T> input = FXCollections.observableArrayList();
	protected Map<String, TableColumn<T,T>> columns = new HashMap<String,TableColumn<T,T>>();
	
	public BaseFXTableViewer() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/de/dc/fx/ui/model/core/BaseFXTableViewer.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);

		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		
		initTableView();
	}

	public TableColumn<T,T> createColumn(String name) {
		return createColumn(name, 100, null);
	}
	
	public TableColumn<T,T> createColumn(String name, double width) {
		return createColumn(name, width, null);
	}

	public TableColumn<T,T> createColumn(String name, Callback<TableColumn<T, T>, TableCell<T, T>> cellFactory) {
		return createColumn(name, 100, cellFactory);
	}
	
	public TableColumn<T,T> createColumn(String name, double width, Callback<TableColumn<T, T>, TableCell<T, T>> cellFactory) {
		TableColumn<T, T> column = new TableColumn<T, T>(name.toUpperCase());
		if (cellFactory!=null) {
			column.setCellFactory(cellFactory);
		}else {
			column.setCellValueFactory(new PropertyValueFactory<T, T>(name));
		}
		column.setMinWidth(width);
		tableView.getColumns().add(column);
		columns.put(name, column);
		return column;
	}
	
	public TableColumn<T, T> getColumn(String name){
		return columns.get(name);
	}
	
	public TableView<T> getTableView(){
		return tableView;
	}
	
	public ObservableList<T> getInput(){
		return input;
	}
	
	private void initTableView() {
		tableView.setItems(input);
		initColumns();
	}

	protected abstract void initColumns();
}
