package com.advancedjava.intertoy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy pooh = new PoohToyClass();
		Toy mazinga = new MazingaToyClass();
		Toy airplane = new AirplaneToyClass();
		
		//�����ϴ� ���� ������ �͸� Ŭ������ �߻�޼ҵ带 �����ؼ� ����Ͽ���.
		AbsClass absclass = new AbsClass() {
			
			@Override
			public void doMethod() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
