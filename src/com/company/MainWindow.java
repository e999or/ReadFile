package com.company;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;

public class MainWindow extends JFrame implements ActionListener {

    private JButton pathLogButton = new JButton();// создаём кнопуку для
    private JButton pathSaveButton = new JButton();
    private JTextField pathLogTextField = new JPasswordField();
    private JTextField pathSaveTextField = new JPasswordField();
    JButton buttonLoad;
    JButton buttonSave;
    JButton buttonOK;
    File openFile;
    File saveFile;

    MainWindow() {
        this.setTitle("Чеки");// устанавливае назавние Title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//выход из приложения
        this.setLayout(new FlowLayout());//создаём layout

        buttonLoad = new JButton("Загрузить файл");
        buttonLoad.addActionListener(this);
        buttonSave = new JButton("Сохранить файл");
        buttonSave.addActionListener(this);
        buttonOK = new JButton("OK");
        buttonOK.addActionListener(this);


        this.add(buttonLoad);
        this.add(buttonSave);
        this.add(buttonOK);
        this.pack();//создаём pack
        this.setSize(400, 400); //увеличиваем
        this.setVisible(true);// делаем видимым

    }

    @Override
    public void actionPerformed (ActionEvent e){
        if(e.getSource() == buttonLoad){
            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showOpenDialog(null);// выбрать файл из списка чтобы открыть

            if(response == JFileChooser.APPROVE_OPTION){
                openFile = new File(fileChooser.getSelectedFile().getAbsolutePath());

            }
        }

        if(e.getSource() == buttonSave){

            JFileChooser fileChooser = new JFileChooser();

            int response = fileChooser.showSaveDialog(null);// выбрать файл из списка чтобы сохранить

            if(response == JFileChooser.APPROVE_OPTION) {
                saveFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
            }
        }

        if(e.getSource() == buttonOK){
            try {
                new FindString(openFile, saveFile);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
