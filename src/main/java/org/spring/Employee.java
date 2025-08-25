package org.spring;

public class Employee {
	private int id;
	private String name;
	private int sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		//System.out.println("Dependency injection happened");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public void myInit() {
		System.out.println("My init method");
	}

	public void destroy() {
		System.out.println("My Destroy Method");
	}
	public void show() {
		System.out.println("I am Utility Method");
	}

}
