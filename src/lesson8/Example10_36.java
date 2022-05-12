package lesson8;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Example10_36{
    public static void main(String args[]){
        MDIWindow win=new MDIWindow();
    }
}
class MyInternalFrame extends JInternalFrame{
    JTextArea text;
    MyInternalFrame(String title){
        super(title,true,true,true,true);
        text=new JTextArea();
        add(new JScrollPane(text),BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addInternalFrameListener(new InternalFrameAdapter (){
            public void internalFrameActivated(InternalFrameEvent e){
                setLayer(JDesktopPane.DRAG_LAYER);
            }
            public void internalFrameDeactivated(InternalFrameEvent e){
                setLayer(JDesktopPane.DEFAULT_LAYER);
            }
        });
    }
    public JTextArea getJTextArea(){
        return text;
    }
}
class MDIWindow extends JFrame implements ActionListener{
    JDesktopPane desk;                //用来添加内部窗体的桌面容器
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemNew,itemCopy,itemCut,itemPaste;
    MDIWindow(){
        desk=new JDesktopPane();
        desk.setDesktopManager(new DefaultDesktopManager());
        add(desk,BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menubar=new JMenuBar();
        menu=new JMenu("编辑");
        itemNew=new JMenuItem("新建");
        itemCopy=new JMenuItem("复制");
        itemCut=new JMenuItem("剪切");
        itemPaste=new JMenuItem("粘贴");
        itemNew.addActionListener(this);
        itemCopy.addActionListener(this);
        itemCut.addActionListener(this);
        itemPaste.addActionListener(this);
        menu.add(itemNew);
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menubar.add(menu);
        setJMenuBar(menubar);
        setBounds(100,100,300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==itemNew){
            JInternalFrame a[]=desk.getAllFrames();
            for(int i=0;i<a.length;i++)
                desk.setLayer(a[i],JDesktopPane.DEFAULT_LAYER);
            JInternalFrame newInternalFrame=new MyInternalFrame("无标题");//创建一个内部窗体
            newInternalFrame.setBounds(10,10,300,300);
            newInternalFrame.setVisible(true);
            desk.add(newInternalFrame,JDesktopPane.DRAG_LAYER);
        }
        if(e.getSource()==itemCopy){
            MyInternalFrame internalFrame=(MyInternalFrame)desk.getSelectedFrame();
            JTextArea text=internalFrame.getJTextArea();
            text.copy();
        }
        else if(e.getSource()==itemCut){
            MyInternalFrame internalFrame=(MyInternalFrame)desk.getSelectedFrame();
            JTextArea text=internalFrame.getJTextArea();
            text.cut();
        }
        else if(e.getSource()==itemPaste){
            MyInternalFrame internalFrame=(MyInternalFrame)desk.getSelectedFrame();
            JTextArea text=internalFrame.getJTextArea();
            text.paste();
        }
    }
}
