package lesson5;

class A6{
    int x,y;
    A6(){
        x=100;
        y=200;
    }
    A6(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class B6 extends A6{
    int z;
    B6(int x,int y){
        super(x,y);
        z=300;
    }
    B6(){
        super();  //可以省略
        z=800;
    }
    public void f(){
        System.out.printf("x=%d,y=%d,z=%d\n",x,y,z);
    }
}
public class Example5_6{
    public static void main(String args[]){
        B6 b1=new B6(10,20);
        b1.f();
        B6 b2=new B6();
        b2.f();
    }
}
