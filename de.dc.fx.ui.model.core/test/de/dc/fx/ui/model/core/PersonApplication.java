package de.dc.fx.ui.model.core;

import de.dc.fx.ui.model.core.model.Person;
import de.dc.fx.ui.model.core.ui.PersonTableViewer;
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
		return viewer;
	}
}
