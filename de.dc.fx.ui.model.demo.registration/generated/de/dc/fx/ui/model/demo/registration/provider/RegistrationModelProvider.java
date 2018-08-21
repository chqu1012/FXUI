package de.dc.fx.ui.model.demo.registration.provider;

import java.time.LocalDate;
import java.util.Random;
import de.dc.fx.ui.model.demo.registration.model.Registration;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum RegistrationModelProvider {
	Instance;
	
	private ObservableList<Registration> registrations = FXCollections.observableArrayList();
	private Random random = new Random();

	private RegistrationModelProvider() {
		for (int j = 0; j < 100; j++) {
		String name = "Name"+j;
				Long id = random.nextLong();
		registrations.add(new Registration(name, id));
		}
	}
	
	public ObservableList<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(ObservableList<Registration> registrations) {
		this.registrations = registrations;
	}
}
