package lesson5;

interface Show17{
    public void show();
}
class A17{
    void f(Show17 s){
        s.show();        //s调用匿名类体中实现的接口方法（接口回调）
    }
}
public class Example5_17{
    public static void main(String args[]){
        A17 a=new A17();
        a.f(new Show17(){
            public void show(){
                System.out.println("这是实现了接口的匿名类");
            }
        });
    }
}

