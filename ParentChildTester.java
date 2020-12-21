package com.xworkz.inheritance.parents;

public class ParentChildTester {

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.tallHeight = 5.2;
		child.longNose = 3;
		child.longFoot = 5;

		child.displayDetails();
		child.property();
		child.singing();
		child.drawing();

		child.longFingers = true;
		System.out.println("Has Long Fingers: " + child.longFingers);

	}

}

//OUTPUT:-
/*
Tall height: 5.2 Long nose: 3 Long foot: 5
Dependent
Singing a song
Drawing
Has Long Fingers: true
*/