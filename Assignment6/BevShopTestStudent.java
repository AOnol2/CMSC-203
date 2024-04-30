import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BevShopTestStudent {

	BevShop shop;
	Order orderTwo;
	Order orderThree;

	@BeforeEach
	public void setUp() throws Exception {
		shop = new BevShop();

		Order orderOne = new Order(6, Day.TUESDAY, new Customer("Bruce", 28));
		orderOne.addNewBeverage("Cappecino", Size.SMALL, true, false);
		orderOne.addNewBeverage("Gin", Size.MEDIUM);
		orderOne.addNewBeverage("Banana", Size.LARGE, 1, true);

		shop.startNewOrder(6, Day.TUESDAY,"Bruce", 28);
		shop.processCoffeeOrder("Cappecino", Size.SMALL, true, false); // 2.5
		shop.processAlcoholOrder("Gin", Size.MEDIUM); // 2.5
		shop.processSmoothieOrder("Banana", Size.LARGE, 1, true); // 4.5

		orderTwo = new Order(14, Day.THURSDAY, new Customer("Rob", 21));
		orderTwo.addNewBeverage("Cappecino", Size.SMALL, true, true);
		orderTwo.addNewBeverage("Gin", Size.MEDIUM);

		shop.startNewOrder(14, Day.THURSDAY,"Rob", 21);
		shop.processCoffeeOrder("Cappecino", Size.SMALL, true, true); // 3.0
		shop.processAlcoholOrder("Gin", Size.MEDIUM); // 3.0

		orderThree = new Order(20, Day.SUNDAY, new Customer("Max", 49));
		orderThree.addNewBeverage("Gin", Size.LARGE);

		shop.startNewOrder(20, Day.SUNDAY,"Max", 49);
		shop.processAlcoholOrder("Gin", Size.LARGE);// 3.1 on weekends
	}

	@AfterEach
	public void tearDown() throws Exception {
		shop = null;
		orderTwo = orderThree = null;
	}

	@Test
	public void testTotalMonthlySale() {
		assertEquals(18.6, shop.totalMonthlySale());
	}

	@Test
	public void testMonthlyOrders() {
		assertEquals(3, shop.totalNumOfMonthlyOrders());
	}

	@Test
	public void testFindOrders() {
		int lastOrder = shop.getCurrentOrder().getOrderNumber();
		assertEquals(2, shop.findOrder(lastOrder));
	}

}