package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    JButton messageButton = new JButton("Get a message dialog");
    JButton confirmButton = new JButton("Get a Confirmation");
    JButton optionButton = new JButton("Get an Option");
    JButton inputButton = new JButton("Get an Input Dialog");
    JButton comboButton = new JButton("Get an InputComboDialog");


    public DialogWindow() {
        super("AUEB Coding Factory - Hello World!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,400);

        this.getContentPane().add(messageButton, BorderLayout.NORTH);
        this.getContentPane().add(confirmButton, BorderLayout.SOUTH);
        this.getContentPane().add(optionButton, BorderLayout.EAST);
        this.getContentPane().add(comboButton, "Center");

        //this.pack();
        this.setLocationRelativeTo(null);
        this.setBounds(0, 0, 200, 200);

        messageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hallo", "HalloTitle",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
    }
}
