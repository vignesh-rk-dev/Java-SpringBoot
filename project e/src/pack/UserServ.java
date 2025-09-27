package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServ {
	private UserRep rep;


	//constructor injection without using spring DI.
@Autowired
	public UserServ(UserRep rep) {
	this.rep=rep;
}
public String getUserInfo(String uname,String pass) {
	return rep.getdata(uname,pass);
}

}
