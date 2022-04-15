package lesson7;

import java.util.*;
public class Example7_10{
    public static void main(String args[]){
        LinkedList mylist=new LinkedList();
        mylist.add("It");                 //链表中的第一个节点
        mylist.add("is");                 //链表中的第二个节点
        mylist.add("a");                 //链表中的第三个节点
        mylist.add("door");              //链表中的第四个节点
        int number=mylist.size();         //获取链表的长度
        for(int i=0;i<number;i++){
            String temp=mylist.get(i).toString(); //必须强制转换取出的数据
            System.out.println("第"+i+"节点中的数据:"+temp);
        }
        Iterator iter=mylist.iterator();
        while(iter.hasNext()){
            String te=iter.next().toString();      //必须强制转换取出的数据
            System.out.println(te);
        }
    }
}
