package de.dc.fx.ui.model.personviewer.cell.edit;
import de.dc.fx.ui.model.personviewer.model.Person;
import java.time.LocalDate;
public class PersonBirthdayEditingSupport extends BaseEditingSupport<LocalDate>{

	@Override
	protected void setValue(Person current, LocalDate newValue) {
		current.setBirthday(newValue);
	}
}
