package lesson8;

import javax.swing.*;
class E {
    public static void main(String[] args) {
        JFrame frame1 = new JFrame("第一个窗口");
        JFrame frame2 = new JFrame("第二个窗口");
        frame1.setBounds(60,100,188,108);    //设置窗口在屏幕上的位置及大小
        frame2.setBounds(260,100,188,108);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //释放当前窗口
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //退出程序
    }
}
