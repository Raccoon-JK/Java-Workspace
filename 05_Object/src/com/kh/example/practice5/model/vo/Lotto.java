package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int [] lotto = new int [6];
	
	{
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() *45 +1);
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
		}
						
	}
			
	
	public Lotto() {}
	
	public void setLotto(int lotto[]) {
		this.lotto = lotto;
	}
	
	public int[] lotto() {
		return lotto;
	}
	
	public void information() {
		System.out.println(lotto[0]+" "+lotto[1]+" "+lotto[2]+" "+lotto[3]+" "+lotto[4]+" "+lotto[5]);
	}


}
