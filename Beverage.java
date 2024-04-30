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

public abstract class Beverage {

    private final String BevName;
    private final Type BevType;
    private final Size BevSize;
    private final double basePrice = 2.0;
    private final double sizePrice = 0.5;

    public Beverage(String BevName, Type BevType, Size BevSize) {
        this.BevName = BevName;
        this.BevType = BevType;
        this.BevSize = BevSize;
    }

    public double addSizePrice(){
        // assumes size enum is ordered from smallest to biggest
        return basePrice + sizePrice * (BevSize.ordinal());
    }

    public abstract double calcPrice();

    @Override
    public String toString(){
        return BevName + "," + BevSize.name().toLowerCase();
    }

    @Override
    public boolean equals(Object other){
        // check if the object is a beverage
        if(other instanceof Beverage){
            Beverage otherBev = (Beverage) other;
            // check the other beverage's details
            return BevName.equals(otherBev.BevName) && BevType == otherBev.BevType && BevSize == otherBev.BevSize;
        }
        return false;
    }

    public String getBevName() {
        return BevName;
    }

    public Type getType() {
        return BevType;
    }

    public Size getSize() {
        return BevSize;
    }

    public double getBasePrice() {
        return basePrice;
    }
}