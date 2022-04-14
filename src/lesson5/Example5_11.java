package lesson5;

interface Computable{
    final int MAX=100;
    int f(int x);
    public abstract int g(int x,int y);
}
class A11 implements Computable{
    public int f(int x){
        return x*x;
    }
    public int g(int x,int y){
        return x+y;
    }
}
class B11 implements Computable{
    public int f(int x){
        return x*x*x;
    }
    public int g(int x,int y){
        return x*y;
    }
}
public class Example5_11{
    public static void main(String args[]){
        A11 a=new A11();
        B11 b=new B11();
        System.out.println(a.MAX);
        System.out.println(""+a.f(10)+" "+a.g(12,6));
        System.out.println(b.MAX);
        System.out.println(""+b.f(10)+" "+b.g(29,2));
    }
}

