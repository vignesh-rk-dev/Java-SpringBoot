package springinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Rbi b1 = context.getBean("cbi", Cbi.class);
		Rbi b2 = context.getBean("sbi", Sbi.class);
		var b3 = context.getBean("hdfc", Hdfc.class);

		b1.loan();
		b1.minamnt();
		b1.interest();

		b2.loan();
		b2.minamnt();
		b2.interest();

		b3.loan();
		b3.minamnt();
		b3.interest();

	}

}
