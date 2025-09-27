package com.pack;

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
		return 
				"emp Number:"+empNumber 
				+"\n EmpName:"+empName
				+"\n salary :"+salary;
	}
	

}
