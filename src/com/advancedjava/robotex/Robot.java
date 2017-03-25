package com.advancedjava.robotex;

import com.advancedjava.robot.inter.IFly;
import com.advancedjava.robot.inter.IKnife;
import com.advancedjava.robot.inter.IMissile;

public abstract class Robot {

	//set에서 할당한 객체의 knife가 호출됨 interface가 구현된 class를 데이터 타입으로 받음.
	IFly iFly;
	IMissile iMissile;
	IKnife iKnife;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	} 
	
	public void actionWalk(){
		System.out.println("걸을 수 있습니다.");
	}
	
	public void actionRun(){
		System.out.println("달릴 수 있습니다.");
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
