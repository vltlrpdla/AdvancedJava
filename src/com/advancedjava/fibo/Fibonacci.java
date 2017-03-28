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
	
		// n��° ���� ���� ���Ѵ�.
		// n��° ���� ���� ���� �� ���� ���� ���̴�
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
