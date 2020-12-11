
public class NumOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to illustrate number of days in a month");
		String month = "Sun";
		switch (month) {

		case "Jan":
			System.out.println(" Jan has 31 days ");
			break;
		case "Feb":
			System.out.println("  Feb has 28/29 days ");
			break;
		case "Mar":
			System.out.println(" Mar has 31 days ");
			break;
		case "Apr":
			System.out.println(" Apr has 30 days ");
			break;
		case "May":
			System.out.println(" May has 31 days ");
			break;
		case "Jun":
			System.out.println(" Jun has 30 days ");
			break;
		case "Jul":
			System.out.println(" Jul has 31 days ");
			break;
		case "Aug":
			System.out.println(" Aug has 31 days ");
			break;
		case "Sep":
			System.out.println(" Sep has 30 days ");
			break;
		case "Oct":
			System.out.println(" Oct has 31 days ");
			break;
		case "Nov":
			System.out.println(" Nov has 30 days ");
			break;
		case "Dec":
			System.out.println(" Dec has 31 days ");
			break;
		default : System.out.println(" The given month is invalid ");
		}
		System.out.println(" End of the Program");
	}

}

