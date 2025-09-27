package com.spring;

public class Employee {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("welcome to "+ name);
	}
	

}
