package de.dc.fx.ui.model.personviewer.ui;

import java.io.IOException;

import javafx.collections.*;
import javafx.collections.transformation.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import java.time.*;

public abstract class PersonBaseTableViewer<T> extends TableView<T>{
	
	protected ObservableList<T> input = FXCollections.observableArrayList();
	protected FilteredList<T> filteredInput = new FilteredList<>(input, p->true);
	protected SortedList<T> sortedInput = new SortedList<>(filteredInput);
	
    @FXML
    protected TableView<T> tableView;

	@FXML
	protected TableColumn<T, String> nameColumn;
	@FXML
	protected TableColumn<T, String> surnameColumn;
	@FXML
	protected TableColumn<T, Integer> ageColumn;
	@FXML
	protected TableColumn<T, Boolean> genderColumn;
	@FXML
	protected TableColumn<T, LocalDate> birthdayColumn;

	public PersonBaseTableViewer() {
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
