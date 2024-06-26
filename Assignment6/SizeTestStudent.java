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
import org.junit.Test;

public class SizeTestStudent {
	
	 @Test
	    public void testEnumValuesExist() {
	        
	        assertNotNull("Enum constant LARGE should exist", Size.valueOf("LARGE"));
	        assertNotNull("Enum constant MEDIUM should exist", Size.valueOf("MEDIUM"));
	        assertNotNull("Enum constant SMALL should exist", Size.valueOf("SMALL"));
	    }

	    @Test
	    public void testEnumValuesCount() {
	        
	        assertEquals("There should be exactly three enum constants for Size", 3, Size.values().length);
	    }

	    @Test
	    public void testEnumOrder() {
	       
	        assertEquals("LARGE should be the first enum constant", Size.LARGE, Size.values()[0]);
	        assertEquals("MEDIUM should be the second enum constant", Size.MEDIUM, Size.values()[1]);
	        assertEquals("SMALL should be the third enum constant", Size.SMALL, Size.values()[2]);
	    }

}