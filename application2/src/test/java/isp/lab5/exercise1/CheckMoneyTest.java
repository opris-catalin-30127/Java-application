package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckMoneyTest {
    @Test
    public void TestExecute() {
        //when
        Card card = new Card("12345", "1234");

        Account account = new Account("Andrew", 12, card);

        CheckMoney checkMoney = new CheckMoney(account);


        //then
        assertEquals("The balance should be:'12.0'", "12.0", checkMoney.execute());
    }
}
