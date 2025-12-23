public class BasicAccount extends AbstractAccount {

    private final double withdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit) {
        super(accountNumber);

        this.withdrawalLimit = Math.max(0.0, withdrawalLimit);
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0) return 0.0;


        double requested = Math.min(amount, withdrawalLimit);

        double actual = Math.min(requested, balance);

        balance -= actual;
        return actual;
    }
}
