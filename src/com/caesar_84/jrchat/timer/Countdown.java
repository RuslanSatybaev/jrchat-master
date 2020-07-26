package com.caesar_84.jrchat.timer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Timer;

public class Countdown {
    private final JLabel label = new JLabel("...");
    private final JButton button = new JButton("Click me");
    private final Timer timer;
    private int count = 90;

    public Countdown() {
        timer = new Timer(1000, e -> {
            if (count > 0) {
                label.setText(String.valueOf(count--));
            } else {
                ((Timer) (e.getSource())).stop();
                count = 90;
                button.setEnabled(true);
            }
        });
        timer.setInitialDelay(0);

        button.addActionListener(e -> {
            timer.start();
            button.setEnabled(false);
        });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.PAGE_START);
        frame.add(button, BorderLayout.PAGE_END);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Countdown();
    }
}