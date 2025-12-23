public class StandardAccount extends AbstractAccount {

    private final double creditLimit;

    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        this.creditLimit = (creditLimit < 0) ? creditLimit : 0.0;
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0) return 0.0;


        double allowed = balance - creditLimit;
        if (allowed <= 0) return 0.0;

        double actual = Math.min(amount, allowed);
        balance -= actual;
        return actual;
    }
}
