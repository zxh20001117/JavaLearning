package lesson7;

import java.util.Date;
import java.text.SimpleDateFormat;
public class Example7_1{
    public static void main(String args[ ]){
        Date nowTime=new Date();
        System.out.println("现在的时间:"+nowTime);
        SimpleDateFormat matter1=new SimpleDateFormat(" 'BeijingTime':yyyy-MM-dd");
        System.out.println("现在的时间:"+matter1.format(nowTime));
        SimpleDateFormat matter2= new SimpleDateFormat("北京时间yyyy-MM-dd HH:mm:ss(a)(EE)");
        System.out.println("现在的时间:"+matter2.format(nowTime));
        long time=-1000L;
        Date date=new Date(time);
        System.out.println(time+"秒表示的日期时间是："+matter2.format(date));
        time=1000L;
        date=new Date(time);
        System.out.println(time+"秒表示的日期时间是："+matter2.format(date));
    }
}
