package experiment2;

import java.util.Scanner;

public class exp2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height,weight;
        System.out.print("请输入您的体重(kg):");
        weight = sc.nextDouble();
        System.out.print("请输入您的身高(cm):");
        height = sc.nextDouble();
        System.out.println("您的BMI为 "+ calculateBMI(height,weight)+" "+ checkBMI(calculateBMI(height,weight)));
    }

    static public double calculateBMI(double height, double weight){
        return weight*100*100/(height*height);
    }

    public static String checkBMI(double BMI){
        if(BMI<18.5)return "偏轻";
        else if (BMI<25.0)return "正常";
        else if(BMI<30.0)return "偏重";
        else if(BMI<35.0)return "超重";
        else return "重度肥胖";
    }
}
