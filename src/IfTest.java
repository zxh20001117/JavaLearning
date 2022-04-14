public class IfTest {
    public static void main(String[] args) {
        double score = 0;
        java.util.Scanner s = new java.util.Scanner(System.in);
        score = s.nextDouble();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}