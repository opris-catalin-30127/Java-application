package isp.lab6.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Bank {

    private static List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     * This method should verify if the account have the same card id
     * with the card id introduced
     *
     * @param cardId represent the card id introduced
     * @return the account
     */
    public Account getAccountByCardId(String cardId) {
        for (Account account : accounts) {
            if (Objects.equals(account.getCard().getCardId(), cardId)) {
                return (Account) this.accounts;
            }
        }
        return null;
    }

    public String executeTransaction(Transaction transaction) {
        return transaction.execute();
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(new List[]{accounts}) +
                '}';
    }
}
