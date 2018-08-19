package de.dc.fx.ui.model.personviewer.ui;

import java.io.IOException;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.fxml.FXMLLoader;
import de.dc.fx.ui.model.personviewer.cell.edit.*;
import de.dc.fx.ui.model.personviewer.model.*;
import javafx.util.converter.*;
import java.time.*;

public class PersonTableViewer extends PersonBaseTableViewer<Person>{

	@Override
	protected void init() {
	nameColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DefaultStringConverter()));
	nameColumn.setOnEditCommit(new PersonNameEditingSupport());
	surnameColumn.setCellFactory(TextFieldTableCell.forTableColumn(new DefaultStringConverter()));
	surnameColumn.setOnEditCommit(new PersonSurnameEditingSupport());
	ageColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
	ageColumn.setOnEditCommit(new PersonAgeEditingSupport());
	genderColumn.setCellFactory(TextFieldTableCell.forTableColumn(new BooleanStringConverter()));
	genderColumn.setOnEditCommit(new PersonGenderEditingSupport());
	birthdayColumn.setCellFactory(TextFieldTableCell.forTableColumn(new LocalDateStringConverter()));
	birthdayColumn.setOnEditCommit(new PersonBirthdayEditingSupport());
	}
}
