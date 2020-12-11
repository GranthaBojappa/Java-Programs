
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find the factorial");

		int num1 = 5;
		findingFactorial(num1);

		int num2 = 6;
		findingFactorial(num2);

		int num3 = 8;
		findingFactorial(num3);

		System.out.println("End of Program");
	}

	static void findingFactorial(int num) {

		System.out.println("Method is called");

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i; // fact = fact * i
		}
		System.out.println("Factorial of " + num + " is: " + fact);
		System.out.println("Method completed execution");
	}
}
