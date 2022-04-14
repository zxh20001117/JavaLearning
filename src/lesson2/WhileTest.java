package lesson2;

public class WhileTest {
    public static void main(String[] args) {
        int i =0;
        while(i<5){
            switch (i){
                case 0:
                    System.out.println(0);
                case 1:
                    System.out.println(1);
                case 2:
                    System.out.println(2);
                case 3:
                    System.out.println(3);
                case 4:
                    System.out.println(4);
            }
            i++;
            System.out.println("------------------------");
        }
    }
}
