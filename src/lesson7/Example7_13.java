package lesson7;

import java.util.*;
class Book{
    String ISBN,name;
    Book(String ISBN,String name){
        this.name=name;
        this.ISBN=ISBN;
    }
}
public class Example7_13{
    public static void main(String args[]){
        Book  book1=new Book("7302033218","C++基础教程"),
                book2=new Book("7808315162","Java编程语言"),
                book3=new Book("7302054991","J2ME无线设备编程");
        String key="7808315162";
        HashMap<String,Book> table=new HashMap<String,Book>();
        table.put(book1.ISBN,book1);
        table.put(book2.ISBN,book2);
        table.put(book3.ISBN,book3);
        if(table.containsKey(key)){
            System.out.println(table.get(key).name+"有货");
        }
        Book b=table.get("7302054991");
        System.out.println("书名: "+b.name+",ISBN: "+b.ISBN);
        int number=table.size();
        System.out.println("散列映射中有"+number+"个元素: ");
        Collection<Book> collection=table.values();
        Iterator<Book> iter=collection.iterator();
        while(iter.hasNext()){
            Book te=iter.next();
            System.out.printf("书名:%s,ISBN:%s\n",te.name,te.ISBN);
        }
    }
}

