package com.xworkz.blocks;

public class InitializationBlock {

	{
		// initialization block/ non-static block
		System.out.println("Initialization block 1");
	}

	{
		System.out.println("Initialization block 2");
	}

	InitializationBlock() {
		System.out.println("No-arg constructor");
	}

	InitializationBlock(int a, int b) {
		System.out.println("In parameterized constructor");
	}

	{
		System.out.println("Initialization block 3");
	}
}
