package com.springMVC.Employee;

public class Employees {
	
	private int id;
	private String name;
	private String role;
	private String project;
	
	public Employees()
	{
		
	}
	
	public Employees(int id, String name, String role, String project) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.project = project;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", role=" + role + ", project=" + project + "]";
	}
	
	

}
