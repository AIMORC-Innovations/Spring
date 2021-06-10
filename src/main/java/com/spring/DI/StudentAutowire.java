package com.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class StudentAutowire {

	
	  @Autowired
	  @Qualifier("Examdetails2")
	  private Exam ex;
	  private Result rest;

	public StudentAutowire() {

	}

	
	 @Autowired
	 @Qualifier("Examdetails2")
	 public void setEx(Exam ex) {
		this.ex = ex;
		System.out.println("StudentAutowire setter method called.........");
	}

	
	public StudentAutowire(Exam ex) {

		this.ex = ex;
		System.out.println("StudentAutowire constructor called.........");
	}

	public void examId() {

		if (ex != null) {
			ex.Examdetails();
			System.out.println("Exam time table is to prepared");
			System.out.println("Exam id is " + ex.getExamid() + " and Exam center is " + ex.getExamCenter() );
		} else {
			System.out.println("Exam time table is yet to prepare");
		}
	}

}
