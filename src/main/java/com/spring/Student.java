package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int studentid;
	private String studentname;
	private Exam exam;
	private Result result;

	public void setResult(Result result) {
		this.result = result;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;

	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void displayStudentinfo() {
		System.out.println("Student Name is " + studentname + " and ID is " + studentid);
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void examId() {

		if (exam != null) {
			exam.Examdetails();
			System.out.println("Your studentid for the exam is " + studentid);
		} else {
			System.out.println("Exam time table is yet to prepare");
		}
	}

	public void resultTime() {
		result.Resultdetails();
		System.out.println("Your Student ID and Student Name for the result is " + studentid + studentname);
	}

}
