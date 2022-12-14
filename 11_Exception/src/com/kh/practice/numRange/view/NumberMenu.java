package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		try {
			if(!(num1 >= 1 && num1 <= 100 && num2 >= 1 && num2 <= 100)) {
				throw new NumRangeException("1과 100사이의 값이 아닙니다.");
			}
			System.out.printf("%d는 %d의 배수인가 ? %s \n", num1,num2,new NumberController().checkDouble(num1, num2));
		}catch(NumRangeException e) {
			e.printStackTrace();
		}
		
	}
				
}
			
			
			
		
		
		

