
public class MethodOverloadingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin of the program");

		MethodOverloading operation = new MethodOverloading();
		int a = 10, b = 20;
		int result1 = operation.addition(a, b); // method call
		System.out.println("Result of adding a: " + a + " b: " + b + " is: " + result1);

		int p = 12, q = 81, r = 9;
		int result2 = operation.addition(p, q);
		System.out.println("Result of adding p: " + p + " q: " + q + " r: " + r + " is: " + result2);

		double l = 15.00, m = 75.23;
		double result3 = operation.addition(l, m);
		System.out.println("Result of adding l: " + l + " m: " + m + " is: " + result3);
		  
		System.out.println("End of Program");

	}

}
