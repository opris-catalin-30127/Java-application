package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {
    @Test
    public void TestOveloadedConstructor() {
        //when
        Card card = new Card("12345", "1234");

        Account account = new Account("Andrew", 23, card);

        Transaction transaction = new Transaction() {
            @Override
            public String execute() {
                return null;
            }
        };

        transaction.setAccount(account);

        //then
        assertEquals("The account should be: 'Account{" +
                "owner='Andrew', " +
                "balance=23.0," +
                " card=Card{" +
                "cardId='12345', pin='1234'}" +
                "}'", "Account{owner='Andrew'," +
                " balance=23.0, card=Card{" +
                "cardId='12345', pin='1234'}}\n", transaction.getAccount().toString());
    }


}
