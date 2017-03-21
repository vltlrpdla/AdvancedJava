package com.advancedjava.cartex;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarCar starCarLowGrade = new StarCarLowGrade(CarSpec.COLOR_BLUE
				,CarSpec.TIRE_NORMAL
				,CarSpec.DISPLACEMENT_2000
				,CarSpec.HANDLE_NORMAL);
		StarCar starCarHighGrade = new StarCarHighGrade(CarSpec.COLOR_RED
				,CarSpec.TIRE_WIDE
				,CarSpec.DISPLACEMENT_2200
				,CarSpec.HANDLE_POWER
			);
		
		starCarLowGrade.getSpec();
		starCarHighGrade.getSpec();

	}

}
