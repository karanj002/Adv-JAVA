package Swing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class JTreeExample {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Container c =f.getContentPane();
        c.setLayout(new FlowLayout());
        DefaultMutableTreeNode root= new DefaultMutableTreeNode("Computer");
        DefaultMutableTreeNode c1= new DefaultMutableTreeNode("HDD");
        DefaultMutableTreeNode c2= new DefaultMutableTreeNode("CPU");
        DefaultMutableTreeNode c3= new DefaultMutableTreeNode("GPU");
        DefaultMutableTreeNode c11= new DefaultMutableTreeNode("Mouse");
        DefaultMutableTreeNode c12= new DefaultMutableTreeNode("Seagate");
        DefaultMutableTreeNode c21= new DefaultMutableTreeNode("Intel");
        DefaultMutableTreeNode c22= new DefaultMutableTreeNode("IBM");
        DefaultMutableTreeNode c31= new DefaultMutableTreeNode("HP");
        DefaultMutableTreeNode c32= new DefaultMutableTreeNode("Dell");
        root.add(c1);root.add(c2);root.add(c3);
        c1.add(c11);c1.add(c12);
        c2.add(c21);c2.add(c22);
        c3.add(c31);c3.add(c32);
        JTree t=new JTree(root);
        c.add(t);
        f.pack();
        f.setVisible(true);
    }
}
