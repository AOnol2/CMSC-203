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
public class Customer {

    private final String name;
    private final int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Customer(Customer other){
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}