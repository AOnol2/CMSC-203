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
public class Patient {
	
	private String firstName, middleName, lastName, streetAdress, City, State, Zip, phoneNum, emergencyName, emergencyNum;
	
	//no arg-constructor
	public Patient(){
		
	}
	
	public Patient(String firstName, String middleName, String lastName){
		this.firstName = firstName;
		this.middleName= middleName;
		this.lastName = lastName;
	}
	
	

	public Patient(String firstName, String middleName, String lastName, String streetAdress, String City, String State, String Zip, String phoneNum, String emergencyName, String emergencyNum){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAdress = streetAdress;
		this.City = City;
		this.State = State;
		this.Zip = Zip;
		this.phoneNum = phoneNum;
		this.emergencyName = emergencyName;
		this.emergencyNum = emergencyNum;
	}
	
	
	//Accessor
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getmiddleName()
	{
		return middleName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public String getstreetAdress()
	{
		return streetAdress;
	}
	
	public String getCity()
	{
		return City;
	}
	
	public String getState()
	{
		return State;
	}
	
	public String getZip()
	{
		return Zip;
	}
	
	public String getphoneNum()
	{
		return phoneNum;
	}
	
	public String getemergencyName()
	{
		return emergencyName;
	}
	
	public String getemergencyNum()
	{
		return emergencyNum;
	}
	
	//mutators setting
	
	public void setfirstName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setmiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setstreetAdress(String streetAdress)
	{
		this.streetAdress = streetAdress;
	}
	public void setCity(String City)
	{
		this.City = City;
	}
	public void setState(String State)
	{
		this.State = State;
	}
	public void setZip(String Zip)
	{
		this.Zip = Zip;
	}
	public void setphoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public void setemergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	public void setemergencyNum(String emergencyNum)
	{
		this.emergencyNum = emergencyNum; //creates instance of same variable name 
	}
	
	//building full name method returns full name
	public String buildFullName(String firstName, String middleName, String lastName)
	{
		return firstName + " " + middleName + " " + lastName;
	}
	//build address method returns address 
	public String buildAddress(String streetAdress, String City, String State, String Zip)
	{
		return streetAdress + " " + City + " " + State + " " + Zip;
	}
	
	public String buildEmergencyContact(String emergencyName, String emergencyNum)
	{
		return emergencyName + " " + emergencyNum;
	}
	public String toString()
	{
		return "	Patient Info:\n" + 
				"	Name: " + buildFullName(firstName, middleName, lastName) + "\n" + "	Adress:" + buildAddress(streetAdress, City, State, Zip) + "\n" + "	Phone Number:" +
				phoneNum + "\n" + "	Emergency Contact: " + buildEmergencyContact(emergencyName, emergencyNum) + " \n ";
	}
}