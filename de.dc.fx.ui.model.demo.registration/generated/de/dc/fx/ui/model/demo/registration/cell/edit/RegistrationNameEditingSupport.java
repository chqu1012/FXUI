package de.dc.fx.ui.model.demo.registration.cell.edit;
import de.dc.fx.ui.model.demo.registration.model.Registration;
public class RegistrationNameEditingSupport extends BaseEditingSupport<String>{

	@Override
	protected void setValue(Registration current, String newValue) {
		current.setName(newValue);
	}
}
