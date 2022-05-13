package experiment7;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Scanner;
public class exp2_2 {
    static String[] rankString = {"优秀","良好","中等","及格","不及格"};
    static int[] rankSum ={0,0,0,0,0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        HashMap<String, Student> map = new HashMap<String, Student>();
        System.out.println("输入格式为人名 分数（0-100），当发现两个连续字符串，自动结束输入");
        while (sc.hasNext()) {
            try {
                String str = sc.next();
                double n = sc.nextDouble();
                if (n < 0 || n > 100) {
                    System.out.println("分数非法！");
                    break;
                }
                map.put(str, new Student(str, n));
            } catch (Exception e) {
                break;
            }
        }
        calculateRankSum(map);
        System.out.println(map);
        System.out.println("最高分" + max(map));
        System.out.println("最低分" + min(map));
        System.out.println("人数" + map.size());
        System.out.println("平均值" + getAvgScore(map));
        System.out.printf("\n不及格人数%d,比例%.2f%%", rankSum[4], rankSum[4] * 100.0 / map.size());
        System.out.printf("\n及格人数%d,比例%.2f%%", rankSum[3], rankSum[3] * 100.0 / map.size());
        System.out.printf("\n中等人数%d,比例%.2f%%", rankSum[2], rankSum[2] * 100.0 / map.size());
        System.out.printf("\n良好人数%d,比例%.2f%%", rankSum[1], rankSum[1] * 100.0 / map.size());
        System.out.printf("\n优秀人数%d,比例%.2f%%", rankSum[0], rankSum[0] * 100.0 / map.size());
    }

    public static double max(HashMap<String, Student> map){
        double max = 0.0;
        for (Student s: map.values()){
            if(s.score > max) max = s.score;
        }
        return max;
    }

    public static double min(HashMap<String, Student> map){
        double min = 100.0;
        for (Student s: map.values()){
            if(s.score < min) min = s.score;
        }
        return min;
    }
    public static double getAvgScore(HashMap<String, Student> map){
        double sum = 0;
        for (Student s: map.values()
        ) {
            sum+=s.score;
        }
        return sum/map.size();
    }

    public static void calculateRankSum(HashMap<String, Student> map){
        for (Student s: map.values()
        ) {
            if (s.score>=90) rankSum[0]++;
            else if(s.score>=80) rankSum[1]++;
            else if(s.score>=70) rankSum[2]++;
            else if(s.score>=60) rankSum[3]++;
            else rankSum[4]++;
        }
    }
}

class Student{
    String name;
    double score;
    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }
}