package experiment9;

public class Flag {
    boolean ready = false;
    public void setReady() {
        ready = true;
    }
    public boolean isReady() {
        return ready;
    }

    synchronized void IWait() throws InterruptedException {
        wait();
    }

    synchronized void ISignal() {
        this.setReady();
        notify();
    }
}
