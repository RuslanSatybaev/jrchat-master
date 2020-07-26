package com.caesar_84.jrchat.head_first_java.head_first_java_gui;

import javax.swing.*;
import java.awt.*;

public class MyDrawImage extends JPanel {
    public void paintComponent(Graphics graphics) {
        Image images = new ImageIcon("D:\\Downloadss\\unnamed.jpg").getImage();
        graphics.drawImage(images, 3, 4, this);
    }
}
