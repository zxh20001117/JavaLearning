package lesson3;

public class Account {
    private final String accountNumber;
    private final String accountName;
    private double balance;

    public Account(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double total) {
        if (total < getBalance()) {
            System.out.println("取款余额小于账户余额！");
        } else {
            this.balance = total;
        }
    }

    public String toString() {
        return "accountNumber: " + getAccountNumber() + "\naccountName: " + getAccountNumber() +
                "\nbalance: " + getBalance() + "元";
    }

    public void deposit(double total) {
        setBalance(getBalance() + total);
    }

    public void withdraw(double total) {
        setBalance(getBalance() - total);
    }

}
