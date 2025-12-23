public abstract class AbstractAccount implements IAccount {

    protected final int accountNumber;
    protected double balance;

    protected AbstractAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
    }

    @Override
    public double getCurrentBalance() {
        return balance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public abstract double withdraw(double amount);
}

