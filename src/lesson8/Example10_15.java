package lesson8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class Example10_15{
    public static void main(String args[]){
        new ReadFileWindow();
    }
}
class ReadFileWindow extends JFrame implements ItemListener{
    JComboBox list;
    JTextArea showText;
    ReadFileWindow(){
        showText=new JTextArea(12,12);
        list=new JComboBox();
        list.addItem("Example10_1.java");
        list.addItem("Example10_2.java");
        add(list,BorderLayout.NORTH);
        add(new JScrollPane(showText));
        validate();
        list.addItemListener(this);
        setBounds(120,120,500,370);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        String fileName=(list.getSelectedItem()).toString();
        File readFile=new File(fileName);
        showText.setText(null);
        try{   FileReader inOne=new FileReader(readFile);
            BufferedReader inTwo= new BufferedReader(inOne);
            String s=null;
            int i=0;
            while((s=inTwo.readLine())!=null)
                showText.append("\n"+s);
            inOne.close();
            inTwo.close();
        }
        catch(IOException ex){
            showText.setText(ex.toString());
        }
    }
}
