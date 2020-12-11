
public class ArithmeticOperations {

	int addition(int a, int b) {
		int sum = a + b;
		System.out.println("In the method that adds Two Numbers");
		return sum;
	}

	float subtraction(float a, float b) {
		float sub = a - b;
		System.out.println("In the method that subtracts Two Numbers");
		return sub;
	}

	double multiplication(double a, double b) {
		double mul = a * b;
		System.out.println("In the method that multiplies Two Numbers");
		return mul;
	}

	int division(int a, int b) {
		int div = a / b;
		System.out.println("In the method that divides Two Numbers");
		return div;
	}

	int modulus(int a, int b) {
		int mod = a % b;
		System.out.println("In the method that finds mod value of Two Numbers");
		return mod;
	}
}
