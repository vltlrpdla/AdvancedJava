package com.advancedjava.studentmanager;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		
		StudentManager manager = new StudentManager();//  메인 메소드를 매니저 안의 메소드라고 착각하면 안된다. 단지 진입점
		manager.addStudent("홍길동", 22, 2012123123, "연극영화");
		manager.addStudent("김지원", 24, 2012124123, "컴퓨터공학과");
		manager.addStudent("장길산", 21, 2011123123, "국어국문학과");
		manager.addStudent("장발장", 25, 2015123123, "체육학과");
		
		manager.studentExpel.addExpelStudent("정훈이", 26, 201116896, "컴퓨터공학과");
		
	    System.out.println(manager.students.get(0).getName());
	    manager.students.get(0).updateInfo(1, "이정훈");
	    
	    System.out.println("변경된 이름 : " + manager.students.get(0).getName());
	}
	
	private void addStudent(String name, int age, int studentNum, String major){
		
		students.add(new Student(name,age,studentNum,major));
		System.out.println(name + " 학생 정보 입력 성공!!!");
	}

}
