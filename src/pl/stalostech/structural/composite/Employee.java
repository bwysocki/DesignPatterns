package pl.stalostech.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	
	protected  List<Employee> employees = new ArrayList<Employee>();  
	
	public void add(Employee employee) {
		 employees.add(employee);  
	}
	
	public abstract String toString();

	public List<Employee> getEmployees() {
		return employees;
	}

}
