
public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Finding grade for percentage: ");
		
		float percentage = 78.9f;
		if(percentage >= 85) {
			System.out.println(" You have got A grade ");
		}
		else if(percentage >= 65 && percentage <= 84) {
			System.out.println(" You have got B grade ");
		}
		else if(percentage >= 35 && percentage <= 64) {
			System.out.println(" You have got C grade ");
		}
		else {
			System.out.println(" You have got D grade ");
		}
	}
}
