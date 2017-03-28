package com.advancedjava.fibo;

public class Fibonacci {
	int lastIndex;
		
	public Fibonacci(int lastIndex){
		
		this.lastIndex = lastIndex;
		
	}
	
	public int getNValue(int n){
		int firstValue = 1;
		int secondValue = 1;
		int tempValue = 0;
	
		// n번째 항의 값을 구한다.
		// n번째 항의 값은 이전 두 항의 값의 합이다
		// An = An-1  + An-2
		if ( 1 == n )
			return firstValue;
		
		
		for ( int i = 2 ; i <= n ; i ++){
			tempValue = firstValue + secondValue;
			firstValue = secondValue;
			secondValue = tempValue;
			tempValue = 0;
		}
		
		return secondValue;
		
	}
	
	public static int sumToIndex(int index){
		int tempSum = 0;
		for(int i = 1; i <= index ; i++){
			tempSum += index;
		}
		
		return tempSum;
	}
	
	public void print(){
		for( int i = 1 ; i <= lastIndex ; i++){
			System.out.println(getNValue(i) + " ");
		}
	}

}
