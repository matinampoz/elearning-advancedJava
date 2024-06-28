package ch9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//event driver programming - υπαρχει ένα κομμάτι κώδικα το οποίο εκτελειται στην βάση ενλος event
//event listeners / event listeners - τα κομματια κώδικα τα οποια διαχειρίζονται το event
//τα event δημιουργούνται είτε από τον χρήστη είτε από το σύστημα

public class EventDialogs {
    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(DialogWindow::new);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class DialogWindow extends JFrame {
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
        this.getContentPane().add(inputButton, BorderLayout.WEST);
        this.getContentPane().add(comboButton, "Center");

        //this.pack();
        this.setLocationRelativeTo(null);
        //this.setBounds(0, 0, 200, 200);
        this.setVisible(true);

        /*
        Στο message button κανω add έναν ActionListener(). O ActionListener υλοποιει το interface ActionListener.
        Ειναι ενα functional Interface που ορίζει μόνο την actionPerformed μια μέθοδο η οποία είναι
        ο handler, δηλαδή πάιρνει ένα ActionEvent και εκτελεί ένα κομμάτι κώδικα. Διαχειρίζεται το event.
        Συσχετίζω το button με ένα event. Έτσι αν συμβεί ένα action event σε αυτό το button πχ κλικ, να εκτελεστει
        ο κώδικας του event handler που υλοποιειται από την actionPerformed
        types of messages: WARNING_MESSAGE, INFORMATION_MESSAGE, ERROR_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE
         */
        messageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello", "HelloTitle",
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        /*
        //Εφόσον το ActionListener ειναι function interface μπορώ εναλλακτικα να χρησιμοποιήσω lambda.
        messageButton.addActionListener(e -> JOptionPane.showMessageDialog(
                this,
                "Hello",
                "Hello Title",
                JOptionPane.INFORMATION_MESSAGE
        ));*/


        //στο confirmButton μου βγαζει επιλογές yes, no
        confirmButton.addActionListener(e ->  {
            int n = JOptionPane.showConfirmDialog(this,
                    "Hello", "HelloTitle",
                    JOptionPane.YES_NO_OPTION);
            if (n==JOptionPane.YES_OPTION)JOptionPane.showMessageDialog(this,
                    "YES", "YesTitle", JOptionPane.WARNING_MESSAGE);
            else JOptionPane.showMessageDialog(this, "NO", "NoTitle",
                    JOptionPane.WARNING_MESSAGE);
        });

        //το optionButton ειναι παρομοιο με το confirmButton αλλα μου επιτρέπει να εχω τισ δικες μου ονομασίες στα κουμπια
        optionButton.addActionListener(e -> {
            Object[] options = {"Yes, please", "No way!"};
            int n = JOptionPane.showOptionDialog(this, "Do you want a Hello message?",
            "HelloTitle",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);
            if (n==0) JOptionPane.showMessageDialog(this, "YES", "Hello Title",
                    JOptionPane.WARNING_MESSAGE);
            else JOptionPane.showMessageDialog(null, "NO", "NoHelloTitle",
                    JOptionPane.WARNING_MESSAGE);
        });

        //στο inputButton ο χρηστης δίνει input ενα string
        inputButton.addActionListener(e -> {
            String code = JOptionPane.showInputDialog(this,
                    "Enter the secret code to continue (label)",
                    "Secret code needed (title)", JOptionPane.WARNING_MESSAGE);
            if (code.toUpperCase().equals("AUEB"))JOptionPane.showMessageDialog(this,
                    "YES", "AUEBTitle", JOptionPane.WARNING_MESSAGE);
            else JOptionPane.showMessageDialog(null, "NO", "NoAUEBTitle",
                    JOptionPane.WARNING_MESSAGE);
        });

        //το comboButton εμφανίζει επιλογες
        comboButton.addActionListener(e -> {
            String[] names = {"ALICE", "BOB", "COSTAS", "DIMIS"};

            String favouriteName = (String) JOptionPane.showInputDialog(this,
                    "What is your favourite name?",
                    "Favourite Names",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    names,
                    names[0]);
            if (favouriteName.equals("COSTAS"))JOptionPane.showMessageDialog(this,
                    "COSTAS!!", "FavoyriteTitle", JOptionPane.WARNING_MESSAGE);
            else JOptionPane.showMessageDialog(null, "NO KOSTAS", "NoFavouriteTitle",
                    JOptionPane.WARNING_MESSAGE);
        });
    }
}
