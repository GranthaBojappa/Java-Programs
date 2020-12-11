public class FindingGreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 54, b = 12, c = 67;

		FindingGreaterNum ref = new FindingGreaterNum();

		// Finding greater number

		int res1 = ref.findGreatestNumber(a, b, c);
		System.out.println(res1 + " is the greatest number among 54,12,67 ");

		int res2 = ref.findGreatestNumber(50, 71, 15);
		System.out.println(res2 + " is the greatest number among 50,71,15 ");
	}

	int findGreatestNumber(int a, int b, int c) {
		int result = 0;
		if (a > b) {
			if (a > c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b > c) {
				result = b;
			} else {
				result = c;

			}
		}
		return result;
	}

}
