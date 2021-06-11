package com.Spring.Example.SetterConstForLiteral;

public class Student {
     private int id;
 	private  String studentName;
     
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
		System.out.println("constructor: ");
	}


	 public Student(int id)
	 { super(); this.id=id;
	 System.out.println("constructor1: ");
	 
	 }


	/*
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; System.out.println("Set method is called:"+"setName"); } public
	 * void setId(int id) { this.id=id;
	 * System.out.println("Set method is called:"+"setName"); }
	 */
	
	public  void displayStudentInfo() {
		System.out.println("Studnet Name"+"\t"+ studentName +"\t"+ "her id is"+id);
	}
}
