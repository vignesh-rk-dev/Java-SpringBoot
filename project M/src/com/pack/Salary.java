package com.pack;

public class Salary {
	private double basicpay;
	private double allowances;
	private double deductions;
	private double netpay;
	
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	public void setNetpay(double netpay) {
		this.netpay = netpay;
	}
	
	public void calculateNetpay() {
		netpay =  basicpay + allowances - deductions;
	}
	public String toString() {
		calculateNetpay();
		
		String si = "\nBasic pay: "+basicpay;
			si += "\n Allowances: "+ allowances;
			si += "\n deductions: "+ deductions;
			si += "\n Netpay: " + netpay;
			return si;
	}
	

}
