package de.dc.fx.ui.model.demo.registration.cell;

import de.dc.fx.ui.model.demo.registration.cell.BaseCellFactory;
import de.dc.fx.ui.model.demo.registration.model.Registration;
import javafx.geometry.Pos;
public class RegistrationIdCellFactory extends BaseCellFactory<Registration> {

	@Override
	protected String extractValue(Registration data) {
		return String.valueOf(data.getId());
	}
	
	@Override
	protected Pos getAlignment() {
		return Pos.valueOf("CENTER");
	}
}

