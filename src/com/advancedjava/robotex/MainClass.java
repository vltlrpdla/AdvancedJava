package com.advancedjava.robotex;

import com.advancedjava.robot.inter.FlyYes;
import com.advancedjava.robot.inter.KnifeLazer;
import com.advancedjava.robot.inter.MissileYes;

//n���� Ŭ������ �������� �޼ҵ尡 ���� ��
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot�� ����� �ּ���");
		Robot superRobot = new SuperRobot();
		superRobot.setiFly(new FlyYes());
		superRobot.setiKnife(new KnifeLazer());
		superRobot.setiMissile(new MissileYes());
		superRobot.shape();
		superRobot.actionFly();
		superRobot.actionKnife();
		superRobot.actionMissile();
		superRobot.actionRun();
		superRobot.actionWalk();

	}

}
