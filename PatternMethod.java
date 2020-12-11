public class PatternMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program to illustrate the Pattern");

		int num1 = 5;
		findingPattern(num1); // method calling

		int num2 = 4;
		findingPattern(num2);

		int num3 = 6;
		findingPattern(num3);

		System.out.println("End of Program");
	}

	// accessmodifier static returntype methodname(parameters)
	static void findingPattern(int num) { // Calling Method //Method Signature

		System.out.println("Method is called");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
