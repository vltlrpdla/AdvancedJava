package com.advancedjava.intertoy;

public class MazingaToyClass implements MoveArmLeg, Missile {

	public MazingaToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("��¡�� �Դϴ�.");
		canMissile();
		canMoveArmLeg();
		System.out.println("==============================");
	}
	
	
	@Override
	public void canMissile() {
		System.out.println("�̻����� ����� �� �ֽ��ϴ�.");
		// TODO Auto-generated method stub

	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("�ȴٸ��� ������ �� �ֽ��ϴ�.");
		// TODO Auto-generated method stub

	}

}
