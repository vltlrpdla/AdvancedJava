package com.advancedjava.arraylistex;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());
		
		arrayList.set(2, "str2222");
		System.out.println(arrayList.toString());
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		System.out.println(arrayList.size());
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList = null;
		System.out.println(arrayList);

	}

}
