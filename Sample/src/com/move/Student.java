package com.move;

public class Student {
	int stId;
	{
		System.out.println("Student");
	}

	void talk() {
		System.out.println("Talk");
	}

	public static void main(String[] args) {
		Student s = new Student();
	}
}
