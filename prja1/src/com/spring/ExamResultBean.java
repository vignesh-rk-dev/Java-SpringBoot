package com.spring;

public class ExamResultBean {
	private int rno;
	private String sname;
	private double m1, m2;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getM1() {
		return m1;
	}
	public void setM1(double m1) {
		this.m1 = m1;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public double getTotal() {
		return m1+m2;
	}
	public double getAvg() {
		return getTotal()/2;
	}
	public boolean getResult() {
		return m1 > 34.4 && m2 > 34.4;
	}
	public void showData() {
		System.out.printf("\nRoll no : %d",rno);
		System.out.printf("\nName : %s",sname);
		System.out.printf("\nMark-1 : %.2f",m1);
		System.out.printf("\nMark-2 : %.2f",m2);
		System.out.printf("\nTotal : %.2f",getTotal());
		System.out.printf("\nAverage : %s",getAvg());
		System.out.printf("\nResult : %s",(getResult()?"Pass" : "Fail"));
	}

}
