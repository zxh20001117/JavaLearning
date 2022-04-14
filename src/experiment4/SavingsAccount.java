package experiment4;

public class SavingsAccount extends BankAccount{
    private double intereRate;

    public SavingsAccount(String accountNumber, double balance, double intereRate) {
        super(accountNumber, balance);
        this.intereRate = intereRate;
    }

    public double getIntereRate() {
        return intereRate;
    }

    public void setIntereRate(double intereRate) {
        this.intereRate = intereRate;
    }
}
