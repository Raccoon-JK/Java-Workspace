package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private static final double PI = 3.14;
    private int radius = 1;
    
//    {
//    	radius = 5;    //초기화 블럭
//    }
    
    //생성자부
    public Circle() {
    	getAreaOfCircle();
    	getSizeOfCircle();
    }
    
    
    //매서드부
    public void setRadius(int radius) {
    	this.radius = radius;
    }
    
    public int getRadius(){
        return radius;
    }

	public void incrementRadius() {
    radius++;
	//radius +=1;
    getAreaOfCircle();
    getSizeOfCircle();
	}
	
	//원의 둘레 2*반지름*원주율
	public void getAreaOfCircle() {
    double area = PI * radius * 2;
    System.out.println("원의 면적은 " + area + "입니다.");
	}
	
	//원의 넓이 반지름*반지름*원주율
	public void getSizeOfCircle() {
    double size = radius * radius * PI;
    System.out.println("원의 둘레는 " + size + "입니다.");
	}

}
