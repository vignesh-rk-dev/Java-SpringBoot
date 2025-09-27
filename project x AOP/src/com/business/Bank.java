package com.business;

public class Bank {
	private int amount=4000;
	private String acno="sbi123";
	
	public int deposit(String acno, int amount) {
		if (acno.equals(this.acno))
		{
			this.amount= this.amount+amount;
			return this.amount;
		}
		else {
			throw new AcnoNotFoundException();
		}
	}

}
