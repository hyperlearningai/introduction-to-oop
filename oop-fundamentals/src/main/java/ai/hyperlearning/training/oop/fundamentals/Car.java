package ai.hyperlearning.training.oop.fundamentals;

/**
 * Car Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Car extends Vehicle {

    private String colour;
    private int numberOfDoors = 4;

    // Default Constructor
    public Car() {

    }

    // Non-Default Constructor


    public Car(String registrationNumber, String make, String model, String yearManufactured, String colour, int numberOfDoors) {
        super(registrationNumber, make, model, yearManufactured);
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and Setters Methods
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Other Methods
    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }

}
