package de.dc.fx.ui.model.demo;

import java.time.LocalDate;

import de.dc.fx.ui.model.core.FXApplication;
import de.dc.fx.ui.model.demo.control.PersonTableViewer;
import de.dc.fx.ui.model.demo.model.Person;
import javafx.scene.Parent;

public class PersonApplication extends FXApplication{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	protected Parent root() {
		PersonTableViewer viewer = new PersonTableViewer();
		viewer.getInput().add(new Person("Peter", "Jackson", 44, true, LocalDate.now()));
		viewer.getInput().add(new Person("James", "Rya", 60, true, LocalDate.now()));
		viewer.getInput().add(new Person("Anita", "Mui", 60, false, LocalDate.now()));
		viewer.getInput().add(new Person("James", "Bond", 55, true, LocalDate.now()));
		return viewer;
	}

}
