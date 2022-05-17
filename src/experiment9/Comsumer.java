package experiment9;

import java.util.Random;

public class Comsumer implements Runnable {
    private Product product;
    public Comsumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(300));
                product.removeStorage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
