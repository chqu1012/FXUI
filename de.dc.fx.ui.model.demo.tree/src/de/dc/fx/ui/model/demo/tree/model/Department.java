package de.dc.fx.ui.model.demo.tree.model;

public class Department extends Node{

	public Department(String name) {
		super(null);
		this.setName(name);
	}
	
	public Department(Node parent) {
		super(parent);
	}
	
}
