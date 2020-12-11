
public class FindingIfNumIsEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program to find if the given number is even or not");

		int num1 = 10;
		findingEven(num1);

		int num2 = 65;
		findingEven(num2);

		int num3 = 84;
		findingEven(num3);
		
	System.out.println("End of Program");
	}

	static void findingEven(int num) {

		System.out.println("Method is called");

		if (num % 2 == 0) {
			System.out.println("The given number " + num + " is even");
		} else {
			System.out.println("The given number " + num + " is odd");
		}
		System.out.println("Method completed execution");
	}

}
