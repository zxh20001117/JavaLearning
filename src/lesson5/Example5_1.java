package lesson5;

class Father{
    private int moneyDollar=300;
    int moneyHK=200;
    int add(int x,int y){
        return x+y;
    }
}
class Son extends Father{
    int moneyRMB=800;
    public void changMoneyHK(int x){
        moneyHK=x;
    }
    public void changMoneyRMB(int x){
        moneyRMB=x;
    }
    int subs(int x,int y){
        return x-y;
    }
}
class GrandSon extends Son{
    int multi(int x,int y){
        return x*y;
    }
}
public class Example5_1{
    public static void main(String args[]){
        int a=5,b=3;
        Son son=new Son();
        GrandSon sunzi=new GrandSon();
        son.changMoneyHK(666);
        son.changMoneyRMB(5000);
        System.out.println("儿子的港币是继承的属性,当前的值是:"+son.moneyHK);
        System.out.println("儿子的人民币是新增的属性,当前的值是:"+son.moneyRMB);
        System.out.printf("减法是儿子新增的功能,%d-%d等于%d\n",a,b,son.subs(a,b));
        System.out.printf("加法是儿子继承的功能,%d+%d等于%d\n",a,b,son.add(a,b));
        System.out.println("孙子的港币和人民币都是继承的属性,,当前的值是:");
        System.out.println("港币:"+sunzi.moneyHK+" 人民币:"+sunzi.moneyRMB);
        System.out.printf("乘法是孙子新增的功能,%d*%d等于%d\n",a,b,sunzi.multi(a,b));
        System.out.printf("加法是孙子继承的功能,%d+%d等于%d\n",a,b,sunzi.add(a,b));
        System.out.printf("减法是孙子继承的功能,%d-%d等于%d\n",a,b,sunzi.subs(a,b));
    }
}
