
public class MethodOverloading {

	int addition(int a, int b) {

		int sum = a + b;
		System.out.println("In the method that adds 2 integer");
		return sum;
	}

	// Method Overloading
	// Compile Time Polymorphism

	int addition(int x, int y, int z) {

		int sum = x + y + z;
		System.out.println("In the method that adds 3 integer");
		return sum;
	}

	double addition(double l, double m) {

		double sum = l + m;
		System.out.println("In the method that adds 2 double");
		return sum;
	}

	// Polymorphism
	// Different Forms

}
