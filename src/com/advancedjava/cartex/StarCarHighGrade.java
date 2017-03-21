package com.advancedjava.cartex;

public class StarCarHighGrade extends StarCar {

	private int tax = 1000;

	public StarCarHighGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		
	}

	@Override
	public void getSpec() {
		
		System.out.println("*******************");
		System.out.println("���� : " + color);
		System.out.println("Ÿ�̾� : " + tire);
		System.out.println("��ⷮ : " + displacement);
		System.out.println("�ڵ� : " + handle);
		
		if( displacement > 2000)
			tax = 1500;
		System.out.println("���� : " + tax );
		System.out.println("*******************");
		

	}

}
