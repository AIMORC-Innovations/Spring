package com.spring;

public class StudentConstructor {

	private int studentid;
	private String studentname;
	
	
	public StudentConstructor(int studentid, String studentname) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
	}
	public void displayStudentdisplay()
	{
		System.out.println("Student Name is " + studentname + " and ID is " + studentid );
}
}
