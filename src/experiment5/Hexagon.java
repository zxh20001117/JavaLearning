package experiment5;

public class Hexagon implements Shape{
    private double a;

    public void setA(double a) {
        if(a>0)this.a = a;
        else System.out.println("a应大于零！");
    }

    @Override
    public double getC() {
        return 6*a;
    }

    @Override
    public double getS() {
        return a*a*Math.sqrt(3)*3/2;
    }
}
