package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
	
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = num; i > 0; i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
		
			if(i == num) {
				System.out.print(i + " = ");
			}else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.println(sum);
			
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 < num2) {
				for(int i = num1; num1 != num2 && i <= num2; i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int j = num2; num2 != num1 && j <= num1; j++) {
					System.out.print(j+" ");
				}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();				
		}
			
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 9) {
			for(; num <= 9; num++) {
				System.out.printf("===== %d단 ===== \n", num);
				for(int i = 1; i<=9; i++) {
					System.out.printf("%d x %d = %d \n", num, i, (num*i));
				}
			}
		}else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
		}
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
	
		for(int i = num1; i <= (num1+(num2*9)); i+=num2) {
			System.out.print(i+" ");
		}
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print(" ");
			}
				for(int k = 0; k < i + 1; k++) {
					System.out.print("*");
				}
			System.out.println();
		}
	
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 1; i < star+1; i++) {
			for(int j = star+1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
			for(int k = star; k < star+i; k++) {
				System.out.print(" ");
			}
		}
			
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 1; i < star+1; i++) {
			for(int j = star; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i*2-1); k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	
	}
	
	
}
