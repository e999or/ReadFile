package com.company;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;

public class MainWindow extends JFrame  {
	static JPanel panel;
	static JTextArea textArea;
    JButton buttonLoad;
    JButton buttonOK;
    File openFile;
	private JTabbedPane tabbedPane;

   MainWindow() {
   	getContentPane().setLayout(null);
   	setSize(633, 443);
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	setResizable(false);
   	
   	tabbedPane = new JTabbedPane(JTabbedPane.TOP);
   	tabbedPane.setBounds(10, 11, 604, 365);
   	getContentPane().add(tabbedPane);
   	
   	panel = new JPanel(null);
   	tabbedPane.addTab("Download check", null, panel, null);
   	panel.setLayout(null);
   	
   	textArea = new JTextArea();
   	textArea.setBounds(10, 45, 579, 281);
   	panel.add(textArea);
   	
   	buttonLoad = new JButton("Load file");
   	buttonLoad.setBounds(10, 11, 89, 23);
   	panel.add(buttonLoad);
   	buttonLoad.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION){
                openFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
                
            }
   		}
   	});
   	
   	buttonOK = new JButton("OK");
   	buttonOK.setBounds(500, 11, 89, 23);
   	panel.add(buttonOK);
   	buttonOK.addActionListener(new ActionListener() {
   		public void actionPerformed(ActionEvent e) {
   			try {
                new FindString(openFile);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
   		}
   	});
   	setVisible(true);
    }

}
