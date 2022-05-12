package lesson8;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Example10_32{
    public static void main(String args[]){
        MyDialog dialog=new MyDialog(null,"我有模式",true);
        dialog.setVisible(true); //对话框激活状态
        if(dialog.getMessage()==MyDialog.YES)   //如果单击了对话框的"yes"按钮
            System.out.println("你单击了对话框的yes按钮");
        else if(dialog.getMessage()==MyDialog.NO)
            System.out.println("你单击了对话框的No按钮");
        else if(dialog.getMessage()==MyDialog.CLOSE)
            System.out.println("你单击了对话框的关闭图标");
        System.exit(0);
    }
}
class MyDialog extends JDialog implements ActionListener{
    static final int YES=1,NO=0,CLOSE=-1;
    int message=10;
    Button yes,no;
    MyDialog(JFrame f,String s,boolean b){
        super(f,s,b);
        setLayout(new FlowLayout());
        yes=new Button("Yes");
        yes.addActionListener(this);
        no=new Button("No");
        no.addActionListener(this);
        add(yes);
        add(no);
        setBounds(60,60,100,100);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                message=CLOSE;
                setVisible(false);
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==yes){
            message=YES;
            setVisible(false);
        }
        else if(e.getSource()==no){
            message=NO;
            setVisible(false);
        }
    }
    public int getMessage(){
        return message;
    }
}
