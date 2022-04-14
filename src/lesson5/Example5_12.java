package lesson5;

interface ShowMessage{
    void showTradeMark();
}
class TV implements ShowMessage{
    public void showTradeMark(){
        System.out.println("我是电视机");
    }
}
class PC implements ShowMessage{
    public void showTradeMark(){
        System.out.println("我是电脑");
    }
}
public class Example5_12{
    public static void main(String args[]){
        ShowMessage sm;                 //声明接口变量sm
        sm=new TV();                    //接口变量sm中存放对象的引用
        sm.showTradeMark();              //接口sm回调showTradeMark()方法
        sm=new PC();                    //接口变量sm中存放对象的引用
        sm.showTradeMark();              //接口回调
    }
}
