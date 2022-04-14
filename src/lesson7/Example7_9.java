package lesson7;

import java.util.*;
class Student9{
    String name ;
    int number;
    float score;
    Student9(String name,int number,float score){
        this.name=name;
        this.number=number;
        this.score=score;
    }
}
public class Example7_9{
    public static void main(String args[]){
        LinkedList<Student9> mylist=new LinkedList<Student9>();
        Student9  stu_1=new Student9("赵民" ,9012,80.0f),
                stu_2=new Student9("钱青" ,9013,90.0f),
                stu_3=new Student9("孙枚" ,9014,78.0f),
                stu_4=new Student9("周右" ,9015,55.0f);
        mylist.add(stu_1);
        mylist.add(stu_2);
        mylist.add(stu_3);
        mylist.add(stu_4);
        Iterator<Student9> iter=mylist.iterator();
        while(iter.hasNext()){
            Student9 te=iter.next();
            System.out.println(te.name+" "+te.number+"  "+te.score);
        }
    }
}

