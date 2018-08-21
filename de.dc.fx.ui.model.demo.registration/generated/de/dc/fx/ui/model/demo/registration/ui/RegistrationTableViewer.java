package de.dc.fx.ui.model.demo.registration.ui;

import java.io.IOException;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.fxml.FXMLLoader;
import de.dc.fx.ui.model.demo.registration.cell.edit.*;
import de.dc.fx.ui.model.demo.registration.model.*;
import javafx.util.converter.*;
import java.time.*;

public class RegistrationTableViewer extends RegistrationBaseTableViewer<Registration>{

	@Override
	protected void init() {
	idColumn.setCellFactory(TextFieldTableCell.forTableColumn(new LongStringConverter()));
	idColumn.setOnEditCommit(new RegistrationIdEditingSupport());
	}
}
