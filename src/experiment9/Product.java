package experiment9;

import java.util.Vector;

public class Product {
    private Vector storage = new Vector();

    public int getStorageSize() {
        return storage.size();
    }

    public synchronized void addStorage() {
        if(this.getStorageSize() >= 10) {
            try {
                System.out.println(Thread.currentThread().getName() + ": Storage is full, waiting...");
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            this.storage.add(1);
            System.out.println(Thread.currentThread().getName() + ": Storage is added, now has " + this.getStorageSize() + " items.");
            notifyAll();
        }
    }

    public synchronized void removeStorage() {
        if(getStorageSize() == 0){
            System.out.println(Thread.currentThread().getName() + ": Storage is empty, waiting...");
            try {
                wait();
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            this.storage.remove(0);
            System.out.println(Thread.currentThread().getName() + ": Storage is removed, now has " + this.getStorageSize() + " items.");
            notifyAll();
        }
    }
}
