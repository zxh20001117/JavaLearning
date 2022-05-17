package experiment9;

public class exp9_1 {
    public static void main(String[] args) {
        Product product = new Product();
        Thread consumer = new Thread(new Comsumer(product));
        Thread producer = new Thread(new Producer(product));
        consumer.setName("Comsumer");
        producer.setName("Producer");
        consumer.start();
        producer.start();
    }
}
