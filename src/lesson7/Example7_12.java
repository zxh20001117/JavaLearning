package lesson7;

import java.util.*;
public class Example7_12{
    public static void main(String args[]){
        Integer one=new Integer(1),
                two=new Integer(2),
                three=new Integer(3),
                four=new Integer(4),
                five=new Integer(5),
                six=new Integer(6);
        HashSet<Integer> A=new HashSet<Integer>(),
                B=new HashSet<Integer>(),
                tempSet;
        A.add(one);
        A.add(two);
        A.add(three);
        A.add(four);
        B.add(one);
        B.add(two);
        B.add(five);
        B.add(six);

        System.out.println("A集合有"+A.size()+"个元素:");
        Iterator<Integer> iter=A.iterator();
        while(iter.hasNext()){
            Integer te=iter.next();
            System.out.printf("%d,",te);
        }

        System.out.println("\nB集合有"+A.size()+"个元素:");
        iter=B.iterator();
        while(iter.hasNext()){
            Integer te=iter.next();
            System.out.printf("%d,",te);
        }

        tempSet=(HashSet<Integer>)A.clone();
        A.removeAll(B);           //A变成调用该方法之前的A集合与B集合的差集
        B.removeAll(tempSet);      //B变成调用该方法之前的B集合与tempSet集合的差集
        B.addAll(A);              //B就是最初的A与B的对称差
        int number=B.size();
        System.out.println("\nA和B的对称差集合有"+number+"个元素:");
        iter=B.iterator();
        while(iter.hasNext()){
            Integer te=iter.next();
            System.out.printf("%d,",te);
        }
    }
}
