package lesson5;

abstract class Student{
    abstract void speak();
}
class Teacher{
    void look(Student stu){
        stu.speak();  	           //执行匿名类体中重写的speak()方法
    }
}
public class Example5_16{
    public static void main(String args[]){
        Teacher zhang=new Teacher();
        zhang.look(new Student(){   //匿名类的类体，即Student的子类的类体
                       void speak(){
                           System.out.println("这是匿名类中的方法");
                       }
                   }  //匿名类类体结束
        );
    }
}

