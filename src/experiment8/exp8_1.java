package experiment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp8_1 extends JFrame implements ActionListener {
    JButton button;
    JPanel panel;
    JLabel label;
    public exp8_1() {
        setTitle("Subject");
        this.setBounds(600,600,300,200);
        button = new JButton("Whick one?");
        button.setSize(300,100);
        button.addActionListener(this);
        panel = new JPanel();
        panel.setSize(600,200);
        panel.add(button, BorderLayout.CENTER);
        this.add(panel, BorderLayout.NORTH);
        label = new JLabel("",JLabel.CENTER);
        label.setSize(600,400);
        this.add(label, BorderLayout.CENTER);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Java Programming!");
        }
    }

    public static void main(String[] args) {
        new exp8_1();
    }
}
