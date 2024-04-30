import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlcoholTestStudent {

	Alcohol alc_1;
	Alcohol alc_2;

	@BeforeEach
	public void setUp() throws Exception {
		alc_1 = new Alcohol("beer", Size.SMALL, true);
		alc_2 = new Alcohol("vodka", Size.LARGE, false);
	}

	@AfterEach
	public void tearDown() throws Exception {
		alc_1 = alc_2 = null;
	}

	@Test
	public void testPrice() {
		assertEquals(3.5, alc_1.calcPrice(), .01);
		assertEquals(4.6, alc_2.calcPrice(), .01);
	}

	@Test
	public void testEquals() {
		assertEquals(alc_1, alc_1);
	}

}