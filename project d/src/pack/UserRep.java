package pack;

public class UserRep {
	public String getdata(String uname,String pass) {
		String name="admin";
		String password ="12345";
		
		if(uname.equals(name) && pass.equals(password)) {
			return "Hi,"+uname+" welcome to the portal";
		}
		else {
			return "Username and password incorrect";
		}
	}

}
