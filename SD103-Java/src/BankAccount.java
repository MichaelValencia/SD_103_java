public class BankAccount {
    private String description;
    private String accountId;
    private double balance;
    private BankAccount overdraftAccount;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount getOverdraftAccount() {
        return overdraftAccount;
    }

    public void setOverdraftAccount(BankAccount overdraftAccount) {
        this.overdraftAccount = overdraftAccount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "description='" + description + '\'' +
                ", accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount(String description, double balance) {
        this.description = description;
        this.balance = balance;
        this.accountId = "A" + (int) (Math.random() + Integer.MAX_VALUE);
        this.overdraftAccount = null;
    }

    public double deposit(double howMuch) {
        balance += howMuch;
        return balance;
    }

    public void transfer(double howMuchToTransfer, BankAccount destinationAccount) {
        if (this.withdraw(howMuchToTransfer)) {
            destinationAccount.deposit(howMuchToTransfer);
            //destinationAccount.balance += howMuchToTransfer;
        }
    }

    public boolean withdraw(double howMuch) {
        if (balance >= howMuch) {
            balance -= howMuch;
            return true;
        } else {
            if (overdraftAccount != null) {
                if (howMuch < balance + overdraftAccount.getBalance()) {
                    howMuch -= balance;
                    balance = 0;
                    overdraftAccount.withdraw(howMuch);
                    return true;
                }
            }
            return false;
        }
    }
}
