
public class GradePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'D';
		switch (grade) {
		case 'A':
			System.out.println(" Grade A Percentage below 85 - 100 ");
			break;
		case 'B':
			System.out.println(" Grade B Percentage below 65 - 84 ");
			break;
		case 'C':
			System.out.println(" Grade C Percentage below 45 - 64 ");
			break;
		case 'D':
			System.out.println(" Grade D Percentage below 35 - 44 ");
			break;
		default:
			System.out.println(" Grade E ");

		}
	}

}
