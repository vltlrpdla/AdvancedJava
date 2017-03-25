package com.advancedjava.intertoy;

public class MazingaToyClass implements MoveArmLeg, Missile {

	public MazingaToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("마징가 입니다.");
		canMissile();
		canMoveArmLeg();
		System.out.println("==============================");
	}
	
	
	@Override
	public void canMissile() {
		System.out.println("미사일을 사용할 수 있습니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직일 수 있습니다.");
		// TODO Auto-generated method stub

	}

}
