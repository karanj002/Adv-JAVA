package Swing;

import javax.swing.*;
import java.awt.*;

public class JDailogShowMessageDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Container c=f.getContentPane();
        f.setLayout(new FlowLayout());
        JOptionPane.showMessageDialog(f, "How easy to create dialog!");
        JOptionPane.showMessageDialog(f, "How easy to create dialog!", "Erroe", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(f, "How easy to create dialog!", "Information", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(f, "How easy to create dialog!", "Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(f, "How easy to create dialog!", "Question", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(f, "How easy to create dialog!", "Plain", JOptionPane.PLAIN_MESSAGE);
        f.setVisible(true); 
    }
}
