
public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program to find the number of digits");

		int num1 = 12;
		findingNumOfDigit(num1);

		int num2 = 123;
		findingNumOfDigit(num2);

		int num3 = 1234;
		findingNumOfDigit(num3);

		System.out.println("End of Program");
	}

	static void findingNumOfDigit(int num) {

		System.out.println("Method is called");

		int count = 0;
		do {
			num = num / 10;
			count++;
		} while (num != 0);
		System.out.println("Number of digits " + count);

		System.out.println("Method completed execution");
	}

}
