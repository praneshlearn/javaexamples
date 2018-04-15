package com.food;

public class Shop {
	Vegetable sell(String vegetableName) {
		if (vegetableName.equalsIgnoreCase("Onion"))
			return new Onion();
		else if (vegetableName.equalsIgnoreCase("Carrot"))
			return new Carrot();
		else if (vegetableName.equalsIgnoreCase("Ginger"))
			return new Ginger();
		else
			return null;
	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Vegetable v = s.sell("Onion");
		System.out.println(v);
	}
}
