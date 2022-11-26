package test.p1;

import java.util.Scanner;

public class P2 {
	Scanner sc = new Scanner(System.in);
	
	public void test2() {
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+(num1*num2));
		System.out.println("나누기 몫 결과 : "+(num1/num2));
		
		
	}
	
	public void test3() {
		
		System.out.print("가로 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("가로 : ");
		double num2 = sc.nextDouble();
		
		double result = num1*num2;
		double result2 =(num1+num2)*2;
		
		System.out.println("면적 : "+result);
		System.out.println("둘레 : "+result2);
		
	}
	
	
	
	public void test4() {
		
		System.out.print("문자열을 입력하세요 : ");
		String num = sc.nextLine();
		
		System.out.println("첫 번째 문자 : "+num.charAt(0));
		System.out.println("두 번째 문자 : "+num.charAt(1));
		System.out.println("세 번째 문자 : "+num.charAt(2));
		
	}
	
	public void test5() {
		System.out.print("국어 : ");
		double num1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double num2 = sc.nextDouble();
		
		System.out.print("수학 : ");
		double num3 = sc.nextDouble();
		
		int sum = (int)(num1 + num2 + num3);
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+(sum/3));
		
	}
		
	
	public void test6() {
		int inum1 = 10;
		int inum2 = 4;
		
		float fnum = 3.0f;
		
		double dnum = 2.5;
		
		char ch = 'A';
	
        System.out.println(inum1 % inum2); // 2
        System.out.println(  ); // 2
        
        System.out.println(  ); // 10.0
        System.out.println(  ); // 10.0
        
        System.out.println(  ); // 2.5
        System.out.println(  ); // 2.5
        
        System.out.println(  ); // 3
        System.out.println(  ); // 3

        System.out.println(  );// 3.3333333
        System.out.println(  ); // 3.3333333333333335
        
        System.out.println( ch ); // 'A'
        System.out.println( ch ); // 65

	}
		
	public void test7() {
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ num2 / num1);
		System.out.println("남는 사탕 개수 : "+ num2 % num1);
		
	}
		
	
	public void test8() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int num1 = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num3 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		String gender = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째자리까지 : ");
		double num4 = sc.nextDouble();
		
		
		if(gender.charAt(0) == 'M') {
			gender = "남학생";
		}else{
			gender = "여학생";
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f", num1,num2,num3,name,gender,num4);
	}
	
	public void test9() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = "";
		if(age <= 13) {
			result = "어린이";
		}else if(age <= 19) {
			result = "청소년";
		}else {
			result = "성인";
		}
		System.out.println(result);
	}
	
	
	public void test10() {
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double result = sum / 3.0;
		String a = "";
		
		if(num1 >= 40 && num2 >= 40 && num3 >= 40 && result >= 60) { 
			a = "합격";
		}else {
			a = "불합격";
		}
		System.out.printf("합계 : %d \n평균 : %.1f \n%s",sum,result,a);
		
	}
	
	public void test11() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num1 = sc.nextLine().charAt(7);

//		String a = "";
//		if(num1 == '1') {
//			a = "남자";
//		}else {
//			a = "여자";
//		}
		
		String a = (num1 == '1') ? "남자" : "여자" ;
		System.out.println(a);
	}
	
	public void test12() {
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = "";
		switch(num) {
			case 1 : result = "입력"; break;
			case 2 : result = "수정"; break;
			case 3 : result = "조회"; break;
			case 4 : result = "삭제"; break;
			case 7 : result = "종료"; break;
		}
			if(num == 7) {
				System.out.println("프로그램이 "+result+"됩니다.");
			}else {
				System.out.println(result+" 메뉴입니다.");
		}
	}
	
	public void test13() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수만 입력해주세요.");
			test13();
		}else if(num % 2 == 0){
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		
	}
	
	public void test14() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
