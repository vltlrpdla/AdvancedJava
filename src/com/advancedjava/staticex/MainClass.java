package com.advancedjava.staticex;

import com.advancedjava.children.*;

public class MainClass {
	
	public static void main(String[] args){
		
		FirstChild firstchild = new FirstChild();
		firstchild.tatkeMoney(100);
		
		SecondChild secondchild = new SecondChild();
		secondchild.tatkeMoney(100);
		
		ThirdChild thirdchild = new ThirdChild();
		thirdchild.tatkeMoney(100);
		
	}

}
