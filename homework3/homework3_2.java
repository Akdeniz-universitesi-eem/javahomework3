package javaHomework.homework3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homework3_2 extends JFrame {
    private JLabel zar1Label, zar2Label;
    private JButton atButton;
    private int zar1, zar2;

    public homework3_2() {
        setTitle("Çift Zar Simülasyonu");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        zar1Label = new JLabel();
        zar2Label = new JLabel();

        atButton = new JButton("Zarları At");
        atButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zar1 = (int) (Math.random() * 6) + 1;
                zar2 = (int) (Math.random() * 6) + 1;
                zar1Label.setIcon(new ImageIcon("zar" + zar1 + ".png"));
                zar2Label.setIcon(new ImageIcon("zar" + zar2 + ".png"));
            }
        });

        add(zar1Label);
        add(zar2Label);
        add(atButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                homework3_2 zarSimulasyonu = new homework3_2();
                zarSimulasyonu.setVisible(true);
            }
        });
    }
}
