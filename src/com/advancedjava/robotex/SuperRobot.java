package com.advancedjava.robotex;

import com.advancedjava.robot.inter.FlyYes;

public class SuperRobot extends Robot{

	// ���� �� �� ������ ������ �𸣴� �̷��� 
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		//set�ϴ� �� �ؾ���� �� �ֱ� ������ �̸� ���൵ �ȴ�... ���Ŀ� ���� ����
		iFly = new FlyYes();
	}
	
	@Override
	public void shape(){
		System.out.println( this.getClass().toString() + "�Դϴ�. �ȴٸ������ֽ��ϴ�.");
	}
	
}
