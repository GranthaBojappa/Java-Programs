package com.xworkz.accessmodifiers.privatemodifier;

public class Bike {

	private String company;
	private String name;

	private Bike(String inCompany, String inName) {
		company = inCompany;
		name = inName;
	}

	void mileageOfBike(int mileage) {
		System.out.println("Mileage provided by the bike in kmpl: " + mileage);
	}

	public static void main(String[] args) {
		Bike bike = new Bike("Hero", "Hunk");
		bike.company = "KTM";
		bike.name = "Duke390";
		bike.mileageOfBike(28);

	}
}
