import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<IAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void openAccount(IAccount account) {
        if (account == null) return;
        accounts.add(account);
    }

    public void closeAccount(int accountNumber) {
        IAccount found = null;

        for (IAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                found = account;
                break;
            }
        }

        if (found == null) return;

        if (found.getCurrentBalance() >= 0) {
            accounts.remove(found);
        } else {
            System.out.println("account is not closed due to debt");
        }
    }

    public List<IAccount> getAllAccounts() {
        return new ArrayList<>(accounts);
    }

    public List<IAccount> getAllAccountsInDebt() {
        List<IAccount> result = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() < 0) {
                result.add(account);
            }
        }
        return result;
    }

    public List<IAccount> getAllAccountsWithBalance(double amount) {
        List<IAccount> result = new ArrayList<>();
        for (IAccount account : accounts) {
            if (account.getCurrentBalance() > amount) {
                result.add(account);
            }
        }
        return result;
    }
}
