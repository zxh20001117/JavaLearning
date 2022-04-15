package lesson7;

import java.util.*;
class Student11{
    String name;
    int score;
    Student11(String name,int score){
        this.name=name;
        this.score=score;
    }
}
public class Example7_11{
    public static void main(String args[]){
        Student11 zh=new Student11("张红铭",77),
                wa=new Student11("王家家",68),
                li=new Student11("李佳佳",67);
        HashSet<Student11> set=new HashSet<Student11>();
        HashSet<Student11> subset=new HashSet<Student11>();
        set.add(zh);
        set.add(wa);
        set.add(li);
        subset.add(wa);
        subset.add(li);
        if(set.contains(wa)){
            System.out.println("集合set中含有:"+wa.name);
        }
        if(set.containsAll(subset)){
            System.out.println("集合set包含集合subset");
        }
        int number=subset.size();
        System.out.println("集合subset中有"+number+"个元素:");
        Object s[]=subset.toArray();
        for(int i=0;i<s.length;i++){
            System.out.printf("姓名:%s,分数:%d\n",((Student11)s[i]).name,((Student11)s[i]).score);
        }
        number=set.size();
        System.out.println("集合set中有"+number+"个元素:");
        Iterator<Student11> iter=set.iterator();
        while(iter.hasNext()){
            Student11 te=iter.next();
            System.out.printf("姓名:%s,分数:%d\n",te.name,te.score);
        }
    }
}

