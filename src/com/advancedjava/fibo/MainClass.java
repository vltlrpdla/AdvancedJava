package com.advancedjava.fibo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indexInput;
		
		// n항까지 출력 할 건지 정한다.
		System.out.println("몇 항까지 ?");
		Scanner sc = new Scanner(System.in);
		
		while( true ){
			
			indexInput = sc.nextInt();
			
			if ( indexInput > 0)
				break;
		
		}
		
		
		Fibonacci fibo = new Fibonacci(indexInput);
		
		fibo.print();
		
		// n항 합을 구하는 메소드 
			
		// n항까지의 수를 출력
	}
	
	
	

}
