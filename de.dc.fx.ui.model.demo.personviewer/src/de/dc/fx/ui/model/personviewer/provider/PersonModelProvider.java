package de.dc.fx.ui.model.personviewer.provider;

import java.time.LocalDate;
import java.util.Random;
import de.dc.fx.ui.model.personviewer.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public enum PersonModelProvider {
	Instance;
	
	private ObservableList<Person> persons = FXCollections.observableArrayList();
	private Random random = new Random();

	private PersonModelProvider() {
		for (int j = 0; j < 100; j++) {
		String name = "Name"+j;
				String surname = "Surname"+j;
				Integer age = random.nextInt();
				Boolean gender = random.nextBoolean();
				LocalDate birthday = LocalDate.now();
		persons.add(new Person(name, surname, age, gender, birthday));
		}
	}
	
	public ObservableList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ObservableList<Person> persons) {
		this.persons = persons;
	}
}
