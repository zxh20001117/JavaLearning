package lesson7;

import java.util.*;
public class Example7_2{
    public static void main(String args[ ]){
        Calendar calendar=Calendar.getInstance();   //创建一个日历对象
        calendar.setTime(new Date());             //用当前时间初始化日历时间
        String 年=String.valueOf(calendar.get(Calendar.YEAR)),
                月=String.valueOf(calendar.get(Calendar.MONTH)+1),
                日=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)),
                星期=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
        int hour=calendar.get(Calendar.HOUR_OF_DAY),
                minute=calendar.get(Calendar.MINUTE),
                second=calendar.get(Calendar.SECOND);
        System.out.println("现在的时间是：");
        System.out.print(""+年+"年"+月+"月"+日+"日 "+ "星期"+星期);
        System.out.println(" "+hour+"时"+minute+"分"+second+"秒");
        calendar.set(1931,8,18);        //将日历翻到1931年九月十八日，8表示九月
        long timeOne=calendar.getTimeInMillis();
        calendar.set(1945,7,15);        //将日历翻到1945年八月十五日,7表示八月
        long timeTwo=calendar.getTimeInMillis();
        long 相隔天数=(timeTwo-timeOne)/(1000*60*60*24);
        System.out.println("1945年8月15日和1931年9月18日相隔"+相隔天数+"天");
    }
}

