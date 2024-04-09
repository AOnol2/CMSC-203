/*
 * Class: CMSC203 
 * Instructor: Dr. Grinberg
 * Lab #6
 * Description: (In this lab, you will be creating new classes that are derived from a class called BankAccount. )
 * Due: 04/08/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/
public class CheckingAccount extends BankAccount{
	
	//fields
	private static final double FEE = .15;
	
	//constructors
	public CheckingAccount(String name, double originalAmount) {
		super(name, originalAmount);
		setAccountNumber(getAccountNumber() + "-10");	
	}
	
	//methods
	@Override
	public boolean withdraw(double amount) {
		
		double total = amount + FEE;
		return super.withdraw(total);	
	}
}