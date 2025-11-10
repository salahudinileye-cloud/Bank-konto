public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public void deposit(double amount) {
        setBalance(balance + amount);
    }
    public void withdraw(double amount) {
        setBalance(balance - amount);

    }
    public double getBalance() {
        return balance;
    }
    private void setBalance(double amount) {
        if (amount > 0) {
           throw new IllegalArgumentException("Balance cannot be negative");
        }
        balance = amount;
    }
}
