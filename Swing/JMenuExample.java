package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JMenuExample{
    public static void main(String[] args) {
        JFrame f =new JFrame("JMenu Example");
        Container c=f.getContentPane();
        f.setSize(200,150);
        f.setLayout(new FlowLayout());
        JMenu color= new JMenu("Color");
        color.add("Red");
        color.add("Green");
        JMenu twoD=new JMenu("TwoD shapes");
        twoD.add("Triangle");
        twoD.add("Circle");

        JMenu threeD =new JMenu("ThreeD shapes");
        threeD.add("Cube");
        threeD.add("Sphere");

        JMenu shape=new JMenu();
        shape.add(threeD);
        shape.add(twoD);

        JMenuBar jmb=new JMenuBar();
        jmb.add(shape);
        jmb.add(color);
        f.setJMenuBar(jmb);
        f.setVisible(true);
    }

}
