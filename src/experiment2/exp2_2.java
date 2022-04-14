package experiment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exp2_2 {
    static List<String> names = new ArrayList<String>();
    static List<Double> scores = new ArrayList<Double>();
    static String[] rankString = {"优秀","良好","中等","及格","不及格"};
    static int[] rankSum ={0,0,0,0,0};

    public static void main(String[] args) {
        String name;
        double score;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入“姓名 分数”的格式(输入q退出):");
        while(!(name = sc.next()).equals("q")){
            score = sc.nextDouble();
            names.add(name);
            scores.add(score);
        }

        calculateRankSum();
        System.out.println("总考试人数："+scores.size());
        System.out.println("最高分："+getMaxScore());
        System.out.println("最低分："+getMinScore());
        System.out.println("平均分："+getAvgScore());
        for(int i =0;i<5;i++){
            System.out.println(rankString[i]+": "+rankSum[i]+"人  所占总考试人数："+(100.0*rankSum[i])/scores.size()+"%");
        }
    }
    public static double getMaxScore(){
        double max = 0;
        for (Double score:scores
             ) {
            if(score>max)max=score;
        }
        return max;
    }

    public static double getMinScore(){
        double min = 101;
        for (Double score:scores
        ) {
            if(score<min)min=score;
        }
        return min;
    }

    public static double getAvgScore(){
        double sum = 0;
        for (Double score:scores
        ) {
            sum+=score;
        }
        return sum/scores.size();
    }

    public static void calculateRankSum(){
        for (double score:scores
             ) {
            if (score>=90) rankSum[0]++;
            else if(score>=80) rankSum[1]++;
            else if(score>=70) rankSum[2]++;
            else if(score>=60) rankSum[3]++;
            else rankSum[4]++;
        }
    }
}
