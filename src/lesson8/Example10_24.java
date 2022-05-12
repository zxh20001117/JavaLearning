package lesson8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Example10_24{
    public static void main(String args[]){
        new JPopupMenuWindow();
    }
}
class JPopupMenuWindow extends JFrame implements ActionListener{
    JPopupMenu menu;
    JMenuItem itemCopy,itemCut,itemPaste;
    JTextArea text;
    JPopupMenuWindow(){
        menu=new JPopupMenu();
        itemCopy=new JMenuItem("复制");
        itemCut=new JMenuItem("剪切");
        itemPaste=new JMenuItem("粘贴");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        text=new JTextArea();
        text.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                if(e.getModifiers()==InputEvent.BUTTON3_MASK)
                    menu.show(text,e.getX(),e.getY());
            }
        });
        add(new JScrollPane(text),BorderLayout.CENTER);
        itemCopy.addActionListener(this);
        itemCut.addActionListener(this);
        itemPaste.addActionListener(this);
        setBounds(120,100,220,220);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==itemCopy)
            text.copy();
        else if(e.getSource()==itemCut)
            text.cut();
        else if(e.getSource()==itemPaste)
            text.paste();
    }
}