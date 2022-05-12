package lesson9;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Receive extends JFrame implements Runnable,ActionListener{
    int port;                                      //组播的端口
    InetAddress group=null;                         //组播组的地址
    MulticastSocket socket=null;                     //多点广播套接字
    JButton startReceive,stopReceive;
    JTextArea showArea;
    Thread thread;                                 //负责接收信息的线程
    boolean stop=false;
    public Receive(){
        super("定时接收信息");
        thread=new Thread(this);
        startReceive=new JButton("开始接收");
        stopReceive=new JButton("停止接收");
        startReceive.addActionListener(this);
        stopReceive.addActionListener(this);
        showArea=new JTextArea(10,10);
        JPanel north=new JPanel();
        north.add(startReceive);
        north.add(stopReceive);
        Container con=getContentPane();
        con.add(north,BorderLayout.NORTH);
        con.add(new JScrollPane(showArea),BorderLayout.CENTER);
        port=5858;
        try{   group=InetAddress.getByName("239.255.8.0");
            socket=new MulticastSocket(port);
            socket.joinGroup(group);
        }
        catch(Exception e){}
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,300);
        validate();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==startReceive){
            if(!(thread.isAlive())){
                thread=new Thread(this);
                stop=false;
            }
            try{ thread.start();
            }
            catch(Exception ee){}
        }
        if(e.getSource()==stopReceive){
            stop=true;
        }
    }
    public void run(){
        while(true){
            byte data[]=new byte[8192];
            DatagramPacket packet=null;
            packet=new DatagramPacket(data,data.length,group,port);
            try {  socket.receive(packet);
                String message=new String(packet.getData(),0,packet.getLength());
                showArea.append("\n"+message);
                showArea.setCaretPosition(showArea.getText().length());
            }
            catch(Exception e){}
            if(stop==true)
                break;
        }
    }
    public static void main(String args[]){
        new Receive();
    }
}