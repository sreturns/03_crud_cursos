package com.sinensia.model;

import java.util.Objects;

public class Course {

	private int id;
	private String name;
	private int price;
	private int duration;

	public Course() {
	}

	public Course(int id, String name, int price, int duration) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.duration = duration;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Course)) {
			return false;
		}

		Course course = (Course) obj;
		return Objects.equals(id, course.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
