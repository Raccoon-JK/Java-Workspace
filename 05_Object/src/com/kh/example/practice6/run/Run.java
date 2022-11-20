package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.inform();
		System.out.println();
		
		Book b2 = new Book("흐르는 강물처럼","문학동네","파울로 코엘료");
		b2.inform();
		System.out.println();
		
		Book b3 = new Book("신","열린책들","베르나르베르베르",39960,0.5);
		b3.inform();
		System.out.println();
	}

}
