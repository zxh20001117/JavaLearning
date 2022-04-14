package experiment1;

import java.util.Scanner;

public class exp1_1 {
    static public double avg(int a, int b, int c){
        return (a+b+c)/3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(avg(sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
}
