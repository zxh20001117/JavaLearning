package lesson5;

class A2{
    private int x=10;
    protected int y=20;
    void f(){
        y=y+x;
        System.out.printf("x=%d,y=%d\n",x,y);
    }
}
class B2 extends A2{
    void g(){
        y=y+1;
        System.out.printf("y=%d\n",y);
    }
}
class Example5_2{
    public static void main(String args[]){
        B2 b=new B2();
        b.g();                        //调用子类自己声明的方法，继承了y,B.y(20),B.y=B.y+1,B.y(21)
        b.f();                        //调用从父类继承的方法,未继承x,父类B.y=A.x(10)+B.y(21)
        b.g();                        //调用子类自己声明的方法,B.y(31),  B.y=B.y+1,   B.Y(32)
    }
}
