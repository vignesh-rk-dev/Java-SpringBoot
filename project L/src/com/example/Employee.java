package com.example;

public class Employee {
	private int empNumber;
	private String empName;
	private Salary salary;
	
	Employee (int empNumber,String empName, Salary salary)
	{
		this.empNumber = empNumber;
		this.empName = empName;
		this.salary = salary;
	}
//	@Override
	public String toString() {
		return
				"Emp Number :" +empNumber
				+"\nEmp Name :" +empName
				+"\nSalary :"+ salary;
	}
	
	
	
	

}
