package com.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamResult {

	public static void main(String[] args) {
		
		//how user create
		
		//1.object creation
//		ExamResultBean erb= new ExamResultBean();
		
//		//2.object's value assigning
//		erb.setM1(100);
//		erb.setM2(24);
//		erb.setSname("vignesh");
//		erb.setRno(100);
//		erb.showData();
	//	-----------------------------------------------------
//  spring will create object for us
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");//configuration
		
//		ExamResultBean er=con.getBean("exam",ExamResultBean.class); //parameterized method or generic method
		ExamResultBean er=(ExamResultBean) con.getBean("exam");//typecasting method
		er.showData();
//		
		//type cast
		//double x=100;
		//float y=(float) x;
	}
	

}
