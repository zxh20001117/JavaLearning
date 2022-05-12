package lesson9;

//客户端程序
import java.io.*;
import java.net.*;
public class Client{
    public static void main(String args[]){
        String s=null;
        Socket mysocket;
        DataInputStream in=null;
        DataOutputStream out=null;
        int i=1;
        try{  mysocket=new Socket("localhost",4331);
            in=new DataInputStream(mysocket.getInputStream());
            out=new DataOutputStream(mysocket.getOutputStream());
            out.writeInt(i);                             //通过out向服务器写入信息
            while(true){
                i=(i+1)%128;
                s=in.readUTF();
                //通过使用in读取服务器写入输出流的信息。堵塞状态，除非读取到信息
                out.writeInt(i);
                System.out.println("客户收到:"+s);
                Thread.sleep(500);
            }
        }
        catch(IOException e){
            System.out.println("无法连接");
        }
        catch(InterruptedException e){}
    }
}
