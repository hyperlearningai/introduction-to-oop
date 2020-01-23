package ai.hyperlearning.training.oop.fundamentals;

/**
 * Organisation Class
 *
 * @author jillur.quddus
 * @version 0.0.1
 * @since 0.0.1
 */

public class Organisation {

    private String companiesHouseNumber;
    private String name;
    private String yearFounded;

    // Default Constructor
    public Organisation() {

    }

    // Non-Default Constructor
    public Organisation(String companiesHouseNumber, String name, String yearFounded) {
        this.companiesHouseNumber = companiesHouseNumber;
        this.name = name;
        this.yearFounded = yearFounded;
    }

    // Getter and Setter Methods
    public String getCompaniesHouseNumber() {
        return companiesHouseNumber;
    }

    public void setCompaniesHouseNumber(String companiesHouseNumber) {
        this.companiesHouseNumber = companiesHouseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(String yearFounded) {
        this.yearFounded = yearFounded;
    }

    // Other Methods
    @Override
    public String toString() {
        return "Organisation{" +
                "companiesHouseNumber='" + companiesHouseNumber + '\'' +
                ", name='" + name + '\'' +
                ", yearFounded='" + yearFounded + '\'' +
                '}';
    }

}
