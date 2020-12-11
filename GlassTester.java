public class GlassTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Program to illustrate instance methods ");

		Glass steelGlass = new Glass();
		steelGlass.material = "Steel";
		steelGlass.shape = "Cone";
		steelGlass.lengthIncm = 10;
		steelGlass.volumeInml = 200;
		System.out.println("Glass Material : " + steelGlass.material);
		System.out.println("Glass Shape : " + steelGlass.shape);
		System.out.println("Glass Length(in cm) : " + steelGlass.lengthIncm);
		System.out.println("Glass Volume(in ml) : " + steelGlass.volumeInml);

		String drink = "Buttermilk";
		steelGlass.drinking(drink); // method call
		System.out.println("End of Program");
	}

}
