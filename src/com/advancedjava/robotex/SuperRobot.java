package com.advancedjava.robotex;

import com.advancedjava.robot.inter.FlyYes;

public class SuperRobot extends Robot{

	// 아직 날 수 있을지 없을지 모르니 이렇게 
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		//set하는 걸 잊어버릴 수 있기 때문에 미리 해줘도 된다... 추후에 수정 가능
		iFly = new FlyYes();
	}
	
	@Override
	public void shape(){
		System.out.println( this.getClass().toString() + "입니다. 팔다리몸통있습니다.");
	}
	
}
