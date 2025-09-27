package com.pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Process {
	//field injection
	@Autowired
	private Service1 x;
	public void printing() {
		System.out.println(x.Display());
	}

}
