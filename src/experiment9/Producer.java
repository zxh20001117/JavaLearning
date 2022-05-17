package experiment9;

import java.util.Random;

public class Producer implements Runnable {
    Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(300));
                product.addStorage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
