package com.move;

public class TestCar {

	public static void main(String[] args) {
		Truck t = new Truck();
		Bike b = new Bike();
		System.out.println(t);
		System.out.println(b);
		b.start();
		Toll t1 = new Toll();
		Vehicles v = t1.nextVechicle();
		Object o = v;
		System.out.println(o);
	}
}
