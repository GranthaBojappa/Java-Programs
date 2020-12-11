
public class BranchSubjectInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String branch = "CS";
		String subject = "JAVA";
		switch (branch) {
		case "CS":
			switch (subject) {
			case "JAVA":
				System.out.println(" CS : JAVA : Intro to Java, Features of Java, Datatypes ");
				break;
			case "ST":
				System.out.println(" CS : ST : Path Testing, Data Flow Testing, Levels of testing ");
				break;
			case "SE":
				System.out.println(" CS : SE : Software Processes, Requirement Engineering, System Models ");
				break;
			}
			break;
		case "EC":
			switch (subject) {
			case "DC":
				System.out.println(" EC : DC : Baseband Transmission, Error Control Coding ");
				break;
			case "CN":
				System.out.println(" EC : CN : Fundamentals and Link Layer, Media Access, Internet Working ");
				break;
			case "CA":
				System.out.println(" EC : CA : Computer Organisation, Arithmetic, The Processor ");
				break;
			}
			break;
		case "ME":
			switch (subject) {
			case "AM":
				System.out.println(" ME : AM : Intro to Addictive Manufacturing, System Drives and Devices ");
				break;
			case "FEA":
				System.out.println(" ME : FEA : Intro to first element analysis, Beams and Shafts, Heat Transfer ");
				break;
			}
			break;

		}

	}

}
