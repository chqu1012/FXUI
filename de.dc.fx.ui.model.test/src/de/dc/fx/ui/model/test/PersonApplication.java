package de.dc.fx.ui.model.test;

import de.dc.fx.ui.model.core.FXApplication;
import de.dc.fx.ui.model.test.model.Person;
import de.dc.fx.ui.model.test.ui.PersonTableViewer;
import javafx.scene.Parent;

public class PersonApplication extends FXApplication{

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	protected Parent root() {
		PersonTableViewer viewer = new PersonTableViewer();
		viewer.getInput().add(new Person("Peter", "Jackson", 44, true));
		viewer.getInput().add(new Person("James", "Rya", 60, true));
		viewer.getInput().add(new Person("Anita", "Mui", 60, false));
		viewer.getInput().add(new Person("James", "Bond", 55, true));
		return viewer;
	}

}
