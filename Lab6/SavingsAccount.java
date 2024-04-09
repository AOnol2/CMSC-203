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
public class SavingsAccount extends BankAccount {
	
	//fields
	public static double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	
	//constructors
	public SavingsAccount(String name, double originalBalance) {
		super (name, originalBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount secondAccount, double originalBalance) {
		super(secondAccount, originalBalance);
		savingsNumber = secondAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	//methods
	public void postInterest() {
		double interest = (getBalance() * rate ) / 12;
		deposit (interest);
	}
	
	@Override
	public String getAccountNumber() {
		return (accountNumber);
	}
}