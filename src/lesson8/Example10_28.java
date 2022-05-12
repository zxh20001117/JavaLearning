package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_28{
    public static void main(String args[]){
        TimeWin Win=new TimeWin();
    }
}
class TimeWin extends JFrame implements ActionListener{
    JButton bStart,bStop,bContinue;
    JLabel showWord;
    Timer time;
    int number=0,start=1;
    char [] chinaWord;
    TimeWin(){
        time=new Timer(1000,this);//TimeWin对象做计时器的监视器。
        showWord=new JLabel();
        showWord.setHorizontalAlignment(JLabel.CENTER);
        showWord.setFont(new Font("宋体",Font.BOLD,58));
        bStart=new JButton("开始");
        bStop=new JButton("暂停");
        bContinue=new JButton("继续");
        bStart.addActionListener(this);
        bStop.addActionListener(this);
        bContinue.addActionListener(this);
        JPanel pNorth=new JPanel();
        pNorth.add(bStart);
        pNorth.add(bStop);
        pNorth.add(bContinue);
        add(pNorth,BorderLayout.NORTH);
        add(showWord,BorderLayout.CENTER);
        setSize(300,180);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chinaWord=new char[100];
        for(int k=0,i='我';k<chinaWord.length;i++,k++)
            chinaWord[k]=(char)i;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==time){
            showWord.setText(""+chinaWord[number]);
            number++;
            if(number==chinaWord.length-1)
                number=0;
        }
        else if(e.getSource()==bStart)
            time.start();
        else if(e.getSource()==bStop)
            time.stop();
        else if(e.getSource()==bContinue)
            time.restart();
    }
}