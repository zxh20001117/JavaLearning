package lesson2;

public class WhileTest02 {
    public static void main(String[] args) {
        double sum = 0,item = 1,temp = 1;
        while(item<=1000){
            temp = temp * item;
            sum = sum + 1.0/temp;
            item+=1;
        }
        System.out.println(sum);
    }
}
