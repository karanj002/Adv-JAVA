package Swing;
import java.awt.*;
import javax.swing.*;

public class SimpGUI extends JFrame {

    private JLabel label;
    private JButton button;

    public SimpGUI() {
        setTitle(" CHATAKK !! ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Welcome to Adv Java clssroom", SwingConstants.CENTER);
        button = new JButton("SUBMIT");
        button.addActionListener(e -> {
            label.setText(" Assignment has been submitted !");
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
            new SimpGUI();
    }
}

