package com.matek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener{
    public MainMenu(int top, int left, int bottom, int right) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));

        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
