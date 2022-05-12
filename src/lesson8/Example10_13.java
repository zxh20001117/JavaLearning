package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example10_13{
    public static void main(String args[]){
        new ImageWin();
    }
}
class ImageWin extends JFrame{
    JButton button;
    int i=0;
    Icon icon1,icon2;
    ImageWin(){
        icon1=new ImageIcon("a.jpg");
        icon2=new ImageIcon("b.jpg");
        button=new JButton(icon1);
        button.setMnemonic('d') ;
        add(button,BorderLayout.CENTER);
        validate();
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                i=(i+1)%2;
                if(i==1)  button.setIcon(icon2);
                else     button.setIcon(icon1);
            }
        });
        setBounds(100,100,300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

