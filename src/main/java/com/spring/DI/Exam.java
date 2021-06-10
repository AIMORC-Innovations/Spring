package com.spring.DI;

public class Exam {

	private int examid;
	private String examCenter;

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public void setExamCenter(String examCenter) {
		this.examCenter = examCenter;
	}

	public int getExamid() {
		return examid;
	}

	public String getExamCenter() {
		return examCenter;
	}

	public void Examdetails() {
		System.out.println("Exams time table is ready and your exam will start by 4pm");
	}

}
