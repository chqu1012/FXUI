package de.dc.fx.ui.model.demo.wiki.model;

import java.time.*;
public class Entry{
	private String name;
	private String content;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;

	public Entry() {
	}
	public Entry(String name, String content, LocalDateTime createdOn, LocalDateTime updatedOn) {
		this.name = name;
		this.content = content;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}
	
	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}
}
