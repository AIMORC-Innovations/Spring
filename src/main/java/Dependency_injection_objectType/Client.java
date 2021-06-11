package Dependency_injection_objectType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	
		/*
		 * Student student=new Student(); mathCheat mathcheat=new mathCheat();
		 * 
		 * student.setCheat(mathcheat); student.cheating();
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("bean file is getting readed");
		Student student=context.getBean("stu", Student.class);
		student.cheating();
		
	}

}
