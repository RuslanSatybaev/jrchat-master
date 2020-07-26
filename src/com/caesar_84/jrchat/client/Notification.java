package com.caesar_84.jrchat.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notification {

    public Notification() {

        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("Notification");
        frame.setContentPane(new Notification().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    private JPanel panelMain;
    private JButton button_msg;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
