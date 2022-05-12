package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_29{
    public static void main(String args[]){
        MVCWin win=new MVCWin();
    }
}
class Lader{
    private double above,bottom,height,area;
    public double  getArea(){
        return (above+bottom)*height/2;
    }
    public void setAbove(double above){
        this.above=above;
    }
    public void setBottom(double bottom){
        this.bottom=bottom;
    }
    public void setHeight(double height){
        this.height=height;
    }
}
class MVCWin extends JFrame implements ActionListener{
    Lader lader;                                 //数据对象
    JTextField textAbove,textBottom,textHeight;      //数据对象的视图
    JTextArea showArea;                         //数据对象的视图
    JButton controlButton;                        //控制器对象
    MVCWin(){
        lader=new Lader();
        textAbove=new JTextField(5);
        textBottom=new JTextField(5);
        textHeight=new JTextField(5);
        showArea=new JTextArea();
        controlButton=new JButton("计算面积");
        JPanel pNorth=new JPanel();
        pNorth.add(new JLabel("上底:"));
        pNorth.add(textAbove);
        pNorth.add(new JLabel("下底:"));
        pNorth.add(textBottom);
        pNorth.add(new JLabel("高:"));
        pNorth.add(textHeight);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER);
        setBounds(100,100,630,160);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        try{   double a=Double.parseDouble(textAbove.getText().trim());
            double b=Double.parseDouble(textBottom.getText().trim());
            double c=Double.parseDouble(textHeight.getText().trim());
            lader.setAbove(a) ;          //更新数据
            lader.setBottom(b);
            lader.setHeight(c);
            showArea.append("梯形的面积:"+lader.getArea()+"\n");//更新视图
        }
        catch(Exception ex){
            showArea.append("\n"+ex+"\n");
        }
    }
}
