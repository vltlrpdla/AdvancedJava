package com.advancedjava.children;


import com.advancedjava.papa.PapaPouch;

public class ThirdChild {
	
	public ThirdChild(){
		
	}
	
	
	public void tatkeMoney(int money){
		
		PapaPouch.MONEY = PapaPouch.MONEY - 100;
		
		if ( PapaPouch.MONEY < 0 ) 
			System.out.println("셋쨰는 돈이 없어 못 받았습니다.");
		
	}

}
