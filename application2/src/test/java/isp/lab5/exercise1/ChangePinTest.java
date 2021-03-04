package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangePinTest {
    @Test
    public void TestOveloadedConstructor() {
        //when
        ChangePin changePin = new ChangePin("1234", "4321");

        changePin.setOldPin("5678");
        changePin.setNewPin("8765");

        //then
        assertEquals("The old pin should be '5678'", "5678", changePin.getOldPin());
        assertEquals("The new pin should be '8765'", "8765", changePin.getNewPin());
    }
}
