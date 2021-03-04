package isp.lab4.exercise6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void TestConstructor() {
        //when
        Employee employee = new Employee("Pop", "Kevin");

        //then
        assertEquals("The first name should be: 'Pop'", "Pop", employee.getFirstName());
        assertEquals("The last name should be: 'Kevin'", "Kevin", employee.getLastName());

    }

    @Test
    public void TestGetPaymentAmount() {
        //when
        Employee employee = new Employee("Pop", "Kevin");

        //then
        assertEquals("The payment amount should be : 0.0", 0.0, employee.getPaymentAmount(), 0);

    }

}
