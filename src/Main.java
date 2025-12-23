public class Main {
    public static void main(String[] args) {

        IAccount standard = new StandardAccount(1, -100);
        IAccount basic = new BasicAccount(2, 100);
        IAccount premium = new PremiumAccount(3);

        Bank bank = new Bank();

        bank.openAccount(standard);
        bank.openAccount(basic);
        bank.openAccount(premium);

        System.out.println("Depositing 1000 to all accounts");
        standard.deposit(1000);
        basic.deposit(1000);
        premium.deposit(1000);

        System.out.println("Withdraw 3000 from Premium: " + premium.withdraw(3000));
        System.out.println("Withdraw 3000 from Basic: " + basic.withdraw(3000));
        System.out.println("Withdraw 3000 from Standard: " + standard.withdraw(3000));

        System.out.println("Standard balance: " + standard.getCurrentBalance());
        System.out.println("Basic balance: " + basic.getCurrentBalance());
        System.out.println("Premium balance: " + premium.getCurrentBalance());

        System.out.println("Accounts in debt:");
        for (IAccount acc : bank.getAllAccountsInDebt()) {
            System.out.println("Account " + acc.getAccountNumber());
        }
    }
}
