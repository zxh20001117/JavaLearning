package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_26{
    public static void main(String args[]){
        KeyWin win=new KeyWin();
    }
}
class KeyWin extends JFrame implements KeyListener{
    JTextArea text;
    KeyWin(){
        setLayout(new FlowLayout());
        text=new JTextArea(30,20);
        text.addKeyListener(this);
        add(new JScrollPane(text),BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10,10,300,300);
        setVisible(true);
    }
    public void keyTyped(KeyEvent e){
        JTextArea te=(JTextArea)e.getSource();
        if(e.getModifiers()==InputEvent.CTRL_MASK&&e.getKeyCode()==KeyEvent.VK_X)
            te.cut();
        else if(e.getModifiers()==InputEvent.CTRL_MASK&&e.getKeyCode()==KeyEvent.VK_C)
            te.copy();
        else if(e.getModifiers()==InputEvent.CTRL_MASK&&e.getKeyCode()==KeyEvent.VK_V)
            te.paste();
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
