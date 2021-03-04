package isp.lab4.exercise6;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    /**
     * This overloaded constructor should set name, and weekly salary
     *
     * @param firstName    is the first name of employee
     * @param lastName     is the last name of employee
     * @param weeklySalary represent the weekly salary
     */
    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(Employee employee, double weeklySalary) {
        super(employee.getFirstName(), employee.getLastName());
        this.weeklySalary = weeklySalary;
    }

    /**
     * This method should get the weekly salary and will be returned
     *
     * @return the weekly salary of employee
     */
    public double getWeeklySalary() {
        return weeklySalary;
    }

    /**
     * This method should calculate the salary per month
     *
     * @return the salary per month
     */
    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double salaryMonth = weeklySalary * 7;
        return salaryMonth;
    }

}
