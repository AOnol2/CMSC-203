import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HolidayBonusTestStudent {

    private double[][] array = {
        {2536.54, 45665.05, 21543.66, 75324.57, 33884.48, 65982.39},
        {28762.21, 35762.42, 19546.63},
        {48962.34, 28552.95, 23863.66, 54992.97},
        {22567.63, 36237.64, 42862.95, 54384.86, 37944.37}
    };
    
    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void testCalculateHolidayBonus() {
        // The actual bonuses will depend on your implementation of the calculateHolidayBonus method
        double[] expectedHolidayBonus = {5000.00, 2000.00, 2000.00, 1000.00}; // Example expected results
        double[] actualHolidayBonus = HolidayBonus.calculateHolidayBonus(array);
        
        assertArrayEquals(expectedHolidayBonus, actualHolidayBonus, "The holiday bonuses calculated did not match the expected results.");
    }
    
    @Test
    void testCalculateTotalHolidayBonus() {
        // The actual total bonus will depend on your implementation of the calculateTotalHolidayBonus method
        double expectedTotalHolidayBonus = 10000.00; // Example expected result
        double actualTotalHolidayBonus = HolidayBonus.calculateTotalHolidayBonus(array);
        
        assertEquals(expectedTotalHolidayBonus, actualTotalHolidayBonus, "The total holiday bonus calculated did not match the expected result.");
    }
}