package com.carbuy;

import java.util.Random;

public class Showroom {
	Car luckydraw() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		if (n == 1)
			return new Audi();
		else if (n == 2)
			return new Jaguar();
		else
			return new BMW();
	}

	public static void main(String[] args) {

		Showroom s = new Showroom();
		Car c = s.luckydraw();
		System.out.println(c);
	}
}
