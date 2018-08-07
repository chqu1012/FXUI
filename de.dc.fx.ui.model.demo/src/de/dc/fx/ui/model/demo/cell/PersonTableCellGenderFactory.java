package de.dc.fx.ui.model.demo.cell;

import de.dc.fx.ui.model.core.FXTableCellFactory;
import de.dc.fx.ui.model.demo.model.Person;

public class PersonTableCellGenderFactory extends FXTableCellFactory<Person> {

	@Override
	protected String getStyle() {
		return "-fx-text-fill: red;";
	}
	
	@Override
	protected String extractValue(Person data) {
		return data.getGender()==true?"Male":"Female";
	}
}
