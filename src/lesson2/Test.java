package lesson2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请一次输入成绩，以”，“隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        AverageScore as = new AverageScore();
        System.out.println(as.GetAverage(as.GetDoubleArray(str)));
    }
}
