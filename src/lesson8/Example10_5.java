package lesson8;

import javax.swing.*;
import java.awt.*;
public class Example10_5{
    public static void main(String args[]){
        new MyWin();
    }
}
class MyWin extends JFrame{
    JTabbedPane p;
    Icon icon[];
    String imageName[]={"a.jpg","b.jpg","c.jpg","d.jpg","e.jpg"};
    public MyWin(){
        setBounds(100,100,500,300);
        setVisible(true);
        icon=new Icon[imageName.length];
        for(int i=0;i<icon.length;i++)
            icon[i]=new ImageIcon(imageName[i]);
        p=new JTabbedPane(JTabbedPane.LEFT);
        for(int i=0;i<icon.length;i++){
            int m=i+1;
            p.add("观看第"+m+"个图片",new JButton(icon[i]));
        }
        p.validate();
        add(p,BorderLayout.CENTER);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
//请在当前目录下,准备"a.jpg","b.jpg","c.jpg","d.jpg","e.jpg"五个图片文件
