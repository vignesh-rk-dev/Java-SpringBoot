package springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		var e=context.getBean("x1",Bank.class);
		e.setAccno("1000001");
		e.setName("vignesh");
		System.out.println(e);
		
		var e1 = context.getBean("x1",Bank.class);
		e1.setAccno("1000002");
		e1.setName("raj");
		System.out.println(e1);

	}

}
