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
public class Procedure
{
	private String procedure, procedureDate, practitioner;
	private double charges;
	public Procedure(){
		
	//no arg-constructor
	}
	
	public Procedure(String procedure, String procedureDate)
	{
		this.procedure = procedure;
		this.procedureDate = procedureDate;
	}
	
	public Procedure(String procedure, String procedureDate, String practitioner, double charges)
	{
		this.procedure = procedure;
		this.procedureDate = procedureDate;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	//Accessors
	public String getprocedure()
	{
		return procedure;
	}
	
	public String getprocedureDate()
	{
		return procedureDate;
	}
	
	public String getpractitioner()
	{
		return practitioner;
	}
	
	public double getcharges()
	{
		return charges;
	}
	//mutators
	public void setProcedure(String procedure)
	{
		this.procedure = procedure;
	}
	
	public void setprocedureDate(String procedureDate)
	{
		this.procedureDate = procedureDate;
	}
	
	public void practitioner(String practioner)
	{
		this.practitioner = practitioner;
	}
	
	public void charges(double charges)
	{
		this.charges = charges;
	}
	
	public String toString()
	{
		return "	Procedure Information: \n" + "	Procedure: " + procedure + "\n" + "	Date: " + 
				procedureDate + "\n" + "	Practitioner: " +
				practitioner + "\n " + "	Charges: $" +String.format("%.2f", charges) + "\n";
	}
}