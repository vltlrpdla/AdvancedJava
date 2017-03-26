package com.advancedjava.hashset;

public class Student {
	String name;
	int grade;
	
	public Student(String name, int grade) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + grade;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	
	

}
