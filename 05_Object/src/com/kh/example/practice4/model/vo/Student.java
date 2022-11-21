package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 3;
		classroom = 7;
		name = "김진기";
		height = 175.0;
		gender = 'M';
				
	}
	
	public Student() {}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int grade() {
		return grade;
	}
	
	public int classroom() {
		return classroom;
	}
	
	public String name() {
		return name;
	}
	
	public double height() {
		return height;
	}
	
	public char gender() {
		return gender;
	}
	
	public void information() {
		System.out.println("학년 : "+grade+"\n반 : "+classroom+"\n이름 : "+name+"\n키 : "+height+"\n성별 : "+gender);	
	}
	
}
