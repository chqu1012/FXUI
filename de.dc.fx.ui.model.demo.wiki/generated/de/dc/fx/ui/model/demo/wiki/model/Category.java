package de.dc.fx.ui.model.demo.wiki.model;

import java.time.*;
public class Category{
	private String name;
	private String tag;

	public Category() {
	}
	public Category(String name, String tag) {
		this.name = name;
		this.tag = tag;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
}
