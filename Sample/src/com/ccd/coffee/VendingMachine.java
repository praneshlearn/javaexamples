package com.ccd.coffee;

public class VendingMachine {
	Beverages give(int option) {
		switch (option) {
		case 1:
			return new Capuchino();
		case 2:
			return new Expresso();
		default:
			return new GreenTea();
		}
	}

	public static void main(String[] args) {
		VendingMachine v = new VendingMachine();
		Beverages b = v.give(1);

	}
}