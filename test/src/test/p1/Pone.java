package test.p1;

import java.util.Scanner;

public class Pone {
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		
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

}
