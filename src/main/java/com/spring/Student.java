package com.spring;

public class Student {
	
	private int studentid;
	private String studentname;

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
		public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
		public void displayStudentinfo()
		{
			System.out.println("Student Name is " + studentname + " and ID is " + studentid );
	}
	
	

}
