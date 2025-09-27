package Test;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.business.Bank;
import com.service.LogBeforeService;

public class ClientLogBefore {
	public static void main(String[] args) {
		Bank b = new Bank();
		LogBeforeService lbs= new LogBeforeService();
		
		ProxyFactoryBean fb= new ProxyFactoryBean();
		fb.setTarget(b);
		fb.addAdvice(lbs);
		
		Bank bproxy= (Bank)fb.getObject();
		int amount = bproxy.deposit("sbi123",5000);
		System.out.println(amount);
	}

}
