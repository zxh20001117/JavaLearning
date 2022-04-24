package lesson8;

import java.awt.*;
import javax.swing.*;
public class Example10_3{
    public static void main(String[] args){
        new WindowFlow("FlowLayout布局窗口");
    }
}
class WindowFlow extends JFrame{
    JButton[] b;
    WindowFlow(String s){
        setTitle(s);
        b=new JButton[10];
        FlowLayout flow=new FlowLayout();
        flow.setAlignment(FlowLayout.LEFT);
        flow.setHgap(2);
        flow.setVgap(8);
        setLayout(flow);
        for(int i=0;i<b.length;i++){
            b[i]=new JButton(""+i);
            add(b[i]);
            if(i==b.length-1)
                b[i].setPreferredSize(new Dimension(80,40));
        }
        validate();
        setBounds(100,100,200,160);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
