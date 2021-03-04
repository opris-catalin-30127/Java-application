package isp.lab4.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HouseTest {
    @Test
    public void TestGetControler() {
        //when
        FireAlarm fireAlarm = new FireAlarm();
        TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];

        temperatureSensors[0] = new TemperatureSensor(51, "Atena");
        temperatureSensors[1] = new TemperatureSensor(75, "Roma");
        temperatureSensors[2] = new TemperatureSensor(50, "Londra");

        Controler controler = new Controler(temperatureSensors, fireAlarm);

        House house = new House(controler);

        //then
        assertArrayEquals(temperatureSensors, house.getControler().getTemperatureSensors());
        assertEquals(fireAlarm, house.getControler().getFireAlarm());

    }

}
