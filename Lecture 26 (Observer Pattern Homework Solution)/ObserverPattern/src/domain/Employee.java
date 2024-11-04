package domain;

import java.util.Date;

// This object holds the state of the employee
public class Employee {
	
	private String name;
	private Date hireDate;
	private int salary;
	public int employeeID;
	private boolean working = false;
	
	private static int COUNTER;
	
	public Employee(String name, Date hireDate, int salary, boolean working) {
		
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;
		
		employeeID = ++COUNTER;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate
				+ ", salary=" + salary + ", employeeID=" + employeeID + ", isfired=" + working+ "]";
	}
	

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId(){
		return this.employeeID;
	}
	
}
