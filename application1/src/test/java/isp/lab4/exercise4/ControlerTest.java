package isp.lab4.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControlerTest {
    @Test
    public void TestConstructorControler() {
        //when
        FireAlarm fireAlarm = new FireAlarm();
        TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];

        temperatureSensors[0] = new TemperatureSensor(51, "Atena");
        temperatureSensors[1] = new TemperatureSensor(75, "Roma");
        temperatureSensors[2] = new TemperatureSensor(50, "Londra");


        Controler controler = new Controler(temperatureSensors, fireAlarm);

        //then
        assertEquals(fireAlarm, controler.getFireAlarm());
        assertArrayEquals(temperatureSensors, controler.getTemperatureSensors());

    }

    @Test
    public void TestControlStep() {
        //when
        TemperatureSensor temperatureSensors[] = new TemperatureSensor[3];

        temperatureSensors[0] = new TemperatureSensor(51, "Atena");
        temperatureSensors[1] = new TemperatureSensor(75, "Roma");
        temperatureSensors[2] = new TemperatureSensor(50, "Londra");

        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = new Controler(temperatureSensors, fireAlarm);
        controler.ControlStep();

        //then
        assertEquals("The fireAlarm should set: true ", false, fireAlarm.isActive());
    }

}


