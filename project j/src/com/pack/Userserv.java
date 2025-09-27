package com.pack;

public class Userserv {
	//field injection
	private UserRep rep;
	//setter method for field injection (required for xml-based configuration)

	
	public void setRep(UserRep rep) {
		this.rep = rep;
	}
	public String getUserInfo (String uname,String pass) {
		return rep.getdata(uname, pass);
	}

	

}
