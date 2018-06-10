package com.advencedjava.designpattern.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ALib alib = new ALib();
		// 아래 라인이 해석이 안되면 Java Upcasting 공부를 하셔야합니다.
		PhotoEngine lib = new ALibAdapter( alib );
		String[] photoList = { "abc.jpg" , "def.jpg" };
		lib.printPhotoList(photoList);
		lib.printPhoto("abc.jpg");
		lib.deletePhoto("abc.jpg");
		lib.addPhoto("aaa.jpg");
	}

}
