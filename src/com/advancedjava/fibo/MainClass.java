package com.advancedjava.fibo;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indexInput;
		
		// n�ױ��� ��� �� ���� ���Ѵ�.
		System.out.println("�� �ױ��� ?");
		Scanner sc = new Scanner(System.in);
		
		while( true ){
			
			indexInput = sc.nextInt();
			
			if ( indexInput > 0)
				break;
		
		}
		
		
		Fibonacci fibo = new Fibonacci(indexInput);
		
		fibo.print();
		
		// n�� ���� ���ϴ� �޼ҵ� 
			
		// n�ױ����� ���� ���
	}
	
	
	

}
