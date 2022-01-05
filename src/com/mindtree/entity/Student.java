package com.mindtree.entity;

public class Student {
	private int id;
	private String name;
	private String branch;
	private int marks;
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	Student() {
		super();
	}

	public Student(int id, String name, String branch, int marks,String grade) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.marks = marks;
		this.grade=grade;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;

	}

}
