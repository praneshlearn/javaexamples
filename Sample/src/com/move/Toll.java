package com.move;

import java.util.Random;

public class Toll {
	Vehicles nextVechicle() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		switch (n) {
		case 1:
			return new Bike();
		case 2:
			return new Truck();
		case 3:
			return new Car();
		default:
			return null;
		}
	}
}
