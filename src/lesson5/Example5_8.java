package lesson5;

class A8{
    double n;
    int m;
    void f(){
        System.out.printf("子类继承方法f(),n=%f,m=%d\n",n,m);
    }
    void g(){
        System.out.printf("你好，n=%f,m=%d\n",n,m);
    }
}
class B8 extends A8{
    int n=12;
    void g(){
        System.out.printf("子类重写方法g(),n=%d,m=%d\n",n,m);
    }
    void cry(){
        System.out.printf("子类新增的方法,n=%d,m=%d\n",n,m);
    }
}
public class Example5_8{
    public static void main(String args[ ]){
        A8 a;
        a=new B8();            	//a是子类对象的上转型对象
        a.n=0.618;            	//操作子类隐藏的double类型成员n
        a.m=200;             	//操作子类继承的成员m,等价于b.m=200;
        a.f();                	//调用子类继承的方法,等价于b.f();
        a.g();                 	//调用子类重写的方法,等价于b.g();
        B8 b=(B8)a;            	//上转型对象强制转换成子类对象
        b.n=555;           	     //操作子类新增的int类型成员n
        b.cry();               	// a.cry();  是非法的
    }
}
