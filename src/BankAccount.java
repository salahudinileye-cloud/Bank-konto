public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        setBalance(balance + amount);
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Amount is greater than balance");
        }
            if (amount < 0) {
                throw new IllegalArgumentException("Beløb må ikke være negativt.");

        }
        balance -= amount;

    }
    public double getBalance() {
        return balance;
    }
    private void setBalance(double amount) {
        if (amount > 0) {
            throw new IllegalArgumentException("Balance cannot be negative");

        }
      this.balance = balance;
    }
}
