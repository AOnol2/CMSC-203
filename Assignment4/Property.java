/*
 * Class: CMSC203 CRN 32689
 * Instructor: Dr. Grinberg
 * Description: (Write an application that lets the user create a management company and add the properties managed by the company to its list)
 * Due: 04/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/

public class Property{
	private String propertyName, city, owner;
	private double rentAmount;
	private Plot plot;
	
	/**
	 * Default, no-arg constructor
	 */
	public Property()
	{
		propertyName = "";
		city = "";
		owner = "";
		plot = new Plot();
	}
	
	/**
	 * Constructor that takes the property name, city, rent amount, and owner as parameters
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}
	
	/**
	 * Constructor that takes the property name, city, rent amount, owner, and plot as parameters
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param plot
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, Plot plot)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(plot);
	}
	
	/**
	 * Constructor that takes the property name, city, rent amount, owner,
	 * plot x position, plot y position, plot width, and plot depth
	 * 
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * Constructor that copies the values from another given property
	 * @param otherProperty
	 */
	public Property(Property otherProperty)
	{
		propertyName = otherProperty.getPropertyName();
		city = otherProperty.getCity();
		rentAmount = otherProperty.getRentAmount();
		owner = otherProperty.getOwner();
		if(otherProperty.getPlot() == null)
		{
			plot = new Plot();
		}
		else
		{
			plot = new Plot(otherProperty.getPlot());
		}
		
	}
	
	/**
	 * Returns the property name
	 * @return propertyName
	 */
	public String getPropertyName()
	{
		return propertyName;
	}
	
	/**
	 * Sets the property name
	 * @param propertyName
	 */
	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}
	
	/**
	 * Returns the city
	 * @return city
	 */
	public String getCity()
	{
		return city;
	}
	
	/**
	 * Sets the city
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Returns the owner
	 * @return owner
	 */
	public String getOwner()
	{
		return owner;
	}
	
	/**
	 * Sets the owner
	 * @param owner
	 */
	public void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	/**
	 * Returns the rent amount
	 * @return rentAmount
	 */
	public double getRentAmount()
	{
		return rentAmount;
	}
	
	/**
	 * Sets the rent amount
	 * @param rentAmount
	 */
	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}
	
	/**
	 * Returns the plot
	 * @return plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	
	/**
	 * Sets the plot
	 * @param plot
	 */
	public void setPlot(Plot plot)
	{
		this.plot = plot;
	}
	
	/**
	 * Returns the property information as a string
	 * @return String that consists of the property information
	 */
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
}