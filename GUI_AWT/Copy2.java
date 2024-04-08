package GUI_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Copy2 extends Frame {
    TextField tf1 = new TextField(15);
    TextField tf2 = new TextField(15);
    Copy2() {
        setSize(300, 100);
        tf2.setBounds(100, 100, 50, 30);
        tf1.setBounds(100, 200, 50, 30);

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);

        tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf1.getText());
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        Copy2 c2 = new Copy2();
    }
}

