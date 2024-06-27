package ch9;

import javax.swing.*;
import java.awt.*;

public class HelloSwingDemoClass {
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(MainWindow::new);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //EventQueue.invokeLater(() -> new MainWindow());
        SwingUtilities.invokeLater(() -> new MainWindow());

        /*EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    new MainWindow();
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });*/
    }
}

class MainWindow extends JInternalFrame {
    private static final long serialVersionUID = 1L;

    public MainWindow() {
        super("AUEB Coding Factory - Hello World!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,400);
    }
}
