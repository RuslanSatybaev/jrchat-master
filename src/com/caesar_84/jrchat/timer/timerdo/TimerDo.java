
package com.caesar_84.jrchat.timer.timerdo;

import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.GroupLayout;


public class TimerDo extends javax.swing.JFrame {

    //My variables:
    int counter = 10;
    Boolean isIt = false;

    public TimerDo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Ruslan Satybaev
    private void initComponents() {
        timerName = new JLabel();
        timeLeft = new JLabel();
        btnStop = new JButton();
        btnStart = new JButton();
        textField1 = new JTextField();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        scrollPane2 = new JScrollPane();
        textArea2 = new JTextArea();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- timerName ----
        timerName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        timerName.setText("Timer : ");

        //---- timeLeft ----
        timeLeft.setFont(new Font("Tahoma", Font.BOLD, 12));
        timeLeft.setText("00:00");

        //---- btnStop ----
        btnStop.setText("Stop");
        btnStop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnStopMouseClicked(e);
            }
        });

        //---- btnStart ----
        btnStart.setText("Start");
        btnStart.setActionCommand("Start");
        btnStart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnStartMouseClicked(e);
            }
        });

        //---- button1 ----
        button1.setText("Send");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(textArea2);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                        .addComponent(textField1, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(btnStart)
                            .addGap(18, 18, 18)
                            .addComponent(btnStop))
                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(timerName)
                            .addGap(18, 18, 18)
                            .addComponent(timeLeft)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(timeLeft)
                                .addComponent(timerName))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnStart)
                                .addComponent(btnStop))
                            .addGap(12, 12, 12))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(scrollPane1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(25, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        Timer timer = new Timer(); //new timer
        counter = 100; //setting the counter to 10 sec
        TimerTask task = new TimerTask() {
            public void run() {
                timeLeft.setText(Integer.toString(counter)); //the timer lable to counter.
                counter--;
                if (counter == -1) {
                    timer.cancel();
                } else if (isIt) {
                    timer.cancel();
                    isIt = false;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000); // =  timer.scheduleAtFixedRate(task, delay, period);
    }//GEN-LAST:event_btnStartMouseClicked

    private void btnStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMouseClicked
        isIt = true; // changing the boolean isIt to true, which will stop the timer.
    }//GEN-LAST:event_btnStopMouseClicked


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimerDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimerDo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Ruslan Satybaev
    private JLabel timerName;
    private JLabel timeLeft;
    private JButton btnStop;
    private JButton btnStart;
    private JTextField textField1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JScrollPane scrollPane2;
    private JTextArea textArea2;
    // End of variables declaration//GEN-END:variables
}