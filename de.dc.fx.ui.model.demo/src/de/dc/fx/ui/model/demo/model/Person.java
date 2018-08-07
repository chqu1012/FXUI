package de.dc.fx.ui.model.demo.model;

import java.time.LocalDate;

public class Person {
	
	private String name;
	private String surname;
	private Integer age;
	private Boolean gender;
	private LocalDate birthday;

	public Person() {
	}
	
	public Person(String name, String surname, Integer age, Boolean gender, LocalDate birthday) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
