package isp.lab5.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void TestGetAccounts() {
        Card card = new Card("12345", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Andrew", 12, card);
        accounts[1] = new Account("Kevin", 22, card);
        accounts[2] = new Account("Mateo", 32, card);

        Bank bank = new Bank(accounts);

        bank.setAccounts(accounts);

        assertArrayEquals(accounts, bank.getAccounts());

    }

    @Test
    public void TestGetAccountByCardId() {
        Card card = new Card("12345", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Andrew", 12, card);
        accounts[1] = new Account("Kevin", 22, card);
        accounts[2] = new Account("Mateo", 32, card);

        Bank bank = new Bank(accounts);

        bank.getAccountByCardId("12345");

        assertEquals("The account should be:'Account{" +
                "owner='Andrew', balance=12.0, card=Card{" +
                "cardId='12345', pin='1234'}}'", "Account{" +
                "owner='Andrew', balance=12.0, card=Card{" +
                "cardId='12345', pin='1234'}" +
                "}\n", bank.getAccountByCardId("12345").toString());

    }

    @Test
    public void TestExecuteTransaction() {

        Transaction transaction = new Transaction() {
            @Override
            public String execute() {
                return null;
            }
        };
        Card card = new Card("12345", "1234");

        Account accounts[] = new Account[3];

        accounts[0] = new Account("Andrew", 12, card);
        accounts[1] = new Account("Kevin", 22, card);
        accounts[2] = new Account("Mateo", 32, card);

        Bank bank = new Bank(accounts);

        assertEquals("The transaction should be: 'null' ", null, bank.executeTransaction(transaction));
    }
}
