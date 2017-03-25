package com.advancedjava.singletonex;

//외부에서 생성하지 못하게 하고 클래스 영역 메모리에 스태틱 변수 메모리 내 자신 객체 하나 생성하고 이걸 공유해서 사용한다.
public class SingletonClass {
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
	
	private SingletonClass(){
	
	}
	
	public static SingletonClass getSingletonClass(){
		
		if(SINGLETON_CLASS_INSTANCE == null){
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
		
	}
	
	public int getI(){
		return i;
	}
	
	public void setI(int i){
		this.i = i;
	}
	
	

}
