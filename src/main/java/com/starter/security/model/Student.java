package com.starter.security.model;

public class Student {

	private Long id;
	private String name;
	private String course;
	private double percentage;

	public Student() {

	}

	public Student(Long id, String name, String course, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.percentage = percentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", course=");
		builder.append(course);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}

}
