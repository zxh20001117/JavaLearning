package lesson3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account[] accountList = new Account[5];
        String[] accountNumber = {"1", "2", "3", "4", "5"};
        String[] accountName = {"tw", "zxh", "ssy", "cgx", "wxt"};
        double[] accountBalance = {1234.0, 641.0, 5464.0, 654.0, 6543.0};
        for (int i = 0; i < accountList.length; i++) {
            accountList[i] = new Account(accountNumber[i], accountName[i], accountBalance[i]);
        }
        run(accountList);
        System.out.println("感谢使用此系统！祝您生活愉快！");
    }

    static public int checkAccountList(Account[] accountList, String accountNumber) {
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i].getAccountNumber().equals(accountNumber)) {
                return i;
            }
        }
        return -1;
    }

    static public void run(Account[] accountList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入账户编号：");
        String accountNumberIn = sc.next();
        while (checkAccountList(accountList, accountNumberIn) < 0) {
            System.out.print("查无此账户！是否要重新输入(yes/else)：");
            String check = sc.next();
            if (check.equals("yes") || check.equals("Yes")) {
                System.out.print("请输入账户编号：");
                accountNumberIn = sc.next();
            } else return;
        }
        System.out.print("请输入存款额！:");
        double balanceIn = sc.nextDouble();
        while (balanceIn < 0) {
            System.out.print("存款额不能小于0，请重新输入：");
            balanceIn = sc.nextDouble();
        }
        accountList[checkAccountList(accountList, accountNumberIn)].deposit(balanceIn);
        System.out.println("存款成功！");
        System.out.println(accountList[checkAccountList(accountList, accountNumberIn)].toString());
    }
}
