package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_22{
    public static void main(String args[]){
        new MouseWindow();
    }
}
class MouseWindow extends JFrame implements MouseListener{
    JButton button;
    JTextArea textArea;
    MouseWindow(){
        setLayout(new FlowLayout());
        addMouseListener(this);
        button=new JButton("我是按钮");
        button.addMouseListener(this);
        textArea=new JTextArea(8,18);
        add(button);
        add(new JScrollPane(textArea));
        setBounds(100,100,350,280);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mousePressed(MouseEvent e){
        textArea.append("\n鼠标按下,位置:"+"("+e.getX()+","+e.getY()+")");
    }
    public void mouseReleased(MouseEvent e){
        if(e.getSource()==button)
            textArea.append("\n在按钮上鼠标松开,位置:"+"("+e.getX()+","+e.getY()+")");
    }
    public void mouseEntered(MouseEvent e){
        if(e.getSource()==button)
            textArea.append("\n鼠标进入按钮,位置:"+"("+e.getX()+","+e.getY()+")");
    }
    public void mouseExited(MouseEvent e){}
    public void mouseClicked(MouseEvent e){
        if(e.getModifiers()==InputEvent.BUTTON3_MASK&&e.getClickCount()>=2)
            textArea.setText("您双击了鼠标右键");
    }
}