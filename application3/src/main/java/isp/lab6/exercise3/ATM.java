package isp.lab6.exercise3;

public class ATM {
    private ChangePin oldPin;

    private ChangePin newPin;

    private double amount;

    private Card card;

    Bank bank;

    /**
     * This method should change the pin with another
     *
     * @param oldPin represent the old pin of the card
     * @param newPin represent the new pin of the card
     */
    public void changePin(ChangePin oldPin, ChangePin newPin) {
        this.oldPin = oldPin;
        this.newPin = newPin;
    }

    /**
     * This method should set the amount of money to be withdrawn
     *
     * @param amount represent the amount of money
     */
    public void withdraw(double amount) {
        this.amount = amount;
    }

    /**
     * This method should verify if the pin  is valid
     * This compare the pin of the card with the pin introduced
     *
     * @param card represent the card with id and pin
     * @param pin  represent the pin introduced
     * @return true for valid and false for invalid pin
     */
    public boolean insertCard(Card card, String pin) {
        if (card.getPin().equals(pin)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method should remove a card from bank
     */
    public void removeCard() {
        card.setCardId(null);
        card.setPin(null);
    }

    public Card getCard() {
        return card;
    }

    /**
     * This method should verify the bank and the card and execute a transaction or
     * display a message if they are null
     */
    public void checkMoney() {
        if (card != null && bank != null) {
            System.out.println(this.bank.executeTransaction(new CheckMoney(this.bank.getAccountByCardId(this.card.getCardId()))));
        } else {
            System.out.println("Please check that the bank is not null and you have inserted a card in ATM");
        }

    }


    /**
     * This method should verify the bank and the card and execute a transaction or
     * display a message if they are null
     *
     * @param amount represent the amount of money which will be withdrawn
     */
    public void withdrawMoney(double amount) {
        if (card != null && bank != null) {
            System.out.println(this.bank.executeTransaction((new WithdrawMoney(this.bank.getAccountByCardId(this.card.getCardId()), amount))));
        } else {
            System.out.println("Please check the bank is not null and you have inserted a card in ATM");
        }

    }


    public static String userMenu() {
        return "Option 1: Change Pin" + "\n" + "Option 2: Withdraw"
                + "\n" + "Option 3: Check Money" + "\n" + "Option 4: Remove Card";
    }
}
