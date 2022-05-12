package lesson8;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import javax.swing.event.*;

public class Example10_17{
    public static void main(String args[]){
        new TreeWin();
    }
}
class Student{
    String name;
    double score;
    Student(String name,double score){
        this.name=name;
        this.score=score;
    }
    public String toString(){
        return name;
    }
}
class TreeWin extends JFrame implements TreeSelectionListener{
    JTree tree;
    JTextArea showText;
    TreeWin(){
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("大学");  //根节点
        DefaultMutableTreeNode node=new DefaultMutableTreeNode("学生"); //节点
        DefaultMutableTreeNode nodeson1=
                new DefaultMutableTreeNode(new Student("张三",99));            //节点
        DefaultMutableTreeNode nodeson2=
                new DefaultMutableTreeNode(new Student("李四",88));            //节点
        DefaultMutableTreeNode nodeson3=
                new DefaultMutableTreeNode(new Student("刘五",77));           //节点
        root.add(node);                                            //确定节点之间的关系
        node.add(nodeson1);                                        //确定节点之间的关系
        node.add(nodeson2);
        node.add(nodeson3);
        tree=new JTree(root);                                      //用root做根的树组件
        tree.addTreeSelectionListener(this);                          //监视树组件上的事件
        showText=new JTextArea();
        setLayout(new GridLayout(1,2));
        add(new JScrollPane(tree));
        add(new JScrollPane(showText));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBounds(80,80,300,300);
        validate();
    }
    public void valueChanged(TreeSelectionEvent e){
        DefaultMutableTreeNode node=
                (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
        if(node.isLeaf()){
            Student s=(Student)node.getUserObject();                //得到节点中存放的对象
            showText.append(s.name+","+s.score+"\n");
        }
        else{
            showText.setText(null);
        }
    }
}

