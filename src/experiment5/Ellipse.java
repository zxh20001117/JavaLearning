package experiment5;

public class Ellipse implements Shape{
    private double a;
    private double b;

    public void setAB(double a, double b) {
        if(a<0){
            System.out.println("a应大于0");
            return;
        }
        if(b<0){
            System.out.println("b应大于0");
            return;
        }
        if(a<b){
            System.out.println("a应大于b");
            return;
        }
        this.a = a;
        this.b = b;
    }


    @Override
    public double getC() {
        return 2*Math.PI*b+4*(a-b);
    }

    @Override
    public double getS() {
        return Math.PI*a*b;
    }
}
