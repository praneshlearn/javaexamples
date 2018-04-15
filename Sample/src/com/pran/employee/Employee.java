package com.pran.employee;

public class Employee {
	String name;
	int age;
	static String companyName = "Google";

	Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Employee e = new Employee("XYZ", 30);
Employee employee = new Employee(name, age);
		System.out.println(Employee.companyName + "  " + e.age + "  " + e.name);
	}
}
