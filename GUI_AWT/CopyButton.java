package GUI_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyButton extends Frame {
    TextField tf1 = new TextField(15);
    TextField tf2 = new TextField(15);
    Button b = new Button("Copy");

    CopyButton() {
        setSize(300, 150);
        tf2.setBounds(50, 100, 50, 30);
        b.setBounds(50, 200, 50, 30);
        tf1.setBounds(50, 300, 50, 30);

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf1.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        CopyButton c = new CopyButton();
    }
}
