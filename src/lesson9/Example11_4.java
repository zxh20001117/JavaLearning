package lesson9;

import java.net.*;
public class Example11_4{
    public static void main(String args[]){
        try{  InetAddress address_1=InetAddress.getByName("www.sina.com.cn");
            System.out.println(address_1.toString());
            InetAddress address_2=InetAddress.getByName("166.111.222.3");
            System.out.println(address_2.toString());
        }
        catch(UnknownHostException e){
            System.out.println("无法找到www.sina.com.cn");
        }
    }
}

