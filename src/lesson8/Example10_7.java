package lesson8;

import javax.swing.*;
import java.awt.*;
public class Example10_7{
    public static void main(String args[]){
        new WindowLayered();
    }
}
class WindowLayered extends JFrame{
    WindowLayered(){
        setBounds(100,100,300,300);
        setVisible(true);
        JLayeredPane pane=new JLayeredPane();
        JButton b1=new JButton("我在DEFAULT_LAYER"),
                b2=new JButton("我在PALETTE_LAYER"),
                b3=new JButton("我在MODAL_LAYER"),
                b4=new JButton("我在POPUP_LAYER"),
                b5=new JButton("我在DRAG_LAYER");
        pane.setLayout(null);
        pane.add(b5,JLayeredPane.DRAG_LAYER);
        pane.add(b4,JLayeredPane.POPUP_LAYER);
        pane.add(b3,JLayeredPane.MODAL_LAYER);
        pane.add(b2,JLayeredPane.PALETTE_LAYER);
        pane.add(b1,JLayeredPane.DEFAULT_LAYER);
        b5.setBounds(50,50,200,100);
        b4.setBounds(40,40,200,100);
        b3.setBounds(30,30,200,100);
        b2.setBounds(20,20,200,100);
        b1.setBounds(10,10,200,100);
        add(pane,BorderLayout.CENTER);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
