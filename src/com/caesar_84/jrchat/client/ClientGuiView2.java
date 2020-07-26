package com.caesar_84.jrchat.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

public class ClientGuiView2 {
    private final ClientGuiController2 controller2;

    int counter = 10;
    Boolean isIt = false;


    private final JFrame frame = new JFrame("Chat");// Создаем фрейм
    private final JTextArea messages = new JTextArea(10, 30);

    private final JPanel panelEast = new JPanel();
    private final JTextArea users = new JTextArea(20, 20);
    private final JLabel timerName = new JLabel("Timer");
    private final JLabel countdown = new JLabel("00 : 30 : 00");

    private final JPanel panelEastSouth = new JPanel();
    private final JButton buttonStart = new JButton("Start");
    private final JButton buttonStop = new JButton("Stop");

    private final JPanel panel = new JPanel();
    private final JTextField textField = new JTextField(30);
    private final JButton buttonDisable = new JButton("Отключиться");
    private final JButton buttonConnect = new JButton("Подключиться");
    private final JButton buttonSend = new JButton("Send");

    private JTextArea textArea1;

    public ClientGuiView2(ClientGuiController2 controller2) {
        this.controller2 = controller2;
        initView();
    }

    //метод, инициализирующий графический интерфейс клиентского приложения
    private void initView() {

        timerName.setFont(new Font("Tahoma", 0, 18));


        messages.setEditable(false);
        users.setEditable(false);

        frame.getContentPane().add(new JScrollPane(messages), BorderLayout.CENTER);

        panel.add(textField);
        panel.add(buttonSend);
        panel.add(buttonConnect);
        panel.add(buttonDisable);

        panelEast.add(users);
        panelEast.add(timerName);
        panelEast.add(countdown);
        countdown.setBackground(Color.green);

        panelEast.add(buttonStart);
        panelEast.add(buttonStop);

        panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
        frame.add(panelEast, BorderLayout.EAST);

        panelEastSouth.setLayout(new BoxLayout(panelEastSouth, BoxLayout.X_AXIS));
        frame.add(new JScrollPane(panel), BorderLayout.SOUTH);
        frame.pack();

        // Эта строка завершает работу программы при закрытии окна
        // (если не добавить ее, то приложение будеть висеть вечно)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);// Делаем фрейм видимым


        buttonStart.addActionListener(e -> {// Здесь логика отправка через enter
            controller2.sendTextMessage(textField.getText());
            textField.setText("");

        });

        textField.addActionListener(e -> {// Здесь логика отправка через enter
            controller2.sendTextMessage(textField.getText());
            textField.setText("");

        });

        buttonDisable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller2.disableClient();
            }
        });

        //---- btnStart ----

        buttonStart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnStartMouseClicked(e);
            }
        });

        //---- btnStop ----

        buttonStop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnStopMouseClicked(e);
            }
        });

    }

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        java.util.Timer timer = new Timer(); //new timer
        counter = 50; //setting the counter to 10 sec
        TimerTask task = new TimerTask() {
            public void run() {
                countdown.setText(Integer.toString(counter)); //the timer lable to counter.
                counter--;

                if (counter == -1) {
                    timer.cancel();
                    controller2.disableClient();
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


    //метод обновляющий список имен подлючившихся пользователей
    protected void refreshListUsers(Set<String> listUsers) {
        users.setText("");
        if (controller2.isConnect()) {
            StringBuilder text = new StringBuilder("Список пользователей:\n");
            for (String user : listUsers) {
                text.append(user + "\n");
            }
            users.append(text.toString());
        }
    }

    public String getServerAddress() {
        return JOptionPane.showInputDialog(
                frame,
                "Введите адрес сервера:",
                "Конфигурация клиента",
                JOptionPane.QUESTION_MESSAGE);
    }

    public int getServerPort() {
        while (true) {
            String port = JOptionPane.showInputDialog(
                    frame,
                    "Введите порт сервера:",
                    "Конфигурация клиента",
                    JOptionPane.QUESTION_MESSAGE);
            try {
                return Integer.parseInt(port.trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Был введен некорректный порт сервера. Попробуйте еще раз.",
                        "Конфигурация клиента",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public String getUserName() {
        return JOptionPane.showInputDialog(
                frame,
                "Введите ваше имя:",
                "Конфигурация клиента",
                JOptionPane.QUESTION_MESSAGE);
    }

    public void notifyConnectionStatusChanged(boolean clientConnected) {
        textField.setEditable(clientConnected);
        if (clientConnected) {
            JOptionPane.showMessageDialog(
                    frame,
                    "Соединение с сервером установлено",
                    "Чат",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    frame,
                    "Клиент не подключен к серверу",
                    "Чат",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    public void refreshMessages() {
        messages.append(controller2.getModel().getNewMessage() + "\n");
    }

    public void refreshUsers() {
        ClientGuiModel model = controller2.getModel();
        StringBuilder sb = new StringBuilder();
        for (String userName : model.getAllUserNames()) {
            sb.append(userName).append("\n");
        }
        users.setText(sb.toString());
    }

    //вызывает окно ошибки с заданным текстом
    protected void errorDialogWindow(String text) {
        JOptionPane.showMessageDialog(
                frame, text,
                "Notification", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
