package pack;

import org.springframework.stereotype.Repository;

@Repository
public class UserRep {
	public String getdata(String uname,String pass) {
		String name="admin";
		String password="12345";
		if(uname.equals(name) && (pass).equals(password)){
			return "hi ,"+uname+"welcome to the portal";
		}else {
			return "Username and password incorrect";		}
	}

}
