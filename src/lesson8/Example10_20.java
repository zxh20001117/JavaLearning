package lesson8;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class Example10_20{
    public static void main(String args[]){
        new FontWin();
    }
}
class FontWin extends JFrame implements ItemListener{
    JComboBox listFont;
    JTextArea text;
    FontWin(){
        text=new JTextArea(12,12);
        GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontName[]=ge.getAvailableFontFamilyNames();
        listFont=new JComboBox(fontName);
        JPanel pNorth=new JPanel();
        pNorth.add(listFont);
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(text),BorderLayout.CENTER);
        listFont.addItemListener(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setBounds(100,120,300,300);
    }
    public void itemStateChanged(ItemEvent e){
        String name=(String)listFont.getSelectedItem();
        Font f=new Font(name,Font.BOLD,32);
        text.setFont(f);
        text.setText("北京奥运");
    }
}
