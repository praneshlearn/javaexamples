package com.billdesk;

import java.awt.DisplayMode;

public class Student {
	String name;
	int age;
	static String schoolName = "XYIT";
	static boolean isPresent = true;

	void display() {
		System.out.println(name + "  " + age + "  " + schoolName + "  " + isPresent);
	}

	static void displ() {
		Student s1 = new Student();
		s1.name = "Pran";
		s1.age = 25;
		System.out.println(s1.name + "  " + s1.age + "  " + schoolName + "  " + isPresent);

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		displ();
	}
}