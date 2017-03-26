package com.advancedjava.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		
		System.out.println(hashMap.toString());
		
		
		String str = hashMap.get(2);
		System.out.println(str);
		
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		System.out.println(hashMap.toString());
		
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			System.out.println(hashMap.get(integer));
		}
		
		 
	}

}
