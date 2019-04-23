package ru.geekbrains.lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Window extends JFrame {
//    TextListener textListener = new TextListener();

    public Window() {
        setTitle("Чат");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 200, 600, 600);
        setLayout(new BorderLayout());

        // Панель для ввода текста и конопки Send
        JPanel jText = new JPanel();
        add(jText, BorderLayout.SOUTH);
        jText.setLayout(new BorderLayout());
        JButton send = new JButton("Send");
//        send.setSize(10,10); не понятно почему при постановке данной команды, размер кнопки не изменился на заданный?
        jText.add(send, BorderLayout.SOUTH);
        JTextField textInputWindow = new JTextField();
        textInputWindow.setBackground(Color.lightGray);
        JScrollPane textInputWindowScroll = new JScrollPane(textInputWindow);
        jText.add(textInputWindowScroll, BorderLayout.CENTER);

        // Панель для чата
        JPanel win = new JPanel();
        add(win, BorderLayout.CENTER);
        win.setLayout(new BorderLayout());
        JTextArea chatWin = new JTextArea();
        chatWin.setBackground(Color.white);
        chatWin.setEnabled(false); // Запрет ввода данных в поле TextArea
        JScrollPane chatWinScroll = new JScrollPane(chatWin);
        win.add(chatWinScroll);
        setVisible(true);

//        Задаем действие кнопки Set
        send.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    chatWin.append(String.format(textInputWindow.getText()) + "\n");
                    textInputWindow.setText(null);
                    textInputWindow.setCaretPosition(0);

                } catch (Exception ex) {
                    System.out.println("Ошибка ввода данных");
                }
            }
        });

//        Задаем действие для Enter
        textInputWindow.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    chatWin.append(String.format(textInputWindow.getText()) + "\n");
//                    textInputWindow.requestFocus();  Не нашел метод фокусирующий каретку после нажатия конопи Set снова на заданном окне


                } catch (Exception ex) {
                    System.out.println("Ошибка ввода данных");
                }
            }
        });

    }
}
