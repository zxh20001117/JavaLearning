package lesson8;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Example10_34{
    public static void main(String args[]){
        new ColorWin("带颜色对话框的窗口");
    }
}
class ColorWin extends JFrame implements ActionListener{
    JButton buttonOpen,showColor;
    ColorWin(String s){
        setTitle(s);
        buttonOpen=new JButton("打开颜色对话框");
        showColor=new JButton();
        buttonOpen.addActionListener(this);
        add(buttonOpen,BorderLayout.NORTH);
        add(showColor,BorderLayout.CENTER);
        setBounds(60,60,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Color newColor=JColorChooser.showDialog(this,"调色板",showColor.getBackground());
        if(newColor!=null)
            showColor.setBackground(newColor);
    }
}
