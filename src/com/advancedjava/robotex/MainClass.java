package com.advancedjava.robotex;

import com.advancedjava.robot.inter.FlyYes;
import com.advancedjava.robot.inter.KnifeLazer;
import com.advancedjava.robot.inter.MissileYes;

//n개의 클래스의 공통적인 메소드가 있을 때
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot을 만들어 주세요");
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
