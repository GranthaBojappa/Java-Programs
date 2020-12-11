
public class NStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N Star Pattern Decrement");
		int n = 10;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println( );
		}
		System.out.println("3 row 3 col");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
	}

}
