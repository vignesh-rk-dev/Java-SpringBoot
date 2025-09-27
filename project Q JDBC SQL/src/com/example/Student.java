package com.example;

public class Student {
	private int rollno;
	private String Name;
	private String Address;
	
	@Override
	public String toString() {
		return
				"student[rollno="+rollno+
						",Name="+Name+
						",Address="+Address+"]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
}
