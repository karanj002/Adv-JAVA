package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuExample2 implements ActionListener {
    JFrame f; Container c;
    JMenu color,twoD, threeD, shape;
    JMenuBar jmb;
    JMenuItem red, green, triangle, circle, cube, sphere;
    JLabel l;
    JMenuExample2(){
        f=new JFrame();
        c=f.getContentPane();
        f.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==red)
            l.setForeground(Color.red);
        if(e.getSource()==green)
            l.setForeground(Color.green);
    }

    public static void main(String[] args) {
        new  JMenuExample2();
    }
}
