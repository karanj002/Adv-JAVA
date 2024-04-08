package GUI_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener { // Now for the button to perform operations we need to implement a Interface
    // Declaring objects for each Operation/ GUI to be displayed
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    TextField tf;
    Label ans;

    //Creating all the Buttons, Lables and text boxes
    Calculator() {
        ans = new Label("ANSWER :");
        ans.setBounds(20, 80, 50, 30);
        tf = new TextField("");
        tf.setBounds(210, 80, 180, 30);


        b1 = new Button("1");
        b1.setBounds(20, 180, 100, 30);

        b2 = new Button("2");
        b2.setBounds(140, 180, 100, 30);

        b3 = new Button("3");
        b3.setBounds(260, 180, 100, 30);

        b4 = new Button("4");
        b4.setBounds(20, 220, 100, 30);

        b5 = new Button("5");
        b5.setBounds(140, 220, 100, 30);

        b6 = new Button("6");
        b6.setBounds(260, 220, 100, 30);

        b7 = new Button("7");
        b7.setBounds(20, 250, 100, 30);

        b8 = new Button("8");
        b8.setBounds(140, 250, 100, 30);

        b9 = new Button("9");
        b9.setBounds(260, 250, 100, 30);

        b10 = new Button("0");
        b10.setBounds(140, 280, 100, 30);

        b11 = new Button("+");
        b11.setBounds(390, 180, 100, 30);

        b12 = new Button("-");
        b12.setBounds(390, 210, 100, 30);

        b13 = new Button("x");
        b13.setBounds(390, 240, 100, 30);

        b14 = new Button("/");
        b14.setBounds(390, 270, 100, 30);

        b15 = new Button("=");
        b15.setBounds(390, 300, 100, 30);

        // Adding all of the buttons and all in the frame
        add(ans);
        add(tf);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);

        //Setting frame dimensions and parameters
        setSize(600, 400);
        setLayout(null);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
    }
}