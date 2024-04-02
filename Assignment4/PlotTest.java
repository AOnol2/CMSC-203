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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTest {
	private Plot plot1, plot2, plot3;
	
	@BeforeEach
	void setUp() throws Exception {
		plot1 = new Plot(1, 1, 4, 4);
		plot2 = new Plot(4, 1, 7, 4);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		plot1 = plot2 = plot3 = null;
	}
	
	@Test
	void testOverlaps() {
		assertTrue(plot1.overlaps(plot2));
	}

	@Test
	void testToString() {
		assertEquals("1,2,5,5",plot2.toString());
	}

}