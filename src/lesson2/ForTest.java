package lesson2;

public class ForTest {
    public static void main(String[] args) {
        int sum=0,i,j;
        for(i = 2,sum = 0;i<1000;i++){
            for(j=1;j<i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
        }
    }
}
