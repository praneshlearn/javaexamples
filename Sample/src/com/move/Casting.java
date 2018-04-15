package com.move;

public class Casting {
public static void main(String[] args) {
	Lion l = new Lion();
	Carnivorous c= l;
	Animal a = c;
	Object o = a;
	
	Object o1 = new Lion();
	Animal a1=(Animal) o1;
	Carnivorous c1=(Carnivorous)a1;
	Lion L=(Lion) c;
	
}
}
