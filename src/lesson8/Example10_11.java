package lesson8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Example10_11{
    public static void main(String args[]){
        EditWindow win=new EditWindow("窗口");
    }
}
class EditWindow extends JFrame implements ActionListener{
    JMenuBar menubar;
    JMenu menu;
    JSplitPane splitPane;
    JMenuItem itemCopy,itemCut,itemPaste;
    JTextArea text1,text2;
    EditWindow(String s){
        setTitle(s);
        setSize(260,270);
        setLocation(120,120);
        setVisible(true);
        menubar=new JMenuBar();
        menu=new JMenu("编辑");
        itemCopy=new JMenuItem("复制");
        itemCut=new JMenuItem("剪切");
        itemPaste=new JMenuItem("粘贴");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menubar.add(menu);
        setJMenuBar(menubar);
        text1=new JTextArea();
        text2=new JTextArea();
        splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,text1,text2);
        splitPane.setDividerLocation(120);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        add(splitPane,BorderLayout.CENTER);
        validate();
        itemCopy.addActionListener(this);
        itemCut.addActionListener(this);
        itemPaste.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==itemCopy)
            text1.copy();
        else if(e.getSource()==itemCut)
            text1.cut();
        else if(e.getSource()==itemPaste)
            text2.paste();
    }
}

