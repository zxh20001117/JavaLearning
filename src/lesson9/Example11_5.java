package lesson9;

import java.io.*;
import java.net.*;
class Client5{
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

class Server5{
    public static void main(String args[]){
        ServerSocket server=null;
        Socket you=null;
        DataOutputStream out=null;
        DataInputStream  in=null;
        try{  server=new ServerSocket(4331);
        }
        catch(IOException e1){
            System.out.println("ERRO:"+e1);
        }
        try{  you=server.accept();
            in=new DataInputStream(you.getInputStream());
            out=new DataOutputStream(you.getOutputStream());
            while(true){
                int m=0;
                m=in.readInt();
                //通过使用in读取客户写入输出流的信息。堵塞状态，除非读取到信息
                out.writeUTF("你说的数对应的字符是:"+(char)m);
                System.out.println("服务器收到:"+m);
                Thread.sleep(500);
            }
        }
        catch(IOException e){
            System.out.println(""+e);
        }
        catch(InterruptedException e){}
    }
}
