package com.xworkz.accessmodifiers.publicmodifier;

public class Ruler {
	public String material;
	public int lengthIncm;

	public Ruler(String inMaterial, int inLengthIncm) {

		material = inMaterial;
		lengthIncm = inLengthIncm;
	}

	public void DrawLine() {
		System.out.println("Used to draw a straight line");
	}
}
