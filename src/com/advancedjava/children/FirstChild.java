package com.advancedjava.children;

import com.advancedjava.papa.PapaPouch;

public class FirstChild {
	
	public FirstChild(){
		
	}
	
	
	public void tatkeMoney(int money){
		
		PapaPouch.MONEY = PapaPouch.MONEY - 100;
		
		if ( PapaPouch.MONEY < 0 ) 
			System.out.println("ù°�� ���� ���� �� �޾ҽ��ϴ�.");
		
	}

}
