/*
 * Created by JFormDesigner on Sun Jul 05 05:11:56 ALMT 2020
 */

package com.caesar_84.jrchat.client;

import com.caesar_84.jrchat.timer.timerdo.TimerDo;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Ruslan Satybaev
 */
public class Chat extends JPanel {
    public Chat() {
        initComponents();
    }

    public static void main(String args[]) {

        JFrame frame = new JFrame("Chat");
        JScrollPane scrollPane1 = new JScrollPane();
        JTextArea textArea1 = new JTextArea();
        JScrollPane scrollPane2 = new JScrollPane();
        JTextArea textArea2 = new JTextArea();
        JTextField textField1 = new JTextField();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();
        JButton button5 = new JButton();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(scrollPane1);
        frame.getContentPane().add(scrollPane2);
        frame.getContentPane().add(textArea1);
        frame.getContentPane().add(textArea2);
        frame.getContentPane().add(textField1);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.getContentPane().add(button3);
        frame.getContentPane().add(button4);
        frame.getContentPane().add(button5);
        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(label3);
        frame.getContentPane().add(label4);
        frame.getContentPane().add(label5);
        frame.getContentPane().add(label6);

        frame.setSize(100,100);
        frame.setVisible(true);
        frame.pack();


    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Ruslan Satybaev
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        textField1 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
                javax.swing.border.EmptyBorder(0, 0, 0, 0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax
                .swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java
                .awt.Font("Dia\u006cog", java.awt.Font.BOLD, 12), java.awt
                .Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.
                PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("bord\u0065r".
                        equals(e.getPropertyName())) throw new RuntimeException();
            }
        });

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(textArea2);
        }

        //---- label1 ----
        label1.setText("       Timer");

        //---- label2 ----
        label2.setText(":");

        //---- button1 ----
        button1.setText("Start");

        //---- button2 ----
        button2.setText("Stop");

        //---- button3 ----
        button3.setText("Send");

        //---- button4 ----
        button4.setText("Connect");

        //---- button5 ----
        button5.setText("Dicconnect");

        //---- label3 ----
        label3.setText(":");

        //---- label4 ----
        label4.setText("00");

        //---- label5 ----
        label5.setText("00");

        //---- label6 ----
        label6.setText("00");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup()
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(41, 41, 41)
                                                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(button1)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(button2))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(button3)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(button4))
                                                                        .addComponent(button5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(23, 23, 23))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup()
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(label5)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(label2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(label6)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(label4)
                                                                .addGap(72, 72, 72))
                                                        .addComponent(scrollPane2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(scrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(label1)
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(label4)
                                                        .addComponent(label6)
                                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label5)
                                                        .addComponent(label3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(button1)
                                                        .addComponent(button2))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(button3)
                                                        .addComponent(button4))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(button5))
                                        .addComponent(textField1))
                                .addGap(0, 2, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ruslan Satybaev
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    private JTextField textField1;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
