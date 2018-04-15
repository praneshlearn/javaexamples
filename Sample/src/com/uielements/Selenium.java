package com.uielements;

import java.util.Scanner;

public class Selenium {
	UIElements getElements(String elemName) {
		if (elemName.equalsIgnoreCase("TextBox"))
			return new TextBox();
		else if (elemName.equalsIgnoreCase("RadioButton"))
			return RadioButton();
		else if (elemName.equalsIgnoreCase("CheckBox"))
			return new CheckBox();
		else
			return null;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner();
		Selenium se = new Selenium();
		System.out.println("What element you want?");
		String elementName = s.next();
		UIElements u = new UIElements(elementName);
		System.out.println(u);
	}
}
