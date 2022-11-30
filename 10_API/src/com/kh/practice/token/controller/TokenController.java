package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public void TokenController() {
		
		public String afterToken(String str) {
			// 매개변수로 받아온 str을 StringTokenizer를 이용하여
			// 띄어쓰기를 없애고 없앤 문자열 반환
			StringTokenizer stn = new StringTokenizer(str, " ");
			
			String result = "";
			//방법1. String클래스 이용
//			while(stn.hasMoreTokens()) {
//				result += stn.nextToken(); // J,a,v,a,P
//			}
			
			//방법2. StringBuffer or StringBuilder를 이용.
			StringBuilder sb = new StringBuilder();
			
			while(stn.hasMoreTokens()) {
				stn.nextToken();
			}
			
//			return result;
			return sb.toString();		
		}
		
		public String firstCap(String input) {
			// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
			// apple -> Apple
			// a,pple -> a(A)+pple
			// substring(0, 1);
			String upper = input.substring(0, 1).toUpperCase(); // 0이상 1미만의 인덱스범위를 짤라옴.
			
			return upper + input.substring(1); // 대문자로 변환한 문자 + 0번 인덱스를 제외한 문자열을 합쳐서 반환
		}
		
		public int findChar(String input, char one) {
			// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
			int count = 0;
			// 방법 1.
			for(int i = 0; i<input.length(); i++) {
				//apple
				input.charAt(i == one) // a p p l e
				count++;
			}
		}
		// 방법 2. toCharArray 활용
		char[] arr = input.toCharArray(); //apple -> {'a','p','p','l','e'}
		for(char c : arr) {
			if(c == one) {
				count++;
			}
		}
		return count;
		
	}

}
