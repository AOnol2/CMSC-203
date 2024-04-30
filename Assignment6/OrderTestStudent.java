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

import static org.junit.jupiter.api.Assertions.*;

public class OrderTestStudent {
	Order order_1, order_2, order_3;

	@BeforeEach
	public void setUp() throws Exception {
		order_1 = new Order(9, Day.MONDAY, new Customer("Max", 16));
		order_2 = new Order(14, Day.WEDNESDAY, new Customer("Emiliy", 13));
		order_3 = new Order(20, Day.SATURDAY, new Customer("Josh", 27));
	}

	@AfterEach
	public void tearDown() throws Exception {
		order_1 = order_2 = order_3 = null;
	}

	@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("Cappecino", Size.SMALL, false, true);
		Alcohol al = new Alcohol("Vodka", Size.MEDIUM, false);
		Smoothie sm1 = new Smoothie("Banana", Size.LARGE, 1, true);
		Smoothie sm2 = new Smoothie("Strawberry", Size.LARGE, 1, false);

		order_1.addNewBeverage("Cappecino", Size.SMALL, false, true);
		order_1.addNewBeverage("Vodka", Size.MEDIUM);
		order_1.addNewBeverage("Banana", Size.LARGE, 1, true);
		assertTrue(order_1.getBeverage(0).equals(cf));
		assertTrue(order_1.getBeverage(1).equals(al));
		assertTrue(order_1.getBeverage(2).equals(sm1));
		assertFalse(order_1.getBeverage(2).equals(sm2));
	}

	@Test
	public void testCalcOrderTotal() {
		Coffee cf = new Coffee("Cappecino", Size.SMALL, false, true); //2.5
		Alcohol al = new Alcohol("Vodka", Size.MEDIUM, false); //2.5
		Smoothie sm1 = new Smoothie("Banana", Size.LARGE, 1, true); // 4.5

		order_2.addNewBeverage("Cappecino", Size.SMALL, false, true);
		order_2.addNewBeverage("Vodka", Size.MEDIUM);
		order_2.addNewBeverage("Banana", Size.LARGE, 1, true);

		double sum = cf.calcPrice() + al.calcPrice() + sm1.calcPrice();

		assertEquals(sum, order_2.calcOrderTotal(), .01);
		assertEquals(9.5, order_2.calcOrderTotal(), .01);

		order_3.addNewBeverage("Vodka", Size.MEDIUM); // 3.1 on weekends

		assertEquals(3.1, order_3.calcOrderTotal(), .01);

	}

}