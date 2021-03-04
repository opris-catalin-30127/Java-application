package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    @Test
    public void TestOveloadedConstructor() {
        //when
        Card card = new Card("123456", "1234");

        card.setCardId("654321");
        card.setPin("4321");

        //then
        assertEquals("The card id should be '654321'", "654321", card.getCardId());
        assertEquals("The pin shoul be '4321'", "4321", card.getPin());
    }
}
