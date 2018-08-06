package de.dc.fx.ui.model.test.factory;

import de.dc.fx.ui.model.core.FXCellFactory;
import de.dc.fx.ui.model.test.model.Person;

public class GenderFactory extends FXCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return data.getGender()==true?"Male":"Female";
	}
}
