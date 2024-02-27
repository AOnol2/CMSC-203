import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor:Professor Grinberg
 * Assignment 1
 * Description: (Will display patient information and procedure information and get total cost of charges. )
 * Due: 2/26/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/


public class PatientDriverApp {
	
	public static void main(String[] args){
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = keyboard.nextLine();
		
		System.out.println("Enter middle name: ");
		String middleName = keyboard.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = keyboard.nextLine();
		
		System.out.println("Enter Street adress: ");
		String streetAdress = keyboard.nextLine();
		
		System.out.println("Enter City: ");
		String City = keyboard.nextLine();
		
		System.out.println("Enter State: ");
		String State = keyboard.nextLine();
		
		System.out.println("Enter Zip Code: ");
		String Zip = keyboard.nextLine();
		
		System.out.println("Enter Phone Number: ");
		String phoneNum = keyboard.nextLine();
		
		System.out.println("Enter Emergency Contact Name: ");
		String emergencyContact = keyboard.nextLine();
		
		System.out.println("Enter Emergency Contact Number: ");
		String emergencyNum = keyboard.nextLine();
		
	
		
		//patient object
		Patient patient = new Patient(firstName, middleName, lastName, streetAdress, City, State,  Zip, phoneNum, emergencyContact, emergencyNum);
		
		//procedure 1 
		
		System.out.println("Enter Procedure Name: ");
		String procedure = keyboard.nextLine();
		
		System.out.println("Enter Date Of Procedure: ");
		String procedureDate = keyboard.nextLine();
		
		System.out.println("Enter Practitioner: ");
		String practitioner = keyboard.nextLine();
		
		
		System.out.println("Enter cost of procedure: ");
		double charges = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		Procedure procedure1 = new Procedure(procedure, procedureDate, practitioner, charges);
		
		//procedure 2
		
		System.out.println("Enter Procedure 2 Name: ");
		procedure = keyboard.nextLine();
		
		System.out.println("Enter Date Of Procedure: ");
		procedureDate = keyboard.nextLine();
		
		System.out.println("Enter Practitioner: ");
		practitioner = keyboard.nextLine();
		
		System.out.println("Enter cost of procedure: ");
		charges = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		Procedure procedure2 = new Procedure(procedure, procedureDate, practitioner, charges);
		
		
		//procedure3
		
		System.out.println("Enter Procedure 3 Name: ");
		procedure = keyboard.nextLine();
		
		System.out.println("Enter Date Of Procedure: ");
		procedureDate = keyboard.nextLine();
		
		System.out.println("Enter Practitioner: ");
		practitioner = keyboard.nextLine();
		
		System.out.println("Enter cost of procedure: ");
		charges = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		Procedure procedure3 = new Procedure(procedure, procedureDate, practitioner, charges);
		
		DisplayPatient(patient);
		
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		
		keyboard.close();
		
		System.out.println("Total Charge: " + String.format("%.2f", calculateTotalCharges(procedure1, procedure2, procedure3)) + "\n");
		
		System.out.println("The program was developed by a Student: Ata Onol <02/26/24>");
		System.out.println("Student Name: Ata Onol");
		System.out.println("MC#: M21147655");
		System.out.println("Due Date: 2/26/2024");
		
	}
	
	public static void DisplayPatient(Patient patient){
		System.out.println(patient.toString());
		
	}
	
	public static void displayProcedure(Procedure procedureInfo){
		System.out.println(procedureInfo.toString());
	}
	
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3){
		return procedure1.getcharges() + procedure2.getcharges() + procedure3.getcharges();
	}
}