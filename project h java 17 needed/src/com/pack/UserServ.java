package com.pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServ {
	//field injection
@Autowired
	private UserRep rep;
	public String getUserInfo(String uname,String pass) {
		return rep.getdata(uname,pass);
	}
	
}
