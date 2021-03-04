package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithdrawMoneyTest {
    @Test
    public void TestExecute() {
        //when
        Card card = new Card("12345", "1234");

        Account account = new Account("Andrew", 23, card);

        WithdrawMoney withdrawMoney = new WithdrawMoney(account, 344);

        //then
        assertEquals("The withdraw money should display 'Not enough founds'", "Not enough founds", withdrawMoney.execute());
    }
}
