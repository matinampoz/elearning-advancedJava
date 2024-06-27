package ch9;

import javax.swing.*;
import java.awt.*;

public class HelloSwingContentPane {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("AUEB Coding Factory - Swing");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // mainFrame.setSize(800, 400);
        mainFrame.setLocationRelativeTo(null);

        //default layout: Border Layout;
        mainFrame.getContentPane().add(new JLabel("Hello World"));
        mainFrame.getContentPane().add(new JButton("Hello North!"), BorderLayout.NORTH);
        mainFrame.getContentPane().add(new JButton("Hello South!"), BorderLayout.SOUTH);
        mainFrame.getContentPane().add(new JButton("Hello East!"), BorderLayout.EAST);
        mainFrame.getContentPane().add(new JButton("Hello West!"), BorderLayout.WEST);
        mainFrame.getContentPane().add(new JLabel("Hello Center", JLabel.CENTER), "Center");

        mainFrame.pack();
        mainFrame.setVisible(true);


    }
}
