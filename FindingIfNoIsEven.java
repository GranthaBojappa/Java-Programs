public class FindingIfNoIsEven {

	public static void main(String[] args) { // calling-method
		// TODO Auto-generated method stub
		// main -> JVM

		System.out.println("Program to find even or not");
		FindingIfNoIsEven ref = new FindingIfNoIsEven();

		int num1 = 10;
		ref.findingEven(num1); // method calling

		int num2 = 65;
		ref.findingEven(num2); // method calling

		int num3 = 84;
		ref.findingEven(num3); // method calling

		System.out.println("End of Program");
	}

	// access-modifier static return-type method-name(parameters)
	void findingEven(int num) { // method-signature //called-method

		System.out.println("Method is called");
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		System.out.println("Method completed executing");
	}
}
