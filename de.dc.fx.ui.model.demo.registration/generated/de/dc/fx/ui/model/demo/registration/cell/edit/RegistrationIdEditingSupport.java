package de.dc.fx.ui.model.demo.registration.cell.edit;
import de.dc.fx.ui.model.demo.registration.model.Registration;
public class RegistrationIdEditingSupport extends BaseEditingSupport<Long>{

	@Override
	protected void setValue(Registration current, Long newValue) {
		current.setId(newValue);
	}
}
