package isp.lab4.exercise3;


import org.junit.Test;

import static org.junit.Assert.*;

public class ControlerTest {
    @Test
    public void TestConstructorControler() {
        //when
        TemperatureSensor temperatureSensor = new TemperatureSensor(60, "Bucharest");
        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = new Controler(temperatureSensor, fireAlarm);

        //then
        assertEquals(fireAlarm, controler.getFireAlarm());
        assertEquals(temperatureSensor, controler.getTemperatureSensor());

    }

    @Test
    public void TestControlStep() {
        //when
        TemperatureSensor temperatureSensor = new TemperatureSensor(67, "Bucharest");

        FireAlarm fireAlarm = new FireAlarm();

        Controler controler = new Controler(temperatureSensor, fireAlarm);
        controler.ControlStep();

        //then
        assertEquals("The fireAlarm should set: true ", true, fireAlarm.isActive());
    }

}

