package com.springrest.springrest.entity;

public class Course {

	private long id;
	private String title;
	private String Description;
	public Course(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		Description = description;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", Description=" + Description + "]";
	}
	 
}
