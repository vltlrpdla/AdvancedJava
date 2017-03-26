package com.advancedjava.stringtokenizer;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "¿À´Ã ³¯¾¾´Â ¸Å¿ì Ãä°í, ´«ÀÌ ¸¹ÀÌ ¿À°í ÀÖ½À´Ï´Ù.";
		String str2 = "2014/12/25";
				
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2,"/");
		
		
		while(tokenizer1.hasMoreTokens()){
			System.out.println(tokenizer1.nextToken());
		}
		
		while(tokenizer2.hasMoreTokens()){
			System.out.println(tokenizer2.nextToken());
		}
	}

}
