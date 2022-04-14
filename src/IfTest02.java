public class IfTest02 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int age = -1;
        System.out.print("请输入年龄（-1退出）：");
        age = s.nextInt();
        while (age != -1) {
            if (age < 0) {
                System.out.println("输入错误！");
            } else if (age <= 10) {
                System.out.println(SayAge(age) + "孩童阶段");
            } else if (age <= 18) {
                System.out.println(SayAge(age) + "少年阶段");
            } else if (age <= 35) {
                System.out.println(SayAge(age) + "青年阶段");
            } else if (age <= 55) {
                System.out.println(SayAge(age) + "中年阶段");
            } else if (age <= 150) {
                System.out.println(SayAge(age) + "老年阶段");
            } else {
                System.out.println(SayAge(age) + "成神阶段");
            }
            System.out.print("请输入下一个数字（-1退出）：");
            age = s.nextInt();
        }
        System.out.println("结束！");
    }

    static String SayAge(int age) {
        return "您的年龄是" + age + "岁" + " 处于";
    }
}