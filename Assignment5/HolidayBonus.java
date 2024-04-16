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

public class HolidayBonus {
	final static private double LOWEST_BONUS = 1000;
	final static private double OTHER_BONUS = 2000;
	final static private double HIGHEST_BONUS = 5000;
	
	public static double[] calculateHolidayBonus(double[][] data){
		/*
		 * Create bonus array based on number of rows in passed ragged array.
		 * One row represents one store, so a row can be used to hold a store's bonus
		 */
		double holidayBonus[] = new double[data.length];
		
		//Initialize all values of array to zero for use as accumulators
		for(int i = 0; i < holidayBonus.length; i++) {
			holidayBonus[i] = 0;
		}
		
		//Loop through the ragged array
		for(int row = 0; row < data.length; row++) {
			for(int col = 0; col < data[row].length; col++) {
				/*
				 * Per assignment description:
				 * "If a retail store didn't sell anything in a category, or if they have
				 * a negative sales amount, they are not eligible for a bonus in that category."
				 * Only calculate bonuses when the value of current array element is a non-negative,
				 * non-zero number
				 */
				if(data[row][col] > 0) {
					//If a store sold the most in one category, they get the highest bonus ($5000)
					if (data[row][col] == TwoDimRaggedArrayUtility.getHighestInColumn(data, col)) {
						holidayBonus[row] += HIGHEST_BONUS;
					}
					
					else if((data[row][col] != TwoDimRaggedArrayUtility.getHighestInColumn(data,col)) && 
							(data[row][col] != TwoDimRaggedArrayUtility.getLowestInColumn(data, col))) {
						holidayBonus[row] += OTHER_BONUS;
					}
					//If a store sold the least in one category, they get the lowest bonus($1000)
					else {
						holidayBonus[row] += LOWEST_BONUS;
					}
				}
			}
		}
		
		return holidayBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data) {
		//Accumulator
		double total = 0;
		//Create array with the amount earned in bonuses from each store
		double[] holidayBonus = calculateHolidayBonus(data);
		//Loop through bonus array, adding each value to accumulator
		for(int i = 0; i < holidayBonus.length; i++) {
			total += holidayBonus[i];
		}
		return total;
	}

	
}