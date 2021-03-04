package isp.lab4.exercise6;

/**
 * Base class.
 */
public class Employee {
    private String firstName;

    private String lastName;

    /**
     * This overloaded constructor set first and the last name
     *
     * @param firstName represent the first name of employee
     * @param lastName  represent the last name of employee
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * This method get the first name and will be returned
     *
     * @return the first name of employee
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method get the last name and will be returned
     *
     * @return the last name of employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method return payment amount
     *
     * @return 0.0
     */
    public double getPaymentAmount() {
        return 0.0;
    }
}
