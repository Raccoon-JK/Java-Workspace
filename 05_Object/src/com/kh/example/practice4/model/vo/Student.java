package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 1;
		classroom = 1;
		name = "김진기";
		height = 175.0;
		gender = 'M';
				
	}
	
	public Student() {}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
