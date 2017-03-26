package com.advancedjava.randomex;

import java.util.Random;
import java.util.Scanner;



public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = Math.random();
		System.out.println(d);
		
		int dtoInteger = (int)(d*10);
		
		System.out.println(dtoInteger);
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
		
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();// \n 개행문자를 만나면 어떻게 처리되는가
		System.out.println(str1);
		
		String str2 = scanner.nextLine();
		System.out.println(str2);
		
		System.out.println("END");

	}

}
