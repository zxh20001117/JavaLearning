package experiment9;

public class Start implements Runnable {
    private Flag flag;
    public Start(Flag flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        while(true){
            if(!flag.isReady()){
                try {
                    flag.IWait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                System.out.println("ThreadDemo is running");
                break;
            }
        }
    }
}
