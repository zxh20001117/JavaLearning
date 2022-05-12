package lesson8;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class Example10_19{
    public static void main(String args[]){
        byte b[]=new byte[30];
        JTextArea text=new JTextArea(20,20);
        JFrame f=new JFrame();
        f.setSize(330,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(text,BorderLayout.CENTER);
        try{   FileInputStream input=new FileInputStream("Example10_1.java");
            ProgressMonitorInputStream in=
                    new ProgressMonitorInputStream(f,"读取java文件",input);
            ProgressMonitor p=in.getProgressMonitor();   //获得进度条
            while(in.read(b)!=-1){
                String s=new String(b);
                text.append(s);
                Thread.sleep(1000);  //由于文件较小，为了看清进度条，这里有意延缓1秒
            }
        }
        catch(InterruptedException e){}
        catch(IOException e){}
    }
}
