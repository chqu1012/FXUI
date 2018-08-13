package de.dc.fx.ui.model.personviewer.cell.edit;
import de.dc.fx.ui.model.personviewer.model.Person;
public class PersonAgeEditingSupport extends BaseEditingSupport<Integer>{

	@Override
	protected void setValue(Person current, Integer newValue) {
		current.setAge(newValue);
	}
}
