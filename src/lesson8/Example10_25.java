package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_25{
    public static void main(String args[]){
        Win win=new Win();
    }
}
class Win25 extends JFrame implements KeyListener, FocusListener{
    TextField text[]=new TextField[3];
    JButton b;
    Win25(){
        setLayout(new FlowLayout());
        for(int i=0;i<3;i++){
            text[i]=new TextField(7);
            text[i].addKeyListener(this);  //监视键盘事件
            text[i].addFocusListener(this);//监视焦点事件
            add(text[i]);
        }
        b=new JButton("确定");
        add(b);
        text[0].requestFocusInWindow();
        setBounds(10,10,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyPressed(KeyEvent e){
        TextField t=(TextField)e.getSource();
        if(t.getCaretPosition()>=6)
            t.transferFocus();
    }
    public void keyTyped(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void focusGained(FocusEvent e){
        TextField text=(TextField)e.getSource();
        text.setText(null);
    }
    public void focusLost(FocusEvent e){}
}