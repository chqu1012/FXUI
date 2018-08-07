package de.dc.fx.ui.model.demo.control;

import de.dc.fx.ui.model.core.control.FXTableViewer;
import de.dc.fx.ui.model.demo.cell.PersonTableCellAgeFactory;
import de.dc.fx.ui.model.demo.cell.PersonTableCellGenderFactory;
import de.dc.fx.ui.model.demo.model.Person;

public class PersonTableViewer extends FXTableViewer<Person> {

	@Override
	protected void initTableColumns() {
		initCellFactory("Gender", new PersonTableCellGenderFactory());
		initCellFactory("Age", new PersonTableCellAgeFactory());
	}
	
}
