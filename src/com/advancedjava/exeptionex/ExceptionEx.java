package com.advancedjava.exeptionex;

public class ExceptionEx {

	public ExceptionEx() {
		// TODO Auto-generated constructor stub
		
		actionA();
	}
	
	public void actionA(){
		System.out.println("actionA");
		actionB();
		System.out.println("actionAA");
	}
	
	public void actionB(){
		System.out.println("actionB");
		try{
			actionC();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("����ó���� �޾ƿɴϴ�.");
			System.out.println("actionCtoB");
		}
		System.out.println("actionBB");
	}
	
	public void actionC() throws Exception{
		System.out.println("actionC");
		int[] arr = {1, 2, 3, 4};
		System.out.println(arr[4]);
		
		System.out.println("actionCC");
		
	}
	
	
	

}
