package com.advancedjava.designpattern.singleton;

public class Singleton {
	// 멀티 스레드 환경에서의 문제점을 생각해보자 원자성이 보장이 안된다면 2개 이상의 싱글톤 객체가 생겨날 수 있다. 그러므로 해결방법이 요구됨 , 
	// sincronized 와 같은 키워드 더블 라킹 , eager initialize 와 같은 해결 방법을 쓴다. 
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}