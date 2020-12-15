package com.xworkz.memorymanagement;

public class FindingCircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find circmference of a circle");

		FindingCircumferenceOfCircle findcircum = new FindingCircumferenceOfCircle();
		double result = findcircum.findcircumference(5);
		System.out.println("Circumference of the circle with radius 5 is " + result);
		System.out.println("End of the Program");
	}

	double findcircumference(int radius) {
		// C = 2 * pi * r;
		double circumference;
		double pi = findPi();
		System.out.println("Value of pi: " + pi);
		circumference = 2 * pi * radius;
		return circumference;
	}

	double findPi() {
		double pi = 22d / 7d;
		return pi;

	}

}
