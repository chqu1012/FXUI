package de.dc.fx.ui.model.personviewer.ui;

import de.dc.fx.ui.model.personviewer.cell.edit.PersonAgeEditingSupport;
import de.dc.fx.ui.model.personviewer.cell.edit.PersonBirthdayEditingSupport;
import de.dc.fx.ui.model.personviewer.cell.edit.PersonGenderEditingSupport;
import de.dc.fx.ui.model.personviewer.cell.edit.PersonNameEditingSupport;
import de.dc.fx.ui.model.personviewer.cell.edit.PersonSurnameEditingSupport;
import de.dc.fx.ui.model.personviewer.model.Person;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.BooleanStringConverter;
import javafx.util.converter.DefaultStringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.LocalDateStringConverter;

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
