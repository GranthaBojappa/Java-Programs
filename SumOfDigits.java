
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find the sum of digits");

		int num1 = 123;
		findingSumOfNum(num1);

		int num2 = 456;
		findingSumOfNum(num2);

		int num3 = 789;
		findingSumOfNum(num3);

		System.out.println("End of Program");
	}

	static void findingSumOfNum(int num) {

		System.out.println("Method is called");

		int sum = 0;
		do {
			sum += num % 10;
			num /= 10;
		} while (num > 0);

		System.out.println("The sum of given digits is: " + sum);
		System.out.println("Method completed execution");
	}

}
