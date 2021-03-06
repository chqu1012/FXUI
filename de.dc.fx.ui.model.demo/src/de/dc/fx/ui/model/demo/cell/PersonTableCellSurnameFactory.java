package de.dc.fx.ui.model.demo.cell;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.demo.model.Person;

public class PersonTableCellSurnameFactory extends FXTableCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return data.getSurname();
	}
}
