package com.xworkz.blocks;

public class HelmetTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Helmet helmet1 = new Helmet();
		
		System.out.println("Brand: " +helmet1.brand);  //vega
		System.out.println("Color: " +helmet1.color);  //black
		System.out.println("For Women: " +helmet1.forWomen);  //true
		System.out.println("Price: " +helmet1.price);  //2500
		
		System.out.println("========================");
		
		Helmet helmet2 = new Helmet("SteelBird","white",2000d);
		
		System.out.println("Brand: " +helmet2.brand);  //Steelbird
		System.out.println("Color: " +helmet2.color);  //white
		System.out.println("For Women: " +helmet2.forWomen);  //true
		System.out.println("Price: " +helmet2.price);  //2000
	}

}
