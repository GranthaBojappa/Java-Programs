
public class SkipFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// skip printing multiples of 5
		int n = 5, i = 1;
		while (i < 20) {
			if (i % n == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
