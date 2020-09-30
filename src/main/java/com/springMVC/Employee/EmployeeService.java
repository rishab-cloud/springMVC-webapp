package com.springMVC.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {
	
	private static List<Employees> emp = new ArrayList<Employees>();
	private static int EmpCount = 1348904;
	
	static {
		emp.add(new Employees(1348902, "Rishab", "Developer", "Ingenico"));
		emp.add(new Employees(1348903, "Sheikh", "Developer","EAM"));
		emp.add(new Employees(1348904, "Sudan", "Developer", "MorganStanley"));
	}
   
	public List<Employees> retrieveEmp()
	{
		return emp;
	}
	
	public void deleteEmpList(int id)
	{
		Iterator<Employees> iterator = emp.iterator();
		while (iterator.hasNext()) {
			Employees employees = iterator.next();
			if (employees.getId() == id) {
				iterator.remove();
			}
		}
	}
	public void addEmpList(String name,String role,String project)
	{
		emp.add(new Employees(++EmpCount,name,role,project));
	}
	
	public Employees GetEmpList(int id)
	{
		for (Employees emps : emp) {
			if (emps.getId() == id)
				return emps;
		}
		return null;
	
	}
	public void UpdateEmployees(Employees empes)
	{
		Iterator<Employees> iterator = emp.iterator();
		while (iterator.hasNext()) {
			Employees employees = iterator.next();
			if (employees.getId() == empes.getId()) {
				iterator.remove();
			}
		}
		emp.add(empes);
	}
	}
    

