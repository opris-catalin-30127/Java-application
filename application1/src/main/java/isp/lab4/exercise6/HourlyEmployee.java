package isp.lab4.exercise6;

public class HourlyEmployee extends Employee {
    private double wage;

    private double hours;

    /**
     * This overloaded constructor should set name , wage and hours at work
     *
     * @param firstName is the first name of employee
     * @param lastName  is the last name of employee
     * @param wage      is the hourly wage
     * @param hours     is the hours per day
     */
    public HourlyEmployee(String firstName, String lastName, double wage, double hours) {
        super(firstName, lastName);
        this.wage = wage;
        this.hours = hours;
    }

    public HourlyEmployee(Employee employee, double wage, double hours) {
        super(employee.getFirstName(), employee.getLastName());
        this.wage = wage;
        this.hours = hours;

    }

    /**
     * This method should get the wage and will be returned
     *
     * @return the hourly wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * This method should get the hours and will be returned
     *
     * @return the hours per day
     */
    public double getHours() {
        return hours;
    }

    /**
     * This method should calculate the wage per month
     *
     * @return the wage per month
     */
    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double wageMonth = wage * hours * 7 * 4;
        return wageMonth;
    }

}
