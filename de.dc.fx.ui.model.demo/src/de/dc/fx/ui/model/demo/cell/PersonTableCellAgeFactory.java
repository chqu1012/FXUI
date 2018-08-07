package de.dc.fx.ui.model.demo.cell;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.demo.model.Person;

public class PersonTableCellAgeFactory extends FXTableCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return String.valueOf(data.getAge())+" old.";
	}
}
