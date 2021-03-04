package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalariedEmployeeTest {
    @Test
    public void TestConstructor() {
        //when
        SalariedEmployee salariedEmployee = new SalariedEmployee("Pop", "Mihai", 800);

        //then
        assertEquals("The weekly salary should be: 800.0", 800.0, salariedEmployee.getWeeklySalary(), 0);

    }

    @Test
    public void TestGetPaymentAmonut() {
        //when
        SalariedEmployee salariedEmployee = new SalariedEmployee("Pop", "Mihai", 800);

        //then
        assertEquals("The payment amount should be : 5600.0", 5600.0, salariedEmployee.getPaymentAmount(), 0);
    }
}
