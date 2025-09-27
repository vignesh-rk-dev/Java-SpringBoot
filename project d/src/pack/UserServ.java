package pack;

public class UserServ {
	private UserRep rep;
	//constructor injection without using spring DI.
	public UserServ (UserRep rep) {
		this.rep = rep;
	}
	public String getUserInfo(String uname,String pass) {
		return rep.getdata(uname, pass);
	}

}
