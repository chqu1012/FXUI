package de.dc.fx.ui.model.personviewer.cell;

import de.dc.fx.ui.model.personviewer.cell.BaseCellFactory;
import de.dc.fx.ui.model.personviewer.model.Person;
import javafx.geometry.Pos;
public class PersonAgeCellFactory extends BaseCellFactory<Person> {

	@Override
	protected String extractValue(Person data) {
		return String.valueOf(data.getAge());
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.valueOf("CENTER");
	}
}

