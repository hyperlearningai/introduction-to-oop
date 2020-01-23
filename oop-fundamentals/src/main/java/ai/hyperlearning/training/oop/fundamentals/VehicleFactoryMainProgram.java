package ai.hyperlearning.training.oop.fundamentals;

import java.time.Month;

/**
 * Factory Main Program that creates vehicle instances
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class VehicleFactoryMainProgram {

    public static void main(String[] args) {

        /**************************************************************************************************************
         * (1) CLASSES AND OBJECTS
         *************************************************************************************************************/

        // 1.1. Create an instance of a vehicle using the default constructor
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setRegistrationNumber("A123 BCD");
        vehicle1.setMake("Honda");
        vehicle1.setModel("Civic");
        vehicle1.setYearManufactured("2000");
        // System.out.println( vehicle1.toString() );

        // 1.2. Create an instance of a vehicle using a non-default constructor
        Vehicle vehicle2 = new Vehicle(
                "B123 CDE", "Yamaha", "R1", "2009");
        // System.out.println( vehicle2.toString() );

        /**************************************************************************************************************
         * (2) INHERITANCE
         *************************************************************************************************************/

        // 2.1. Create an instance of a car using the default constructor
        Car car1 = new Car();
        car1.setRegistrationNumber("C123 DEF");
        car1.setMake("Ford");
        car1.setModel("Mustang");
        car1.setYearManufactured("2010");
        car1.setColour("Yellow");
        car1.setNumberOfDoors(4);
        // System.out.println( car1.toString() );

        // 2.2. Create an instance of a car using a non-default constructor
        Car car2 = new Car(
                "D123 EFG", "Toyota", "Corolla", "2003",
                "Black", 2);
        // System.out.println( car2.toString() );

        // Exercise 1
        Car car3 = new Car("Z987 YXW", "Ferrari", "250 GT", "1980",
                "Red", 2);
        Person person1 = new Person("123", "Joe", "Bloggs");
        car3.setIndividualOwner(person1);
        // System.out.println( car3.toString() );

        /**************************************************************************************************************
         * (3) POLYMORPHISM
         *************************************************************************************************************/

        // 3.1. Calculate DOB using polymorphism and one of the overloaded methods
        Person person2 = new Person("123", "Alice", "Christmas");
        int age1 = person2.calculateAge("2000-01-02");
        int age2 = person2.calculateAge(31, Month.AUGUST, 1998);
        // System.out.println( "Age: " + age1 );

        // Exercise 2
        Car car4 = new Car("X654 XWV", "Porsche", "911", "1985",
                "Black", 2);
        Person person3 = new Person("123", "Joe", "Bloggs");
        Organisation methods = new Organisation("METH001", "Methods", "1995");
        car4.transferOwnership(person3);
        System.out.println( car4.toString() );
        car4.transferOwnership(methods);
        System.out.println( car4.toString() );

    }

}
