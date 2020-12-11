
public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue [skip executing 6]

		for (int i = 1; i <= 10; i++) {
			if (i == 6) {

				continue;
			}
			System.out.println("i= " + i);
		}

	}
}
