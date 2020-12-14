package com.xworkz.accessmodifiers.defaultmodifier;

class Mobile {   //default modifier is used when any access modifier is not specified

	String brand;
	String name;
	int ramInGB;

	Mobile(String inBrand, String inName, int inRamInGB) {

		brand = inBrand;
		name = inName;
		ramInGB = inRamInGB;
	}

	void capturingPhotos() {
		System.out.println("Captures High Resolution Photos");
	}

	void playMusic() {
		System.out.println("Plays soothing Music ");
	}
}
