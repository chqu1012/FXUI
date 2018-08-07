package de.dc.fx.ui.model.demo.cell;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.demo.model.Person;
import javafx.geometry.Pos;

public class PersonTableCellAgeFactory extends FXTableCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return String.valueOf(data.getAge())+" old.";
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.CENTER_LEFT;
	}
}
