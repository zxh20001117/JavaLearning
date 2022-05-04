package experiment4;

import java.util.Scanner;

public class SalesTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入销售经理姓名 与 销售额，以空格隔开：");
        employees[0] = new SalesManager(input.next(), input.nextDouble());
        System.out.println("请输入专职销售员姓名 与 销售额，以空格隔开：");
        employees[1] = new FullTimeSales(input.next(), input.nextDouble());
        System.out.println("请输入专职销售员姓名 与 销售额，以空格隔开：");
        employees[2] = new FullTimeSales(input.next(), input.nextDouble());
        System.out.println("请输入兼职销售员姓名 与 工作时间，以空格隔开：");
        employees[3] = new PartTimePromoter(input.next(), input.nextInt());
        double amount = 0;
        for (Employee employee : employees) {
            amount += employee.getSalary();
        }
        System.out.printf("总工资额为： %.2f 元", amount);
    }
}
