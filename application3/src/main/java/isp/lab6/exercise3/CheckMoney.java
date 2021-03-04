package isp.lab6.exercise3;

public class CheckMoney extends Transaction {
    public CheckMoney(Account account) {
        super(account);
    }

    /**
     * This method make a transaction
     *
     * @return the balance of the account
     */
    @Override
    public String execute() {
        return this.account.getBalance() + "";
    }
}
