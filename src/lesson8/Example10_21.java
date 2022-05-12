package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_21{
    public static void main(String args[]){
        MyWindow win=new MyWindow();
    }
}
class MyWindow21 extends JFrame{
    MyWindow21(){
        addWindowListener(new WindowAdapter(){       //匿名类对象作为监视器
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setBounds(100,100,150,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}