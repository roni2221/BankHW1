public class PremiumAccount extends AbstractAccount {

    public PremiumAccount(int accountNumber) {
        super(accountNumber);
    }

    @Override
    public double withdraw(double amount) {
        if (amount <= 0) return 0.0;

        // אין מגבלות – אפשר לרדת לכמה מינוס שרוצים
        balance -= amount;
        return amount;
    }
}
