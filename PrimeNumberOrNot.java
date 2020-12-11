
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program to find prime number or not");

		int num1 = 9;
		findingPrime(num1);

		int num2 = 7;
		findingPrime(num2);

		int num3 = 10;
		findingPrime(num3);

		System.out.println("End of Program");
	}

	static void findingPrime(int num) {

		System.out.println("Method is called");
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
		System.out.println("Method completed execution");
	}

}
