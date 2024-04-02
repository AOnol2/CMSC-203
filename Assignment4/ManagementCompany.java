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

public class ManagementCompany{
	final int MAX_PROPERTY = 5;
	final int MGMT_WIDTH = 10;
	final int MGMT_DEPTH = 10;
	
	private Property[] properties;
	private String name;
	private String taxID;
	private double mgmFee;
	private Plot plot;
	
	/**
	 * Default, no-arg constructor
	 */
	public ManagementCompany()
	{
		mgmFee = 0;
		name = "";
		taxID = "";
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Constructor that takes the company name, taxID, and management fee as parameters
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 */
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Constructor that takes the company name, taxID, management fee, x position of the plot,
	 * y position of the plot, width of the plot, and the depth of the plot as parameters
	 * 
	 * @param name
	 * @param taxID
	 * @param mgmFee
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Constructor that copies the values of another given company
	 * @param otherCompany
	 */
	public ManagementCompany(ManagementCompany otherCompany)
	{
		name = otherCompany.name;
		taxID = otherCompany.taxID;
		mgmFee = otherCompany.mgmFee;
		plot = otherCompany.plot;
		properties = otherCompany.properties;
	}
	
	/**
	 * Adds a property to the properties array, given the property's name, city, rent, and owner
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return -1 if the properties array is full, -2 if the property is null, -3 if the property isnt encompassed in the company plot,
	 *         -4 if the property overlaps with an existing property in the array, or the index where the property was added
	 */
	public int addProperty(String name, String city, double rent, String owner)
	{
		Property property;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			if(i == properties.length-1)
			{
				return -1;
			}
		}
		
		try
		{
			property = new Property(name, city, rent, owner);
		}
		catch (Exception e)
		{
			return -2;
		}
		
		property = new Property(name, city, rent, owner);
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		for(Property tempProperty : properties)
		{
			if(tempProperty != null)
			{
				if(tempProperty.getPlot().overlaps(property.getPlot()))
				{
					return -4;
				}
			}
		}
		int counter;
		for(counter = 0; counter < properties.length; counter++)
		{
			if(properties[counter] == null)
			{
				properties[counter] = property;
				break;
			}
		}
		return counter;
	}
	
	/**
	 * Adds a property to the properties array given a property object
	 * @param property
	 * @return -1 if the properties array is full, -2 if the property is null, -3 if the property isnt encompassed in the company plot,
	 *         -4 if the property overlaps with an existing property in the array, or the index where the property was added
	 */
	public int addProperty(Property property)
	{
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			if(i == properties.length-1)
			{
				return -1;
			}
		}
	
		if(property == null)
		{
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		
		for(Property tempProperty : properties)
		{
			if(tempProperty != null)
			{
				if(tempProperty.getPlot().overlaps(property.getPlot()))
				{
					return -4;
				}
			}
		}
		int counter;
		for(counter = 0; counter < properties.length; counter++)
		{
			if(properties[counter] == null)
			{
				properties[counter] = property;
				break;
			}
		}
		return counter;
	}
	
	/**
	 * Adds a property to the properties array, given the property's name, city, rent, owner,
	 * x position of the plot, y position of the plot, width of the plot, and depth of the plot
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return -1 if the properties array is full, -2 if the property is null, -3 if the property isnt encompassed in the company plot,
	 *         -4 if the property overlaps with an existing property in the array, or the index where the property was added
	 */
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		Property property;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				break;
			}
			if(i == properties.length-1)
			{
				return -1;
			}
		}
		
		try
		{
			property = new Property(name, city, rent, owner, x, y, width, depth);
		}
		catch (Exception e)
		{
			return -2;
		}
		
		property = new Property(name, city, rent, owner, x, y, width, depth);
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		for(Property tempProperty : properties)
		{
			if(tempProperty != null)
			{
				if(tempProperty.getPlot().overlaps(property.getPlot()))
				{
					return -4;
				}
			}
		}
		int counter;
		for(counter = 0; counter < properties.length; counter++)
		{
			if(properties[counter] == null)
			{
				properties[counter] = property;
				break;
			}
		}
		return counter;
	}
	
	/**
	 * Returns the property object with the highest rent
	 * @return property with the highest rent
	 */
	public Property getHighestRentProperty()
	{
		Property highest = new Property(properties[0]);
		for(int i = 1; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				return highest;
			}
			if(properties[i].getRentAmount() > highest.getRentAmount())
			{
				highest = new Property(properties[i]);
			}
		}
		return highest;
	}

	/**
	 * Returns the name of the company
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Retuns the taxID of the company
	 * @return taxID
	 */
	public String getTaxID()
	{
		return taxID;
	}

	/**
	 * Returns the management fee percentage of the company
	 * @return mgmFee
	 */
	public double getMgmFeePer()
	{
		return mgmFee;
	}

	/**
	 * Returns the plot of the company
	 * @return plot
	 */
	public Plot getPlot()
	{
		return plot;
	}
	
	/**
	 * Returns the properties of the company
	 * @return properties
	 */
	public Property[] getProperties()
	{
		return properties;
	}
	
	/**
	 * Returns the number of properties the company owns
	 * @return number of properties in the properties array
	 */
	public int getPropertiesCount()
	{
		int count = 0;
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				return count;
			}
			count++;
		}
		return count;
	}
	
	/**
	 * Checks to see if the management fee of the company is valid
	 * @return true if the management fee is greater than 0 and less than 100, false if not
	 */
	public boolean isManagementFeeValid()
	{
		if(mgmFee < 0.0 || mgmFee > 100.0)
		{
			return false;
		}
		return true;
	}
	
	/**
	 * Checks to see if the properties array is full
	 * @return true if the array is full, false if not
	 */
	public boolean isPropertiesFull()
	{
		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Removes the last property of the properties array
	 */
	public void removeLastProperty()
	{
		for(int i = 1; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				properties[i-1] = null;
				break;
			}
			if(i == properties.length)
			{
				properties[i-1] = null;
			}
		}
	}
	
	/**
	 * Returns the total rent of the company
	 * @return total rent
	 */
	public double getTotalRent()
	{
		double total = 0.0;
		for(Property property : properties)
		{
			if(property != null)
			{
				total += property.getRentAmount();
			}
		}
		return total;
	}
	
	/**
	 * Returns the information about the company and its properties as a string
	 * @return attributes of the company
	 */
	public String toString()
	{
	    String str = "";
	    for (int i = 0; i < MAX_PROPERTY; i++)
	    {
	      if (properties[i] != null)
	      {
	    	  str += properties[i] + "\n";
	      }
	    }
	    return "List of the properties for " + name + ", taxID: " + taxID
	        + "\n______________________________________________________\n"
	        + str +  "______________________________________________________\n\n"
	        + " total management Fee: " + (getTotalRent() * mgmFee / 100);
	  }
}