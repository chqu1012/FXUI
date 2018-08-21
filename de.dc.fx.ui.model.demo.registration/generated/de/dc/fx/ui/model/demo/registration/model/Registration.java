package de.dc.fx.ui.model.demo.registration.model;

import java.time.*;
public class Registration{
	private String name;
	private Long id;

	public Registration() {
	}
	public Registration(String name, Long id) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
