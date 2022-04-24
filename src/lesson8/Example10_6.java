package lesson8;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Example10_6{
    public static void main(String args[]){
        new WindowBox();
    }
}
class WindowBox extends JFrame{
    Box baseBox,boxV1,boxV2;
    WindowBox(){
        boxV1=Box.createVerticalBox();
        boxV1.add(new JLabel("输入您的姓名"));
        boxV1.add(Box.createVerticalStrut(8));
        boxV1.add(new JLabel("输入email"));
        boxV1.add(Box.createVerticalStrut(8));
        boxV1.add(new JLabel("输入您的职业"));
        boxV2=Box.createVerticalBox();
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));
        boxV2.add(new JTextField(16));
        boxV2.add(Box.createVerticalStrut(8));
        boxV2.add(new JTextField(16));
        baseBox=Box.createHorizontalBox();
        baseBox.add(boxV1);
        baseBox.add(Box.createHorizontalStrut(10));
        baseBox.add(boxV2);
        setLayout(new FlowLayout());
        add(baseBox);
        validate();
        setBounds(120,125,200,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
