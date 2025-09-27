package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServ {
	private UserRep rep;
	//No-argument constructor (default constructor)
	public UserServ() {}
	//setter for injecting UserRep
	
	@Autowired
	public void setRep(UserRep rep) {
		this.rep = rep;
	}
	public String getUserInfo(String uname,String pass) {
		return rep.getdata(uname, pass);
	}

}
