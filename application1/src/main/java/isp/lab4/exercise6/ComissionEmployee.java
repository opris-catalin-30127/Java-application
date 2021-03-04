package isp.lab4.exercise6;

public class ComissionEmployee extends Employee {
    private double grossSales;

    private double comissionSales;

    /**
     * This overloaded constructor should set name , gross sales , and commission sales
     *
     * @param firstName      is the first name of employee
     * @param lastName       is the last name of employee
     * @param grossSales     is the gross sales
     * @param comissionSales is the commission sales
     */
    public ComissionEmployee(String firstName, String lastName, double grossSales, double comissionSales) {
        super(firstName, lastName);
        this.grossSales = grossSales;
        this.comissionSales = comissionSales;
    }

    public ComissionEmployee(Employee employee, double grossSales, double comissionSales) {
        super(employee.getFirstName(), employee.getLastName());
        this.grossSales = grossSales;
        this.comissionSales = comissionSales;
    }

    /**
     * This method should get the commission sales and will be returned
     *
     * @return the commission sales
     */
    public double getComissionSales() {
        return comissionSales;
    }

    /**
     * This method should get the gross sales and will be returned
     *
     * @return the gross sales
     */
    public double getGrossSales() {
        return grossSales;
    }

    /**
     * This method should calculate the net sales from gross and commission sales
     *
     * @return the net sales
     */
    @Override
    public double getPaymentAmount() {
        super.getPaymentAmount();
        double netSales = grossSales - (comissionSales / 100) * grossSales;
        return netSales;
    }
}
