package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 무자열");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		int num1 = sc.nextInt();
		
		switch(num1) {
			case 1: this.tokenMenu(); break;
			case 2: this.inputMenu(); break;
			case 9: System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
					mainMenu();		
		}
		
	}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		
		
	}
	
	public void inputMenu() {
		
	}
	
	
	

}
