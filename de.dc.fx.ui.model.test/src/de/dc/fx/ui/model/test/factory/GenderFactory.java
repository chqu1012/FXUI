package de.dc.fx.ui.model.test.factory;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.test.model.Person;

public class GenderFactory extends FXTableCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return data.getGender()==true?"Male":"Female";
	}
}
