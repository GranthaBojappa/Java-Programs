package com.xworkz.accessmodifiers.privatemodifier;

class Guitar {

	private String brand;
	private String type;

	private Guitar(String inBrand, String inType) {
		brand = inBrand;
		type = inType;
	}

	void playingMusic() {
		System.out.println("Perform in a Band");
	}

	public static void main() {
		Guitar guitar = new Guitar("Yamaha", "Acoustic");
		guitar.brand = "Martin";
		guitar.type = "Electric";
		guitar.playingMusic();
	}
}