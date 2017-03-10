package com.advancedjava.studentmanager;

import java.util.ArrayList;

public class StudentExpel {
	
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major){
		
		expelStudents.add(new Student(name,age,studentNum,major));
		
		System.out.println("제적 학생 등록 완료");
	}

}
