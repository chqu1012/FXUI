package de.dc.fx.ui.model.test.ui;

import de.dc.fx.ui.model.core.BaseFXTableViewer;
import de.dc.fx.ui.model.test.factory.GenderFactory;
import de.dc.fx.ui.model.test.model.Person;

public class PersonTableViewer extends BaseFXTableViewer<Person> {

	public static final String COL_NAME = "Name";
	public static final String COL_SURNAME = "Surname";
	public static final String COL_AGE= "Age";
	public static final String COL_GENDER = "Gender";
	
	@Override
	protected void initColumns() {
		createColumn(COL_NAME);
		createColumn(COL_SURNAME, 200);
		createColumn(COL_AGE);
		createColumn(COL_GENDER, new GenderFactory());
	}
}
