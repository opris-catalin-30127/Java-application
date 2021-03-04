package isp.lab5.exercise1;

import java.util.Arrays;

public class Bank {

    private Account[] accounts;

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
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
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i].getCard().getCardId().equals(cardId)) {
                return this.accounts[i];
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
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
