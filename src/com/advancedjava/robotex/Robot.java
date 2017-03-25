package com.advancedjava.robotex;

import com.advancedjava.robot.inter.IFly;
import com.advancedjava.robot.inter.IKnife;
import com.advancedjava.robot.inter.IMissile;

public abstract class Robot {

	//set���� �Ҵ��� ��ü�� knife�� ȣ��� interface�� ������ class�� ������ Ÿ������ ����.
	IFly iFly;
	IMissile iMissile;
	IKnife iKnife;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	} 
	
	public void actionWalk(){
		System.out.println("���� �� �ֽ��ϴ�.");
	}
	
	public void actionRun(){
		System.out.println("�޸� �� �ֽ��ϴ�.");
	}
	
	public abstract void shape();
	
	public void setiFly(IFly iFly) {
		this.iFly = iFly;
	}
	
	public void setiKnife(IKnife iKnife) {
		this.iKnife = iKnife;
	}
	
	public void setiMissile(IMissile iMissile) {
		this.iMissile = iMissile;
	}
	
	public void actionKnife(){
		this.iKnife.knife();
	}
	
	public void actionMissile(){
		this.iMissile.missile();
	}
	
	public void actionFly(){
		this.iFly.fly();
	}

	
}
