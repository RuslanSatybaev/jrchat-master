package com.caesar_84.jrchat.head_first_java.head_first_java_swing;

import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.white);


        JButton button = new JButton("shock me");
        JButton buttonSecond = new JButton("bliss");

        panel.add(button);
        panel.add(buttonSecond);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
