package experiment4;

public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("95588", 8000, 0.30);
        System.out.printf("%s,%.2f,%.2f",savingsAccount.getAccountNumber(),savingsAccount.getBalance(),savingsAccount.getIntereRate());
    }
}
