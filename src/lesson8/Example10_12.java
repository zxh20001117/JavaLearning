package lesson8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.regex.*;
import javax.swing.event.*;
public class Example10_12{
    public static void main(String args[]){
        new PatternWindow();
    }
}
class PatternWindow extends JFrame implements DocumentListener,ActionListener{
    JTextArea inputText,showText;
    JTextField patternText;
    Pattern p;                  //模式对象
    Matcher m;                //匹配对象
    PatternWindow(){
        inputText=new JTextArea();
        showText=new JTextArea();
        patternText=new JTextField("[^\\s\\d\\p{Punct}]+");
        patternText.addActionListener(this);
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(1,2));
        panel.add(new JScrollPane(inputText));
        panel.add(new JScrollPane(showText));
        add(panel,BorderLayout.CENTER);
        add(patternText,BorderLayout.NORTH);
        validate();
        (inputText.getDocument()).addDocumentListener(this);   //向文档注册监视器
        setBounds(120,120,260,270);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void changedUpdate(DocumentEvent e){      //接口方法
        hangdleText();                              //调用后面的hangdleText()方法
    }
    public void removeUpdate(DocumentEvent e){      //接口方法
        changedUpdate(e);
    }
    public void insertUpdate(DocumentEvent e){        //接口方法
        changedUpdate(e);
    }
    public void hangdleText(){
        showText.setText(null);
        String s=inputText.getText();
        p=Pattern.compile(patternText.getText());        //初始化模式对象
        m=p.matcher(s);
        while(m.find()){
            showText.append("从"+m.start()+"到"+m.end()+":");
            showText.append(m.group()+":\n");
        }
    }
    public void actionPerformed(ActionEvent e){
        hangdleText();
    }
}
