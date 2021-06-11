package com.Spring.Example.SetterConstForLiteral;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		/*FOR Setter Method
		 * Student student = new Student(); 
		 * student.setStudentName("Chandana");
		 * student.displayStudentInfo();
		 * 
		 * FOR Constructor Method
		 * Student student=new Student(1,"Chandana");
		 * 
		 */
		
		/* this is the conbtainer object */	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		/* this is for class student */
		Student chandana = context.getBean("student",Student.class);/* this is refering the studentclass along with bean id we have mentioned */
		chandana.displayStudentInfo();
		
		 Student student = context.getBean("chandu",Student.class); //this is refering the studentclass along with bean id we have mentioned //
		  student.displayStudentInfo();
		
		
		
	}

}
