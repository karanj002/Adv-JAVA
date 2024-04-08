package GUI_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First extends Frame implements ActionListener{ // Now for the button to perform operations we need to implement a Interface
    First() {
        Button b = new Button("Click me");
        b.setBounds(30, 100, 80, 30);
        Frame f =new Frame();
        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Blalalalahahaha");
        //System.exit(0);
    }


    public static void main(String[] args) {
        First f1= new First();
    }
}