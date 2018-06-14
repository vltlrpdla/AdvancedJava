package com.advancedjava.designpattern.composite;

import java.util.*;

public class Composite {

	public static void main(String[] args) {
		
		Directory dir = new Directory("hummingbird");
		Node node = new File("video");
		dir.add(node); // 디렉토리에 파일 하나를 삽입!
		//dir.add(new Directory()); // 디렉토리에 디렉토리를 삽입!
		//Directory secondDir = new Directory();
	//	secondDir.add(dir); // 기존 루트 디렉토리를 새로 만든 디렉토리에 삽입!
		System.out.println(node.getName() + dir.getName());
	}
}


interface Node {
    public String getName();
}

/**
File 클래스는 Node 인터페이스를 구현하면 끝입니다. 자신은 자식 요소를 가질 필요가 없기 때문이죠.
*/
class File implements Node {
    private String name;
    // ...
    public File(String name){
    	this.name =name;
    }
    @Override
    public String getName(){ return name; }
}

/**
Directory 클래스는 Node 인터페이스를 구현하는 것 외에도 자식 요소를 담아둘 List가 필요합니다.
*/
class Directory implements Node {
    private String name;
    private List<Node> children;
    
    public Directory(String name){
    	this.name = name;
    }
    // ...
    @Override
    public String getName(){ return name; }
    public void add(Node node) {
        this.children.add(node);
    }
}

