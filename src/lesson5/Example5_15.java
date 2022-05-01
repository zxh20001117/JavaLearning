package lesson5;

class NorthEast{
    String land="黑土地";
}
class China{
    int x=10,y=10;
    LiaoNing dalian;             //内部类声明对象的作为外嵌类的成员
    China(){
        dalian=new LiaoNing();
    }
    void f(){
        System.out.println("我是中国");
        dalian.speak();
    }
    class LiaoNing extends NorthEast{      //内部类的声明
        int z;
        void speak(){
            System.out.println("我是大连,z="+z+":"+land);
        }
        void g(){
            z=x+y;                    //使用外嵌类中的x,y
            f();                       //调用外嵌类中的方法f()
        }
    }                                 //内部类结束
}
public class Example5_15{
    public static void main(String args[]){
        China china=new China();
        china.f(); //我是大连,z=0:黑土地
        china.dalian.g(); //我是大连,z=20:黑土地
    }
}

