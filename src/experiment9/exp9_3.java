package experiment9;

import java.util.Random;

public class exp9_3 {
    public static void main(String[] args) throws InterruptedException {
        Flag flag = new Flag();
        Thread t1 = new Thread(new Start(flag));
        t1.start();
        int time = 0;
        for(int i = 0; i < new Random().nextInt(15); i++) {
            System.out.println("now is " + time++ + " second");
            Thread.sleep(1000);
        }
        System.out.println("Send signal");
        flag.ISignal();
    }
}
