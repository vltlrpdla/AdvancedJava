package com.advancedjava.children;

import com.advancedjava.papa.PapaPouch;

public class SecondChild {
	
	public SecondChild(){
		
	}
	
	
	public void tatkeMoney(int money){
		
		PapaPouch.MONEY = PapaPouch.MONEY - 100;
		
		if ( PapaPouch.MONEY < 0 ) 
			System.out.println("��°�� ���� ���� �� �޾ҽ��ϴ�.");
		
	}

}
