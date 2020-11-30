package com.ydm;

public class StudentExample {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setsName("예담");
		s1.setsNo("20-1234");
		s1.setName("Lee");
		s1.setsClass("프로그래밍");
		System.out.println(s1.getName());
		System.out.println(s1.getsClass());

		Student s2 = new Student("예담", "20-2345");
		s2.setName("Kim");
		s2.setsClass("영문학");
		System.out.println(s2.getsName());
		System.out.println(s2.getsNo());

		Student s3 = new Student("예담", "20-1234");
		s3.setName("Park");
		s3.setsClass("역사학");
		System.out.println(s3.getName());
		System.out.println(s3.getsClass());
		System.out.println(s3.getsName());
		System.out.println(s3.getsNo());

		Student[] students = { s1, s2, s3 };
		for (Student student : students) {
			student.showMemberInfo();
		}
	}
}
