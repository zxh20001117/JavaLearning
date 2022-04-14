import java.util.Scanner;

public class IsPrime {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        int total_num = 0;
        for (int i=2;i< max; i++){
            if (IsPrime(i)){
                System.out.print(i+" ");
                total_num++;
                if (total_num%8 ==0){
                    System.out.println();
                }
            }
        }
    }

    public static boolean IsPrime(int n){
        boolean prime = true;
        for(int i = 2;i<Math.sqrt(n);i++){
            if (n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}
