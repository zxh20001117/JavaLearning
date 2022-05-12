package lesson8;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Example10_35{
    public static void main(String args[]){
        new FileWindow();
    }
}
class FileWindow extends JFrame implements ActionListener{
    JButton buttonFile;
    JTextArea text;
    JFileChooser fileChooser;
    FileWindow(){
        fileChooser=new JFileChooser("c:/");
        buttonFile=new JButton("打开文件");
        text=new JTextArea("显示文件内容");
        buttonFile.addActionListener(this);
        add(buttonFile,BorderLayout.NORTH);
        add(new JScrollPane(text),BorderLayout.CENTER);
        setBounds(60,60,300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        text.setText(null);
        int n=fileChooser.showOpenDialog(null);
        if(n==JFileChooser.APPROVE_OPTION){
            File file=fileChooser.getSelectedFile();
            try{  FileReader readfile=new FileReader(file);
                BufferedReader in=new BufferedReader(readfile);
                String s=null;
                while((s=in.readLine())!=null)
                    text.append(s+"\n");
            }
            catch(IOException ee){}
        }
    }
}
