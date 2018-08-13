package de.dc.fx.ui.model.personviewer.cell.edit;
import de.dc.fx.ui.model.personviewer.model.Person;
public class PersonSurnameEditingSupport extends BaseEditingSupport<String>{

	@Override
	protected void setValue(Person current, String newValue) {
		current.setSurname(newValue);
	}
}
