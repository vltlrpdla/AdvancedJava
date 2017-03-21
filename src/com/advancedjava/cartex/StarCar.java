package com.advancedjava.cartex;

public abstract class StarCar {
	
	public String color;
	public String tire;
	public int displacement;
	public String handle;
	
	public StarCar(){}
	
	public StarCar(String color, String tire, int displacement, String handle){
		
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
		
	}
	
	public abstract void getSpec();
	

}
