package ai.hyperlearning.training.oop.fundamentals;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * Person Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Person {

    private String nhsNumber;
    private String firstName;
    private String lastName;

    // Default Constructor
    public Person() {

    }

    // Non-Default Constructor
    public Person(String nhsNumber, String firstName, String lastName) {
        this.nhsNumber = nhsNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter and Setters Methods
    public String getNhsNumber() {
        return nhsNumber;
    }

    public void setNhsNumber(String nhsNumber) {
        this.nhsNumber = nhsNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Other Methods
    @Override
    public String toString() {
        return "Person{" +
                "nhsNumber='" + nhsNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    /**
     * Calculate age given day, month and year
     * @param day
     * @param month
     * @param year
     * @return
     */

    public int calculateAge(int day, Month month, int year) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        Period age = Period.between(birthday, today);
        return age.getYears();
    }

    /**
     * Calculate age given a date of birth string
     * @param dob
     * @return
     */

    public int calculateAge(String dob) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(dob);
        Period age = Period.between(birthday, today);
        return age.getYears();
    }

}
