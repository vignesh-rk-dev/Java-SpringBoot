package com.vignesh;

public class Employee {
	private int empNumber;
	private String empName;
	private Salary salary;
	
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	 @Override
	public String toString() {
		 return "Emp Number :"+empNumber 
			    +"\nEmp Name: " +empName
			    + "\nSalary:"+salary;
		
	}

}
