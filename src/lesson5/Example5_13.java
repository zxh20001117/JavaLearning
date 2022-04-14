package lesson5;

interface Show{
    void show();
}
class A13 implements Show{
    public void show(){
        System.out.println("I love This Game");
    }
}
class B13 implements Show{
    public void show(){
        System.out.println("我喜欢看NBA");
    }
}
class C13{
    public void f(Show s){    //接口作为参数
        s.show();
    }
}
public class Example5_13{
    public static void main(String args[]){
        C13 c=new C13();
        c.f(new A13());
        c.f(new B13());
    }
}
