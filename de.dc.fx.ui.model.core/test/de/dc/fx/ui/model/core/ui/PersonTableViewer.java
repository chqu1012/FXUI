package de.dc.fx.ui.model.core.ui;

import de.dc.fx.ui.model.core.BaseFXTableViewer;
import de.dc.fx.ui.model.core.model.Person;

public class PersonTableViewer extends BaseFXTableViewer<Person> {

	public PersonTableViewer() {
		createColumn("Name");
		createColumn("Surname", 200);
		createColumn("Age");
	}
}
