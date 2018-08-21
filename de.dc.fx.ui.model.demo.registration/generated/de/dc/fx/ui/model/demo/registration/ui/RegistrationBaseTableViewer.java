package de.dc.fx.ui.model.demo.registration.ui;

import java.io.IOException;

import javafx.collections.*;
import javafx.collections.transformation.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import java.time.*;

public abstract class RegistrationBaseTableViewer<T> extends TableView<T>{
	
	protected ObservableList<T> input = FXCollections.observableArrayList();
	protected FilteredList<T> filteredInput = new FilteredList<>(input, p->true);
	protected SortedList<T> sortedInput = new SortedList<>(filteredInput);
	
    @FXML
    protected TableView<T> tableView;

	@FXML
	protected TableColumn<T, Long> idColumn;
	@FXML
	protected TableColumn<T, String> nameColumn;

	public RegistrationBaseTableViewer() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(getClass().getSimpleName()+".fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}	

	public void initialize() {
		sortedInput.comparatorProperty().bind(tableView.comparatorProperty());
		tableView.setItems(sortedInput);
		init();
	}

	protected abstract void init();

	public SortedList<T> getSortedInput(){
		return sortedInput;
	}

	public FilteredList<T> getFilteredInput(){
		return filteredInput;
	}

	public ObservableList<T> getInput(){
		return input;
	}
}
