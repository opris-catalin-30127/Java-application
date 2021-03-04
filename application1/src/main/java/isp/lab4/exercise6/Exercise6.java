package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String[] args) {

        System.out.println("i.\n");
        SalariedEmployee salariedEmployee = new SalariedEmployee("Pop", "Mihai", 800);
        System.out.println("Salaried employee: " + salariedEmployee.getPaymentAmount());

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Prian", "Andrei", 9, 8);
        System.out.println("Salaried employee calculate per hour: " + hourlyEmployee.getPaymentAmount());

        ComissionEmployee comissionEmployee = new ComissionEmployee("Cristea", "Alex", 3000, 1.9);
        System.out.println("Salaried employee calculate with comission: " + comissionEmployee.getPaymentAmount());

        System.out.println("\nii.\n");
        Employee[] employees = new Employee[6];

        employees[0] = new Employee("Pop", "Mihai");
        employees[1] = new Employee("Prian", "Andrew");
        employees[2] = new Employee("Enache", "Mihai");
        employees[3] = new Employee("Antal", "Andrew");
        employees[4] = new Employee("Lobont", "Alex");
        employees[5] = new Employee("Cristea", "Alex");

        SalariedEmployee salariedEmployee1 = new SalariedEmployee(employees[0], 800);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee(employees[1], 900);
        System.out.println(salariedEmployee1.getFirstName() + " " + salariedEmployee1.getLastName() + ": " + salariedEmployee1.getPaymentAmount());
        System.out.println(salariedEmployee2.getFirstName() + " " + salariedEmployee2.getLastName() + ": " + salariedEmployee2.getPaymentAmount());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(employees[2], 7, 8);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(employees[3], 9, 8);
        System.out.println(hourlyEmployee1.getFirstName() + " " + hourlyEmployee1.getLastName() + ": " + hourlyEmployee1.getPaymentAmount());
        System.out.println(hourlyEmployee2.getFirstName() + " " + hourlyEmployee2.getLastName() + ": " + hourlyEmployee2.getPaymentAmount());


        ComissionEmployee comissionEmployee1 = new ComissionEmployee(employees[4], 3200, 1.9);
        ComissionEmployee comissionEmployee2 = new ComissionEmployee(employees[5], 4000, 1.8);
        System.out.println(comissionEmployee1.getFirstName() + " " + comissionEmployee1.getLastName() + ": " + comissionEmployee1.getPaymentAmount());
        System.out.println(comissionEmployee2.getFirstName() + " " + comissionEmployee2.getLastName() + ": " + comissionEmployee2.getPaymentAmount());

    }
}
