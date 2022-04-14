package experiment5;

public class Triangle implements Shape{
    private double a;

    public void setA(double a) {
        if(a>0)this.a = a;
        else System.out.println("a应大于零！");
    }

    @Override
    public double getC() {
        return 3*a;
    }

    @Override
    public double getS() {
        return a*a*Math.sqrt(3)/4;
    }
}