package experiment8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp8_2 extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JLabel label;
    private JPanel panelLeft, panelRight, panel;
    exp8_2() {
        setTitle("My Swing Program");
        this.setBounds(600,600,1200,800);
        button1 = new JButton("OK");
        button1.setSize(400, 200);
        button1.setFont(new Font("Serif", Font.BOLD, 40));
        button2 = new JButton("Cancel");
        button2.setFont(new Font("Serif", Font.BOLD, 40));
        button2.setSize(400, 200);
        panelLeft = new JPanel();
        panelRight = new JPanel();
        panel = new JPanel();
        panelLeft.setSize(600, 400);
        panelRight.setSize(600, 400);
        panel.add(panelLeft, BorderLayout.WEST);
        panel.add(panelRight, BorderLayout.EAST);

        label = new JLabel("",JLabel.CENTER);
        label.setSize(1200, 400);
        label.setFont(new Font("Serif", Font.BOLD, 40));
        button1.addActionListener(this);
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelLeft.add(button1);
        panelRight.add(button2);
        this.add(panel, BorderLayout.NORTH);
        this.add(label, BorderLayout.CENTER);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Welcome to Swing Program!");
    }

    public static void main(String[] args) {
        new exp8_2();
    }
}
