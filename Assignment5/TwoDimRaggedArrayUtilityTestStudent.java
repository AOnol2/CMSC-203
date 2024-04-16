/*
 * Class: CMSC203 
 * Instructor: Professor Ginberg
 * Description: (Create a utility class that manipulates a two-dimensional ragged array of doubles.)
 * Due: 04/15/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Ata Onol
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

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
    void testGetTotal() {
        double expectedTotal = TwoDimRaggedArrayUtility.getTotal(array);
        double actualTotal = 0;
        for (double[] row : array) {
            for (double value : row) {
                actualTotal += value;
            }
        }
        assertEquals(expectedTotal, actualTotal, "getTotal does not calculate correctly");
    }

    @Test
    void testGetAverage() {
        double total = TwoDimRaggedArrayUtility.getTotal(array);
        int numberOfElements = 0;
        for (double[] row : array) {
            numberOfElements += row.length;
        }
        double expectedAverage = total / numberOfElements;
        double actualAverage = TwoDimRaggedArrayUtility.getAverage(array);
        assertEquals(expectedAverage, actualAverage, "getAverage does not calculate correctly");
    }

    @Test
    void testGetRowTotal() {
        for (int i = 0; i < array.length; i++) {
            double expectedRowTotal = 0;
            for (double value : array[i]) {
                expectedRowTotal += value;
            }
            double actualRowTotal = TwoDimRaggedArrayUtility.getRowTotal(array, i);
            assertEquals(expectedRowTotal, actualRowTotal, "getRowTotal does not calculate correctly for row " + i);
        }
    }

}
