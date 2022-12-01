package test.p1;

import java.util.Scanner;

public class P2 {
	Scanner sc = new Scanner(System.in);
	
	public void test1() {
		
		System.out.print("이름을 입력하세요 : ");
		String snum = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char cnum = sc.nextLine().charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int inum = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double dnum = sc.nextDouble();
		
		System.out.println("키 "+dnum+"cm인 "+inum+"살 "+cnum+"자 "+snum+"님 반값습니다^^");
		System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다^^",dnum,inum,cnum,snum);
		
	}

	
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
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}						
		}else {
			System.out.println("1이상의 숫자를 입력해주세요.");
			test14();
		}
	}
	
	public void test15() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i+" + ");
			}else {
				System.out.print(i+" = "+sum);
			}
		}

	}
	
	public void test16() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
	
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			test16();
		}else if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i+" ");
			}
		}else {
			for(int j = num2; j <= num1; j++) {
				System.out.print(j+" ");
			}		
		}
	}
	
	public void test17() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			test17();	
		}else {
			for(int j = num; j <= 9; j++) {
				System.out.println("===== "+j+"단 =====");
				for(int i = 1; i <= 9; i++) {
					System.out.println(j+" * "+i+" = "+(j*i));
				}				
			}
		}
	}
	
	public void test18() {
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i = num1; i <= (num1+(num2*9)); i+=num2) {
			System.out.print(i+" ");
		}
	}
	
	
	public void test19() {
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
				
		
	public void test20() {
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();		
		}
	}
		
//	public void test21() {
//		System.out.print("정수입력 : ");
//		int num = sc.nextInt();
//		
//		for(int i= num; i > 0; i--) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//		System.out.println();
//	}
//			
//}
//	
//	
////	강사님 풀이
////	System.out.print("정수 입력 : ");
////	int star = sc.nextInt();
//	
////	for(int i = 0; i < star - i; i++) {
////		for(int j = 1; j < star j++) {
////		System.out.print(" ");
////	}
////		for(int j = 1; j < 2 + i; j++) {
////		System.out.print("*");
////	}
////		System.out.println();
////	}
////	

	
	public void test22() {
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.print(num[i]+" ");
		}
	}
	
	public void test23() {
		int num[] = new int[10];
		
		for(int i = 9; i >= 0; i--) {
			num[i] = i+1;
			System.out.print(num[i]+" ");
		}	
	}
	
	public void test24() {
		
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void test25() {
		String arr[] = {"사과", "귤", "포도", "복숭아","참외"};
		System.out.println(arr[1]);
	}
	
	public void test26() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char arr[] = new char[str.length()]; 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;
		String index = "";
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == ch) {
				index += i+" ";
				count++;				
			}
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n",str, ch, index);
		System.out.printf("%c에 개수 : %d",ch,count);
	}
	
	public void test27() {
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String str[] = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		
		if(1 > num || 6 < num) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(str[num]);			
		}
	}
	
	
	public void test28() {
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
			}
		 for(int i = 0; i < num; i++) {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println("총합 : "+sum);
	}
			 
	public void test29() { // @@
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if(num % 2 != 1 || num < 3) {
			System.out.println("다시 입력하세요");
			test29();
		}else {
			for(int i = 0; i < num-2; i++) {
				arr[i] = i + 1;
				System.out.print(arr[i]+", ");
			}
			for(int i = num-2; i <= num-1; i++) {
				arr[i] = num % i;
				System.out.print(arr[i]+", ");	
			}
			
		}
		
	}
		
	
	public void test30() {
		System.out.print("치킨 이름을 입력하세요 : ");
		String a = sc.nextLine();
		
		String [] str = {"불닭", "양념", "후라이드"};
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals(a)){
				System.out.println(a+"치킨 배달 가능");
				return;
			}
		}
		System.out.println(a+"치킨은 없는 메뉴입니다." );
	}
			
			
	public void test31() {
		int [][] arr = new int [3][3];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++){
				System.out.print("("+i+", "+j+")");
			}
			System.out.println();
		}
	}
		
		
	public void test32() {
		
		int arr[][] = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);	
			}
			System.out.println();
		}
	}
		
	public void test33() {
		int arr[][] = {{16,15,14,13} , {12,11,10,9} , {8,7,6,5} , {4,3,2,1}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
				
			}
			System.out.println();
		}
			
	}
	
	public void test34() {
		
		int arr[][] = new int[4][4];
		
		
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
		
		
		
	
	

	
	
	
	
	
