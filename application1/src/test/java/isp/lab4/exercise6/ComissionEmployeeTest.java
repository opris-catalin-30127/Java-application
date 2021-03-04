package isp.lab4.exercise6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComissionEmployeeTest {
    @Test
    public void TestConstructor() {
        //when
        ComissionEmployee comissionEmployee = new ComissionEmployee("Cristea", "Alex", 3000, 1.9);

        //then
        assertEquals("The gross sales should be : 3000.0", 3000.0, comissionEmployee.getGrossSales(), 0);
        assertEquals("The comission sales should be : 1.9", 1.9, comissionEmployee.getComissionSales(), 0);

    }

    @Test
    public void TestGetPaymentAmonut() {
        //when
        ComissionEmployee comissionEmployee = new ComissionEmployee("Cristea", "Alex", 3000, 1.9);

        //then
        assertEquals("The payment amount should be : 2943.0", 2943.0, comissionEmployee.getPaymentAmount(), 0);
    }
}
