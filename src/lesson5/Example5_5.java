package lesson5;

class A5{
    public int f(int x,int y){
        return x+y;
    }
}
class B5 extends A5{
    public int f(byte x,int y){
        return x*y;
    }
}
public class Example5_5{
    public static void main(String args[]){
        int z=0;
        B5 b=new B5();
        z=b.f(10,10);          //z的值是20
        System.out.println(z);
        z=b.f((byte)10,10);     //z的值是100
        System.out.println(z);
    }
}
