package com.advancedjava.studentmanager;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		
		StudentManager manager = new StudentManager();//  ���� �޼ҵ带 �Ŵ��� ���� �޼ҵ��� �����ϸ� �ȵȴ�. ���� ������
		manager.addStudent("ȫ�浿", 22, 2012123123, "���ؿ�ȭ");
		manager.addStudent("������", 24, 2012124123, "��ǻ�Ͱ��а�");
		manager.addStudent("����", 21, 2011123123, "������а�");
		manager.addStudent("�����", 25, 2015123123, "ü���а�");
		
		manager.studentExpel.addExpelStudent("������", 26, 201116896, "��ǻ�Ͱ��а�");
		
	    System.out.println(manager.students.get(0).getName());
	    manager.students.get(0).updateInfo(1, "������");
	    
	    System.out.println("����� �̸� : " + manager.students.get(0).getName());
	}
	
	private void addStudent(String name, int age, int studentNum, String major){
		
		students.add(new Student(name,age,studentNum,major));
		System.out.println(name + " �л� ���� �Է� ����!!!");
	}

}
