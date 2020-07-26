package com.caesar_84.jrchat.head_first_java.head_first_java_gui;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70; // Координаты круга
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanelAnimation drawPanel = new MyDrawPanelAnimation();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();

            try {// Немного замедляем процесс
                Thread.sleep(50);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class MyDrawPanelAnimation extends JPanel {
        public void paintComponent(Graphics g) {

            g.setColor(Color.white);// Без этого получается рисунок размытым
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);// Используем постоянно обновленные кооординаты
        }
    }
}
