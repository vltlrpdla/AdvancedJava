package com.advancedjava.ex;

public class BasicExpression {
	//99´Ü
	public static void main(String[] args) {
		
		int i,j;
		
		for(i = 1 ; i <= 9 ; i++){
			for ( j = 2 ; j <= 9 ; j++ ){
				
				System.out.print( j + " * " + i + " = " + (i*j) + '\t' );
				
			}
			System.out.println("");
		}
	}

}
