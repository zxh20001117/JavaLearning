package lesson9;

import java.net.*;
class BroadCast extends Thread{
    String s="中国奥运代表团已经获得58枚金牌";
    int port=5858;                                  //组播的端口
    InetAddress group=null;                          //组播组
    MulticastSocket socket=null;                      //多点广播套接字
    BroadCast(){
        try{  group=InetAddress.getByName("239.255.8.0");  //设置组播组为239.255.8.0
            socket=new MulticastSocket(port);   //多点广播套接字将在port端口广播
            socket.setTimeToLive(0);          //多点广播套接字发送数据报范围为本地网络
            socket.joinGroup(group);
//加入组播组,加入group后，socket发送的数据报可以被加入到group中的成员接收到
        }
        catch(Exception e){}
    }
    public void run(){
        while(true){
            try{  DatagramPacket packet=null;               //待广播的数据报
                byte data[]=s.getBytes();
                packet=new DatagramPacket(data,data.length,group,port);
                System.out.println(new String(data));
                socket.send(packet);                     //广播数据报
                sleep(2000);
            }
            catch(Exception e){}
        }
    }
    public static void main(String args[]){
        new BroadCast().start();
    }
}