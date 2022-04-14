package lesson5;

class Animal{
    void cry(){}
}
class Dog extends Animal{
    void cry(){
        System.out.println("Wang!Wang!......");
    }
}
class Cat extends Animal{
    void cry(){
        System.out.println("miao~~miao~~...");
    }
}
public class Example5_9{
    public static void main(String args[]){
        Animal animal;
        animal=new Dog(); //animal是Dog对象的上转型对象
        animal.cry();
        animal=new Cat(); //animal是Cat对象的上转型对象
        animal.cry();
    }
}

