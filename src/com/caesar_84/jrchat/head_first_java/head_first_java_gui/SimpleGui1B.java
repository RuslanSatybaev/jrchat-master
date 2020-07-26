package com.caesar_84.jrchat.head_first_java.head_first_java_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go() {
        MyDrawImage image = new MyDrawImage();
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, image);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I'have been clicked");
    }

}

