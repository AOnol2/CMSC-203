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

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTestStudent {

	Coffee coffee_1;
	Coffee coffee_2;

	@BeforeEach
	public void setUp() throws Exception {
		coffee_1 = new Coffee("Frappecino", Size.SMALL, true, false);
		coffee_2 = new Coffee("Latte", Size.MEDIUM, true, true);
	}

	@AfterEach
	public void tearDown() throws Exception {
		coffee_1 = coffee_2 = null;
	}

	@Test
	public void testPrice() {
		assertEquals(2.5, coffee_1.calcPrice(), .01);
		assertEquals(3.5, coffee_2.calcPrice(), .01);
	}

	@Test
	public void testEquals() {
		assertEquals(coffee_1, coffee_1);
	}

}