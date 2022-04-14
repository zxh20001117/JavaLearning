package lesson7;

public class Example7_5{
    public static void main(String args[]){
        double a=Math.sqrt(10);
        System.out.println("格式化前："+a);
        MyNumberFormat myFormat=new MyNumberFormat();
        System.out.println("格式化后："+myFormat.format(a,5));//保留5位小数
    }
}
class MyNumberFormat{
    public String format(double a,int n){
        String str=String.valueOf(a);    //用数字a得到一个串对象
        int index=str.indexOf(".");     //获取小数点的位置
        String temp=str.substring(index+1);  //截取小数部分
        int fractionLeng=temp.length();     //首先知道小数点后面有几个数字
        n=Math.min(fractionLeng,n); //取n和fractionLeng中的最小值
        str=str.substring(0,index+n+1); //得到保留 n位小数后的字符串
        return str;
    }
}

