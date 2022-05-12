package lesson9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Example11_1{
    public static void main(String args[]){
        new NetWin();
    }
}
class NetWin extends JFrame implements ActionListener,Runnable{
    JButton button;
    URL url;
    JTextField text;
    JTextArea area;
    byte b[]=new byte[118];
    Thread thread;
    NetWin(){
        text=new JTextField(20);
        area=new JTextArea(12,12);
        button=new JButton("确定");
        button.addActionListener(this);
        thread=new Thread(this);
        JPanel p=new JPanel();
        p.add(new JLabel("输入网址:"));
        p.add(text);
        p.add(button);
        add(new JScrollPane(area),BorderLayout.CENTER);
        add(p,BorderLayout.NORTH);
        setBounds(60,60,360,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(!(thread.isAlive()))
            thread=new Thread(this);
        try{  thread.start();
        }
        catch(Exception ee){}
    }
    public void run(){
        try {  int n=-1;
            area.setText(null);
            url=new URL(text.getText().trim());
            InputStream in=url.openStream();
            while((n=in.read(b))!=-1){
                String s=new String(b,0,n);
                area.append(s);
            }
        }
        catch(MalformedURLException e1){
            text.setText(""+e1);
            return;
        }
        catch(IOException e1){
            text.setText(""+e1);
            return;
        }
    }
}
