
public class ArithmeticOperationsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin of the Program");

		ArithmeticOperations ref = new ArithmeticOperations();
		int a = 10, b = 15;
		int result1 = ref.addition(a, b);
		System.out.println("Result of adding a: " + a + " + b: " + b + " is= " + result1);

		float c = 9.2f, d = 1.5f;
		float result2 = ref.subtraction(c, d);
		System.out.println("Result of subtracting c: " + c + " - d: " + d + " is= " + result2);

		double p = 9.23d, q = 4.54d;
		double result3 = ref.multiplication(p, q);
		System.out.println("Result of multiplying p: " + p + " * q: " + q + " is= " + result3);

		int r = 20, s = 2;
		int result4 = ref.division(r, s);
		System.out.println("Result of dividing r: " + r + " / s: " + s + " is= " + result4);

		int x = 9, y = 2;
		int result5 = ref.modulus(x, y);
		System.out.println("Result of finding mod of x: " + x + " % y: " + y + " is= " + result5);

		System.out.println("End of the Program");
	}

}
