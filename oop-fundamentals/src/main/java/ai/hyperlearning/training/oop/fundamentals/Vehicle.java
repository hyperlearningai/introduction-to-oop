package ai.hyperlearning.training.oop.fundamentals;

/**
 * Vehicle Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Vehicle {

    private String registrationNumber;
    private String make;
    private String model;
    private String yearManufactured;
    private Person individualOwner;
    private Organisation organisationOwner;

    // Default Constructor
    public Vehicle() {

    }

    // Non-Default Constructor
    public Vehicle(String registrationNumber, String make, String model, String yearManufactured) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.yearManufactured = yearManufactured;
    }

    // Getter and Setters Methods
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(String yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public Person getIndividualOwner() {
        return individualOwner;
    }

    public void setIndividualOwner(Person individualOwner) {
        this.individualOwner = individualOwner;
    }

    public Organisation getOrganisationOwner() {
        return organisationOwner;
    }

    public void setOrganisationOwner(Organisation organisationOwner) {
        this.organisationOwner = organisationOwner;
    }

    // Other Methods
    @Override
    public String toString() {
        return "Vehicle{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", yearManufactured='" + yearManufactured + '\'' +
                ", individualOwner=" + individualOwner +
                ", organisationOwner=" + organisationOwner +
                '}';
    }

    public void transferOwnership(Person person) {
        this.individualOwner = person;
        this.organisationOwner = null;
    }

    public void transferOwnership(Organisation organisation) {
        this.organisationOwner = organisation;
        this.individualOwner = null;
    }

}
