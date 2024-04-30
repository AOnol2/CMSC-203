/*
 * Class: CMSC203 CRN 32689
 * Instructor: Dr. Grinberg
 * Description: Create and process orders of different types of beverages
 * Platform/compiler: Windows/Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ata Onol
*/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {
	 
	
		Customer customer;

	    @Before
	    public void setUp() {
	        customer = new Customer("Max", 35);
	    }

	    @Test
	    public void testCustomerDetails() {
	        assertEquals("Name should match", "Max", customer.getName());
	        assertEquals("Age should match", 35, customer.getAge());
	    }
	
	
}