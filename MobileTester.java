package com.xworkz.accessmodifiers.defaultmodifier;

class MobileTester {     //default modifier

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mobile mobile = new Mobile("Samsung", "GalaxyNote20", 128);
		 mobile.brand = "Apple";
		 mobile.name = "iPhone12";
		 mobile.ramInGB = 64;
		 System.out.println(mobile.brand);
		 System.out.println(mobile.name);
		 System.out.println(mobile.ramInGB);
		 mobile.capturingPhotos();
		 mobile.playMusic(); 
	}

}
