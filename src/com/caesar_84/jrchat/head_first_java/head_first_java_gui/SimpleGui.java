package com.caesar_84.jrchat.head_first_java.head_first_java_gui;

import javax.swing.*;

public class SimpleGui {
    public static void main(String[] args) {
         JFrame frame = new JFrame();
         JButton button = new JButton("click me");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(button);
         frame.setSize(100,100);
         frame.setVisible(true);
    }
}
