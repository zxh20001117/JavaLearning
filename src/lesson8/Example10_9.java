package lesson8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example10_9{
    public static void main(String[] args){
        PoliceWindow policeWin=new PoliceWindow();
    }
}
class PoliceWindow extends JFrame implements ActionListener{
    JTextField titleText;
    JPasswordField passwordText;
    PoliceWindow(){
        titleText=new JTextField(10);
        passwordText=new JPasswordField (10);
        passwordText.setEchoChar('*');
        titleText.addActionListener(this);
        passwordText.addActionListener(this);
        setLayout(new FlowLayout());
        add(titleText);
        add(passwordText);
        setBounds(100,100,150,150);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        JTextField textSource=(JTextField)e.getSource();
        if(textSource==titleText)
            this.setTitle(titleText.getText());
        else if(textSource==passwordText){
            char c[]=passwordText.getPassword();
            titleText.setText(new String(c));
        }
    }
}
