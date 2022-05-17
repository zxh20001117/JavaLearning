package experiment9;

import java.util.Random;

public class exp9_2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo td = new ThreadDemo(new Boolean(false));
        td.start();
        Thread.sleep(new Random().nextInt(15000));
        td.setFlag(new Boolean(true));
    }
}

class ThreadDemo extends Thread {
    private Boolean flag;
    private int time = 0;

    public ThreadDemo(Boolean flag) {
        this.flag = flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public void run() {
        while (true) {
            if (flag) {
                System.out.println("ThreadDemo is running");
                break;
            }
            else{
                System.out.println("ThreadDemo is waiting now is " + time++ + "seconds");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}