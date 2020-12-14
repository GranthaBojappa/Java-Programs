package com.xworkz.accessmodifiers.publicmodifier.test;

import com.xworkz.accessmodifiers.publicmodifier.Ruler;

public class RulerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ruler ruler = new Ruler("Wooden", 30);
		ruler.material = "Plastic";
		ruler.lengthIncm = 15;
		System.out.println("Material of ruler: " +ruler.material);
		System.out.println("Length of ruler in cm: " +ruler.lengthIncm);
		ruler.DrawLine();
	}

}
