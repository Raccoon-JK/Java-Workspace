package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		ex.
//		1이상의 숫자를 입력하세요 : 4	 	1이상의 숫자를 입력하세요 : 0
//		1 2 3 4                		1 이상의 숫자를 입력해주세요.
//		               				1이상의 숫자를 입력하세요 : 8
//		               				1 2 3 4 5 6 7 8 

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
//		사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//		단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
//		“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		ex.
//		1이상의 숫자를 입력하세요 : 4 			1이상의 숫자를 입력하세요 : 0
//										4 3 2 1 1 이상의 숫자를 입력해주세요.
//										1이상의 숫자를 입력하세요 : 8
//										8 7 6 5 4 3 2 1

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
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
//		ex.
//		정수를 하나 입력하세요 : 8
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
				
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
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
//		력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		ex.
//		첫 번째 숫자 : 8 		첫 번째 숫자 : 4 		첫 번째 숫자 : 9
//		두 번째 숫자 : 4 		두 번째 숫자 : 8 		두 번째 숫자 : 0
//		4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.
//												첫 번째 숫자 : 6
//												두 번째 숫자 : 2
//												2 3 4 5 6 
			
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
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
//		“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
//		숫자 : 4 					숫자 : 10
//		===== 4단 ===== 			9 이하의 숫자만 입력해주세요.
//		===== 5단 ===== 			숫자 : 8
//		===== 6단 ===== 			===== 8단 =====
//		===== 7단 ===== 			===== 9단 =====
//		===== 8단 =====
//		===== 9단 =====
//		(해당 단의 내용들은 길이 상 생략)

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
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 17, 22 …
//		5 5 5 5 => 여기서 공차는 5
//		ex.
//		시작 숫자 : 4
//		공차 : 3
//		4 7 10 13 16 19 22 25 28 31
		
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
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
//		강사님 풀이
//		System.out.print("정수 입력 : ");
//		int star = sc.nextInt();
//		
//		for(int i=1; i<=star; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.println("*");
//			}
//			System.out.println();			
//		}
		
	}
	
	public void practice9() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		***
//		**
//		*

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int star = sc.nextInt();
		
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		강사님 풀이
//		System.out.print("정수 입력 : ");
//		int star = sc.nextInt();
//		
//		for(int i = star; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) { // 4 3 2 1
//				System.out.println("*"); //****
//			}
//			System.out.println();
//		}
		
	}
	
	
	public void practice10() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		   *
//		  **
//		 ***
//		****

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
		
//		강사님 풀이
//		System.out.print("정수 입력 : ");
//		int star = sc.nextInt();
		
//		for(int i = 0; i < star - i; i++) {
//			for(int j = 1; j < star j++) {
//			System.out.print(" ");
//		}
//			for(int j = 1; j < 2 + i; j++) {
//			System.out.print("*");
//		}
//			System.out.println();
//		}
//		

	}
	
	public void practice11() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//		****
//		 ***
//		  **
//		   *
		
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
		
//		강사님 풀이
//		for(int i = 0; i < star; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j < num - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	
	}
	
	public void practice12() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//			*
//		   ***
//		  *****
//		 *******
		
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
	
//	강사님 풀이
//	for(int i = 0; i < star; i++) {
//		for(int j = 0; j < star - (1 + i); j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1 + 2*i ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	public void practice14() {
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
//		ex.
//		숫자 : 11
//		2 3 5 7 11
//		2부터 11까지 소수의 개수는 5개입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.print("잘못 입력하셨습니다.");
			return;
		}
		int count = 0;
		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			//i값이 소수인지 아닌지 검사를함.
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
				count++;
			}
			//i값이 소수라면 출력을 하고, 값을 1 증가시킴.
		}

		System.out.printf("\n2부터 %d까지 소수의 개수는 %d개입니다.", num, count);
	}
	
	
	public void practice18() {
//		다음과 같은 실행 예제를 구현하세요.
//		ex.
//		정수 입력 : 4
//			*
//		   ***
//		  *****
//		 *******
//		  *****
//		   ***
//		    *
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i =0; i<num; i++) {
			//  *
			for(int j =0; j < num - (1 + i); j++) { // 0 1
				System.out.print(" "); //  ;
			}
			for(int j = 0; j < 1 + 2 * i; j++) {// 0
				System.out.print("*");// *
			}
			System.out.println();
		}
		//3 2
		//4 3
		//5 4
		for(int i = 0; i<num-1; i++) { // 0 1 2 ...
			// ***
			for(int j =0; j < 1+i; j++) { // 0
				System.out.print(" "); // ;
			}
			for(int j = 0; j < (num - i) * 2 - 3 ; j++) {
				// 1 + 2 * (num - 2 - i) -> 1 -> 0
				// 1 + 2num -4 -2i ->  2(num-i) -3
				System.out.print("*");// *****
			}
			System.out.println();
		}
		
	}

}
		
//		//  *
//		for(int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		// ***
//		for(int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.print("*");
//		}
//		
//		//*****
//		for(int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 5; j++) {
//			System.out.print("*");
//		}
		
//		// ***
//		for (int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 3; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		
//		//  *
//		for (int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for(int j = 0; j < 1; j++) {
//			System.out.println("*");
//		}
//		System.out.println();
//		}
		

