package com.example;

public class Salary {
	private double basicpay;
	private double allowances;
	private double deductions;
	private double netpay;
	
	Salary(double basicpay,double allowances, double deductions)
	{
		this.basicpay = basicpay;
		this.allowances = allowances;
		this.deductions = deductions;
		calculateNetpay();
	}
	public void calculateNetpay()
	{
		netpay = basicpay + allowances - deductions;
	}
	@Override
	public String toString() {
		return 
				"Basicpay : " +basicpay
				+"\nAllowances :"+allowances
				+"\nNetpay :" +netpay;
	}

}
