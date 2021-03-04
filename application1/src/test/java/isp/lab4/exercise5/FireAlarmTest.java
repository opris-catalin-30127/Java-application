package isp.lab4.exercise5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireAlarmTest {
    @Test
    public void TestFireSenzor() {
        //having
        FireAlarm fireAlarm = new FireAlarm();

        //when
        fireAlarm.FireSenzor(true);

        //then
        assertEquals("The active should be 'true'", true, fireAlarm.getFireSenzor());

    }

    @Test
    public void TestIsActive() {
        //having
        FireAlarm fireAlarm = new FireAlarm();

        //when
        fireAlarm.setActive(true);

        //then
        assertEquals("IsActive should be 'true'", true, fireAlarm.isActive());
    }

    @Test
    public void testSetActive() {
        FireAlarm fireAlarm = new FireAlarm();

        fireAlarm.setActive(true);
        assertEquals("Set active:true", true, fireAlarm.isActive());
    }

    @Test
    public void TestToString() {
        //when
        FireAlarm fireAlarm = new FireAlarm();

        fireAlarm.setActive(true);
        String result = fireAlarm.toString();

        //then
        assertEquals("The result should be 'FireAlarm{ active=true }'", "FireAlarm{ active=true }", result);
    }
}
