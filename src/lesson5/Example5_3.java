package lesson5;

class A3{
    public double y=11.456789;
    public void f(){
        y=y+1;
        System.out.printf("y是double型的变量,y=%f\n",y);
    }
}
class B3 extends A3{
    int y=0;
    public void g(){
        y=y+100;
        System.out.printf("y是int型的变量,y=%d\n",y);
    }
}
class Example5_3{
    public static void main(String args[ ]){
        B3 b=new B3();
        b.y=200;
        b.g();         //调用子类新增的方法
        b.f();         //调用子类继承的方法
    }
}
/*特别需要注意的是，尽管子类可以隐藏从父类继承来的成员变量，
但是子类仍然可以使用从父类继承的方法操作被隐藏的成员变量，
比如，上述例子中，子类对象通过使用从父类继承的方法 f 操作
被隐藏的double型成员变量 y。 
*/