package de.dc.fx.ui.model.demo.cell;

import java.time.format.DateTimeFormatter;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.demo.model.Person;
import javafx.geometry.Pos;

public class PersonTableCellBirthdayFactory extends FXTableCellFactory<Person> {

	protected DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
	
	@Override
	protected String extractValue(Person data) {
		return data.getBirthday().format(formatter);
	}
	
	@Override
	protected String getStyle() {
		return "-fx-text-fill: green;";
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.CENTER_RIGHT;
	}
}
