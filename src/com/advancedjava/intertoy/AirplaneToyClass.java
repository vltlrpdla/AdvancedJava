package com.advancedjava.intertoy;

public class AirplaneToyClass implements Light, Missile {

	public AirplaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("�����  �Դϴ�.");
		canMissile();
		canLight();
		System.out.println("==============================");
	}
	
	
	@Override
	public void canMissile() {
		System.out.println("�̻����� ����� �� �ֽ��ϴ�.");
		// TODO Auto-generated method stub

	}

	@Override
	public void canLight() {
		System.out.println("���� ����� �� �ֽ��ϴ�.");
		// TODO Auto-generated method stub

	}

}
