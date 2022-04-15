package lesson7;

import java.util.*;
class Student14 implements Comparable{
    int english=0;
    String name;
    Student14(int e,String n){
        english=e;name=n;
    }
    public int compareTo(Object b){
        Student14 st=(Student14)b;
        if(this.english==st.english){
            return -1;
        }
        return (this.english-st.english);
    }
}
public class Example7_14{
    public static void main(String args[]){
        TreeSet<Student14> myTree=new TreeSet<Student14>();
        Student14 st1,st2,st3;
        st1=new Student14(90,"zhan ying");
        st2=new Student14(86,"wang heng");
        st3=new Student14(86,"Liuh qing");
        myTree.add(st1);
        myTree.add(st2);
        myTree.add(st3);
        Iterator<Student14> te=myTree.iterator();
        while(te.hasNext()){
            Student14 stu=te.next();
            System.out.println(" "+stu.name+" "+stu.english);
        }
    }
}
