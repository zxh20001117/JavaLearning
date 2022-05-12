package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example10_14{
    public static void main(String args[]){
        new CheckBoxWindow();
    }
}
class CheckBoxWindow extends JFrame implements ItemListener{
    JCheckBox box;
    JLabel imageLabel;
    CheckBoxWindow(){
        box=new JCheckBox("是否显示图像");
        imageLabel=new JLabel(new ImageIcon("e.jpg"));
        imageLabel.setVisible(false);
        add(box,BorderLayout.NORTH);
        add(imageLabel,BorderLayout.CENTER);
        validate();
        box.addItemListener(this);
        setBounds(120,120,260,270);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        JCheckBox box=(JCheckBox)e.getItemSelectable();
        if(box.isSelected())
            imageLabel.setVisible(true);
        else
            imageLabel.setVisible(false);
    }
}
