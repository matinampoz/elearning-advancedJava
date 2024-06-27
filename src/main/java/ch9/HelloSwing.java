package ch9;

import javax.swing.JFrame;

public class HelloSwing {
    public static void main(String[] args) {
        // Create JFrame
        JFrame mainFrame = new JFrame("AUEB Coding Factory - Hallo Swing");

        // set defaultCloseOperation, default is: HIDE_ON_CLOSE
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ////set size. Size = contentPane + window borders
        mainFrame.setSize(800, 400);

        //set Location of window to center of the screen
        mainFrame.setLocationRelativeTo(null);

        //set Visible(true) is visible, else false is hidden
        mainFrame.setVisible(true);


    }
}