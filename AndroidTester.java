package com.xworkz.inheritance;

public class AndroidTester {

	public static void main(String[] args) {
		// inheritance

		AndroidKitKat kitkat = new AndroidKitKat(); // Member from Parent class
		kitkat.version = 10;
		kitkat.cameraPixel = 16;

		kitkat.displayDetails();
		kitkat.calling();
		kitkat.gaming();

		// member from child class
		kitkat.hasfaceLock = true;
		System.out.println("Has FaceLock: " + kitkat.hasfaceLock);
		kitkat.removeBoldClock();

		AndroidJellyBean jellybean = new AndroidJellyBean();
		jellybean.version = 4.0;
		jellybean.cameraPixel = 10;
		jellybean.displayDetails();
		jellybean.calling();
		jellybean.gaming(); // jellyBean.hasfaceLock [not possible because AndroidJellyBean is an
							// independent class]

	}

}

//OUTPUT:-
/*
Version: 10.0 Camera Pixel: 16
Calling
Gaming
Has FaceLock: true
method remove bold clock font
Version: 4.0 Camera Pixel: 10
Calling
Gaming
*/
