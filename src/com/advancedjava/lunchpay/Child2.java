package com.advancedjava.lunchpay;

public class Child2 extends LunchMenu{
	
	public Child2(int rice, int bulgogi, int banana, int milk, int almond){
		
		super(rice,bulgogi,banana,milk,almond);
		
	}

	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice + bulgogi + milk + almond;
	}

}
