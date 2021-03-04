package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ATMTest {
    @Test
    public void TestInsertCard() {
        //when
        ATM atm = new ATM();

        Card card = new Card("12345", "1234");


        //then
        assertEquals("ada", true, atm.insertCard(card, "1234"));


    }

}
