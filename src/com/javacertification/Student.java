package com.javacertification;

public class Student {
	private int id;
	private String name;
	private int mark;
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}
	

}
