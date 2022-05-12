package lesson8;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.regex.*;
public class Example10_33{
    public static void main(String args[]){
        new Dwindow();
    }
}
class Dwindow extends JFrame implements ActionListener{
    JButton inputNumber;
    JTextArea save;
    Pattern p;                         	//模式对象
    Matcher m;                       	//匹配对象
    Dwindow(){
        inputNumber=new JButton("单击按钮打开输入对话框");
        inputNumber.addActionListener(this);
        save=new JTextArea(12,16);
        add(inputNumber,BorderLayout.NORTH);
        add(new JScrollPane(save),BorderLayout.CENTER);
        p=Pattern.compile("\\D+");   //创建模式对象(含有非数字字符的模式)
        setBounds(60,60,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String  str=JOptionPane.showInputDialog
                (null,"请输入数字字符序列","输入对话框",JOptionPane.INFORMATION_MESSAGE);
        if(str!=null){
            m=p.matcher(str);
            while(m.find()){
                JOptionPane.showMessageDialog
                        (this,"您输入了非法字符","消息对话框",JOptionPane.WARNING_MESSAGE);
                str=JOptionPane.showInputDialog(null,"请输入数字字符序列");
                m=p.matcher(str);
            }
            int n=JOptionPane.showConfirmDialog(this,"确认正确吗？","确认对话框",
                    JOptionPane.YES_NO_OPTION );
            if(n==JOptionPane.YES_OPTION)
                save.append("\n"+str);
        }
    }
}
