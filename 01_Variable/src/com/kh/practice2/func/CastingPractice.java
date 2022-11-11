package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double a = sc.nextDouble();
		
		System.out.print("영어 : ");
		double b = sc.nextDouble();
		
		System.out.print("수학 : ");
		double c = sc.nextDouble();
		
		double dSum = a + b + c;
		System.out.println("총점 : "+(int)dSum);
		System.out.println("총점 : "+(int)(dSum/3));

		
		/*
		 * int sum = (int)(a+b+c);
		 * int avg = sum/3;
		 * 
		 * System.out.printf("총점 : %d \n" , sum);
		 * System.out.printf("평균 : %d \n" , avg);
		 *
		 */
		
	}

}
