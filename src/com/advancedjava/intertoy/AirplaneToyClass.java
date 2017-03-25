package com.advancedjava.intertoy;

public class AirplaneToyClass implements Light, Missile {

	public AirplaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기  입니다.");
		canMissile();
		canLight();
		System.out.println("==============================");
	}
	
	
	@Override
	public void canMissile() {
		System.out.println("미사일을 사용할 수 있습니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void canLight() {
		System.out.println("빛을 사용할 수 있습니다.");
		// TODO Auto-generated method stub

	}

}
