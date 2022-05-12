package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_27{
    public static void main(String args[]){
        new ThreadWin();
    }
}
class ThreadWin extends JFrame implements Runnable,ActionListener{
    Thread moveOrStop;
    JButton start,hang,resume,die;
    JLabel moveLabel;
    boolean move=false,dead=false;
    ThreadWin(){
        moveOrStop=new Thread(this);
        start=new JButton("线程开始");
        hang=new JButton("线程挂起");
        resume=new JButton("线程恢复");
        die=new JButton("线程终止");
        start.addActionListener(this);
        hang.addActionListener(this);
        resume.addActionListener(this);
        die.addActionListener(this);
        moveLabel=new JLabel("线程负责运动我");
        moveLabel.setBackground(Color.red);
        setLayout(new FlowLayout());
        add(start);
        add(hang);
        add(resume);
        add(die);
        add(moveLabel);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            try {  move=true;
                moveOrStop.start();      //启动线程
            }
            catch(Exception event){}
        }
        else if(e.getSource()==hang)
            move=false;
        else if(e.getSource()==resume){
            move=true;
            resumeThread();               //恢复线程
        }
        else if(e.getSource()==die)
            dead=true;
    }
    public void run(){
        while(true){
            while(!move){
                try{  hangThread();          //挂起线程
                }
                catch(InterruptedException e1){}
            }
            int x=moveLabel.getBounds().x;
            int y=moveLabel.getBounds().y;
            y=y+2;
            if(y>=200)
                y=10;
            moveLabel.setLocation(x,y);
            try{ moveOrStop.sleep(200);
            }
            catch(InterruptedException e2){}
            if(dead==true)
                return;                     //终止线程
        }
    }
    public synchronized void hangThread() throws InterruptedException{
        wait();
    }
    public synchronized void  resumeThread(){
        notifyAll();
    }
}
