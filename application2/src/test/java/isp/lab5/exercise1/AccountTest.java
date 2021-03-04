package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void TestOverloadedConstructor() {
        //when
        Card card = new Card("12345", "1234");
        Account account = new Account("Andrew", 12, card);

        account.setBalance(32);
        account.setOwner("Kevin");
        account.setCard(card);

        //then
        assertEquals("The balance should be '32.0'", 32.0, account.getBalance(), 0);
        assertEquals("The owner should be 'Kevin'", "Kevin", account.getOwner());
        assertEquals(card, account.getCard());

    }
}
