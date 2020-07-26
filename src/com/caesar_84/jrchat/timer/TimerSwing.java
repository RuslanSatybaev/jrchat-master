package com.caesar_84.jrchat.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TimerSwing extends javax.swing.JFrame {
    private JLabel lblSec;
    private JLabel lblMin;
    private JComboBox cboxMin;
    private JComboBox cboxSec;
    private JButton btnStart;
    private JButton btnStop;

    int min,sec;
    Timer timer;
    public TimerSwing() {
            initComponents();
        for (int i = 0; i < 24; i++) {
            cboxMin.addItem(i);
        }
        for (int i = 0; i < 60; i++) {
            cboxSec.addItem(i);
        }
    }
    private void initComponents() {
        lblMin = new JLabel();
        lblSec = new JLabel();
        btnStop = new JButton();
        btnStart = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lblMin.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        lblMin.setText("00");

        lblSec.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        lblSec.setText("00");

        btnStop.setText("Stop");
        btnStop.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnStop(evt);
            }
        });

        btnStart.setText("Start");
        btnStart.setActionCommand("Start");
        btnStart.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnStart(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnStart)
                                                .addGap(47, 47, 47)
                                                .addComponent(btnStop))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMin)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblSec)))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblMin)
                                        .addComponent(lblSec))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnStart)
                                        .addComponent(btnStop))
                                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStop(MouseEvent evt) {
    }

    private void btnStart(MouseEvent evt) {
        
    }


    @SuppressWarnings("unchecked")
    private void cboxMinActionPerformed(java.awt.event.ActionEvent event) {
        lblMin.setText(" " + cboxMin.getSelectedItem());
        min=Integer.parseInt(lblMin.getText());
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimerSwing().setVisible(true);
            }
        });
    }
}
