package com.advancedjava.hashset;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> studentSets = new HashSet<Student>();
		
		studentSets.add(new Student("�̼���",6));
		studentSets.add(new Student("�庸��",3));
		studentSets.add(new Student("ȫ�浿",1));
		
		System.out.println(studentSets.toString());
		
		Student removeStudent = new Student("�庸��",3);
		
		studentSets.remove(removeStudent);
		
		System.out.println(studentSets.toString());
		
	}

}
