package com.xworkz.staticmembers.fields;

public class TraineeTester {

	public static void main(String[] args) {

		Trainee sumana = new Trainee(1, "Sumana", "sumana@gmail.com", 22);
		sumana.displayDetails();

		Trainee.setInstitution("X-workz");

		Trainee supritha = new Trainee(2, "Supritha", "supritha@gmail.com", 21);
		supritha.displayDetails();

		Trainee prerana = new Trainee(3, "Prerana", "prerana@gmail.com", 21);
		prerana.displayDetails();

		Trainee manasa = new Trainee(4, "Manasa", "manasa@gmail.com", 22);
		manasa.displayDetails();
	}
}

// OUTPUT:-
/*
 * Id: 1 Name: Sumana Email-Id: sumana@gmail.com Institution: null Age:22
 * Id: 2 Name: Supritha Email-Id: supritha@gmail.com Institution: X-workz Age:21
 * Id: 3 Name: Prerana Email-Id: prerana@gmail.com Institution: X-workz Age:21
 * Id: 4 Name: Manasa Email-Id: manasa@gmail.com Institution: X-workz Age:22
*/