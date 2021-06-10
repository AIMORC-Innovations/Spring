package com.spring.DI;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentConstructor {

	private int studentid;
	private String studentname;
	private Result res;
	private Exam exams;

	public StudentConstructor(Exam exams) {
		super();
		this.exams = exams;
	}

	public StudentConstructor() {

	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public void setRes(Result res) {
		this.res = res;
	}

	public StudentConstructor(int studentid) {

		this.studentid = studentid;
	}

	public StudentConstructor(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}

	public void displayStudentdisplay() {
		System.out.println("Student Name is " + studentname + " and ID is " + studentid);
	}

	public void resultTime() {
		res.Resultdetails();
		System.out.println("Your Student ID and Student Name for the result is " + studentid + studentname);
	}
	 public void examId() {
		   
		   if(exams!=null) {
			   exams.Examdetails();
			   System.out.println("Your studentid for the exam is " + studentid);
		   }
		   else
		   {
			   System.out.println("Exam time table is yet to prepare");
		   }
	   }
}
