
public class PosOrNegOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find if the no. is pos,neg or zero");

		int num1 = -20;
		findingPosNegZero(num1);

		int num2 = 5;
		findingPosNegZero(num2);

		int num3 = 0;
		findingPosNegZero(num3);

		System.out.println("End of Program");
	}

	static void findingPosNegZero(int num) {

		System.out.println("Method is called");

		if (num > 0) {
			System.out.println("The given number " + num + " is Positive");
		} else if (num < 0) {
			System.out.println("The given number " + num + " is Negative");
		} else {
			System.out.println("The given number is Zero");

		}
		System.out.println("Method completed execution");
	}

}
