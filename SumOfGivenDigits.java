
public class SumOfGivenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123, sum;

		for (sum = 0; n != 0; n /= 10) {
			sum += n % 10;
		}
		System.out.println("Sum of digits of the given number is " + sum);
	}

}
