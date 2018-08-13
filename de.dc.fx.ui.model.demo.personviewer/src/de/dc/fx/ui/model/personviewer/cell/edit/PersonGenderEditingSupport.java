package de.dc.fx.ui.model.personviewer.cell.edit;
import de.dc.fx.ui.model.personviewer.model.Person;
public class PersonGenderEditingSupport extends BaseEditingSupport<Boolean>{

	@Override
	protected void setValue(Person current, Boolean newValue) {
		current.setGender(newValue);
	}
}
