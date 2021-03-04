package isp.lab4.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureSensorTest {
    @Test
    public void TestDefaultConstructor() {
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        assertEquals("The location should be:null", null, temperatureSensor.getLocation());
        assertEquals("The value should be:0", 0, temperatureSensor.getValue());

    }

    @Test
    public void testOverloadedConstructor() {
        TemperatureSensor temperatureSendor = new TemperatureSensor(4, "Cluj-Napoca");

        assertEquals("The location should be:Cluj-Napoca", "Cluj-Napoca", temperatureSendor.getLocation());
        assertEquals("The value should be:4", 4, temperatureSendor.getValue());
    }

    @Test
    public void TestGetLocation() {
        //when
        TemperatureSensor temperatureSensor = new TemperatureSensor(14, "Atena");

        String result = temperatureSensor.getLocation();

        //then
        assertEquals("The location should be 'Atena'", "Atena", result);
    }

    @Test
    public void TestGetValue() {
        //when
        TemperatureSensor temperatureSensor = new TemperatureSensor(4, "Atena");
        int result = temperatureSensor.getValue();

        //then
        assertEquals("The value should be 4", 4, result);
    }

    @Test
    public void TestToString() {
        //when
        TemperatureSensor temperatureSensor = new TemperatureSensor(3, "Roma");

        String result = temperatureSensor.toString();

        //then
        assertEquals("Te method should return 'TemperatureSensor{" +
                " value=3 " +
                ",location=Roma " +
                "}", "TemperatureSensor{" +
                " value=3 " +
                ",location=Roma " +
                "}", result);
    }
}
