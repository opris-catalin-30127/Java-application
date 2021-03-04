package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HourlyEmployeeTest {
    @Test
    public void TestConstructor() {
        //when
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Prian", "Andrei", 9, 8);

        //then
        assertEquals("The wage should be: 9.0", 9.0, hourlyEmployee.getWage(), 0);
        assertEquals("The hours should be: 8.0", 8.0, hourlyEmployee.getHours(), 0);

    }

    @Test
    public void TestGetPaymentAmonut() {
        //when
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Prian", "Andrei", 9, 8);

        //then
        assertEquals("The payment amount should be : 2016.0", 2016.0, hourlyEmployee.getPaymentAmount(), 0);
    }
}
