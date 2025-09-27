package Test;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.business.Bank;
import com.service.LogAfterService;

public class ClientLogAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		
		LogAfterService lbs= new LogAfterService();
		
		ProxyFactoryBean fb=new ProxyFactoryBean();
		fb.setTarget(b);
		fb.addAdvice(lbs);
		
		Bank bproxy = (Bank)fb.getObject();
		int amount = bproxy.deposit("sbi123",5000);
		System.out.println(amount);
				

	}

}
