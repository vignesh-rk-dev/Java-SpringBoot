package com.business;

public class AcnoNotFoundException extends RuntimeException {
	@Override
	public String toString() {
		return "Account number is invalid";
	}

}
