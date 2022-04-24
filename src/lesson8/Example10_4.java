package lesson8;

import javax.swing.*;
import java.awt.*;
public class Example10_4{
    public static void main(String args[]){
        JFrame win=new JFrame("窗体");
        win.setBounds(100,100,300,300);
        win.setVisible(true);
        JButton bSouth=new JButton("南"),
                bNorth=new JButton("北"),
                bEast =new JButton("东"),
                bWest =new JButton("西");
        JTextArea bCenter=new JTextArea("中心");
        win.add(bNorth,BorderLayout.NORTH);
        win.add(bSouth,BorderLayout.SOUTH);
        win.add(bEast,BorderLayout.EAST);
        win.add(bWest,BorderLayout.WEST);
        win.add(bCenter,BorderLayout.CENTER);
        win.validate();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
