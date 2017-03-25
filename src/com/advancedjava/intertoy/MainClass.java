package com.advancedjava.intertoy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy pooh = new PoohToyClass();
		Toy mazinga = new MazingaToyClass();
		Toy airplane = new AirplaneToyClass();
		
		//생성하는 것은 좋으나 익명 클래스로 추상메소드를 구현해서 사용하여라.
		AbsClass absclass = new AbsClass() {
			
			@Override
			public void doMethod() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
