package com.xworkz.staticmembers.fields;

public class Trainee {
	int id;
	String name;
	String emailId;
	static String institution; //static String institution = "X-workz"; can be given directly if method isn't used containing value of
								// variable
	int age;

	Trainee(){
		System.out.println("no-arg constructor");
	}

	Trainee(int inId, String inName, String inEmailId, int inAge) {
		id = inId;
		name = inName;
		emailId = inEmailId;
		age = inAge;
	}

	static void setInstitution(String institutionName) {
		// initialization of static variables
		// called based on requirement
		// cannot access non-static members
		institution = "X-workz";
	}

	void displayDetails() {
		System.out.println("Id: " + id + " Name: " + name + " Email-Id: " + emailId + " Institution: " + institution
				+ " Age:" + age);
	}
}
