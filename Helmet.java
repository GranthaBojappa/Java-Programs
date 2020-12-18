package com.xworkz.blocks;

public class Helmet {
	String brand;
	String color;
	boolean forWomen;
	double price;

	{
		System.out.println("In Initialization block 1");
		brand = "Vega";
		color = "Black";
	}

	Helmet() {
		System.out.println("No-arg constructor");
	}

	{
		System.out.println("In Initialization block 2");
		forWomen = true;
	}

	Helmet(String inBrand, String inColor, double inPrice) {
		System.out.println("Parameterized constructor");
		brand = inBrand;
		color = inColor;
		price = inPrice;
	}

	{
		System.out.println("In Initialization block 3");
		price = 2500d;
	}

	{
		System.out.println("In Initialization block 4");

	}
}
