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

public class Alcohol extends Beverage {

    private final boolean isWeekend;

    public Alcohol(String name, Size size, boolean isWeekend){
        super(name, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        // factor 
        if(isWeekend){
            price += 0.6;
        }
        return price;
    }

    @Override
    public String toString(){
        return super.toString() + ", weekend fee: " + isWeekend + ", cost: " + calcPrice();
    }

    @Override
    public boolean equals(Object other){
        // check beverage equals() first
        if(!super.equals(other)){
            return false;
        }
        // check alcohol
        if(other instanceof Alcohol){
            Alcohol alcohol = (Alcohol) other;
            // check the other alcohol
            return isWeekend == alcohol.isWeekend;
        }
        return false;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}