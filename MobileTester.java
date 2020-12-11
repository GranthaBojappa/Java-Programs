
public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile GalaxyNote20 = new Mobile();
		GalaxyNote20.brand = "Samsung";
		GalaxyNote20.software = "Android";
		GalaxyNote20.color = "White";
		GalaxyNote20.storageinGB = 128;
		GalaxyNote20.displayinInches = 6.9f;
		GalaxyNote20.expandablememory = true;

		System.out.println("Details of GalaxyNote20: ");
		System.out.println("Brand of GalaxyNote20 : " + GalaxyNote20.brand);
		System.out.println("Software of GalaxyNote20 : " + GalaxyNote20.software);
		System.out.println("Color of GalaxyNote20: " + GalaxyNote20.color);
		System.out.println("Storage of GalaxyNote20(inGB) : " + GalaxyNote20.storageinGB);
		System.out.println("Display of GalaxyNote20(inInches): " + GalaxyNote20.displayinInches);
		System.out.println("GalaxyNote20 has expandable memory: " + GalaxyNote20.expandablememory);

		GalaxyNote20.color = "Rose Gold";
		System.out.println("Latest color of GalaxyNote20 : " + GalaxyNote20.color);
		
		System.out.println( );

		Mobile iPhone12 = new Mobile();
		iPhone12.brand = "Apple";
		iPhone12.software = "iOS";
		iPhone12.color = "Black";
		iPhone12.storageinGB = 64;
		iPhone12.displayinInches = 6.1f;
		iPhone12.expandablememory = false;

		System.out.println("Details of iPhone12 : ");
		System.out.println("Brand of iPhone12 : " + iPhone12.brand);
		System.out.println("Software of iPhone12 : " + iPhone12.software);
		System.out.println("Color of iPhone12 : " + iPhone12.color);
		System.out.println("Storage of iPhone12(inGB) : " + iPhone12.storageinGB);
		System.out.println("Display of iPhone12(inInches): " + iPhone12.displayinInches);
		System.out.println("iPhone12 has expandable memory: " + iPhone12.expandablememory);
	}

}
