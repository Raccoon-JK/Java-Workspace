package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		1 2 3 4 5 6 7 8 9 10 
		
		int[] num = new int[10];
		 
		for(int i = 0; i < 10 ; i++) {
			num[i] = i+1;
			System.out.print(num[i]+" ");
		}
		
	}

	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.
//		10 9 8 7 6 5 4 3 2 1 
		
		int[] num = new int[10];
		
		for(int i = 9; i >= 0; i--) {
			num[i] = i+1;
			System.out.print(num[i]+" ");
		}
		
	}
	
	 public void practice3() {
//		 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
//		 ex.
//		 양의 정수 : 5
//		 1 2 3 4 5 
		 
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
			
			for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]);
		}
		  
	 }
	 
	 public void practice4() {
//		 길이가 5인 String배열을 선언하고 “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
//		 배열 인덱스를 활용해서 귤을 출력하세요.
//		 ex.
//		 귤
		 
		 //String[] str = {사과, 귤, 포도, 복숭아, 참외}
		 
		 
		 
		 
		 
		 
		 
	 }
	
}
