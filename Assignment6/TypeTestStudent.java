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

public class TypeTestStudent
{
	
	 @Test
	    public void testEnumValuesExist() {
	       
	        assertNotNull("Enum constant ALCOHOL should exist", Type.valueOf("ALCOHOL"));
	        assertNotNull("Enum constant COFFEE should exist", Type.valueOf("COFFEE"));
	        assertNotNull("Enum constant SMOOTHIE should exist", Type.valueOf("SMOOTHIE"));
	    }

	    @Test
	    public void testEnumValuesCount() {
	        
	        assertEquals("There should be exactly three enum constants for Type", 3, Type.values().length);
	    }

	    @Test
	    public void testEnumOrder() {
	        
	        assertEquals("ALCOHOL should be first enum constant", Type.ALCOHOL, Type.values()[0]);
	        assertEquals("COFFEE should be second enum constant", Type.COFFEE, Type.values()[1]);
	        assertEquals("SMOOTHIE should be third enum constant", Type.SMOOTHIE, Type.values()[2]);
	    }

}