package Swing;

import AdapterClass_GUI.MouseEventExample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuEx {
    JPopupMenuEx() {
        JFrame f = new JFrame("Popup Menu");
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem mi1 = new JMenuItem("Item 1");
        JMenuItem mi2 = new JMenuItem("Item 2");
        popupMenu.add(mi1);
        popupMenu.add(mi2);

        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(f, e.getX(), e.getY());
            }
        });

        mi1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Popup menu item 1 is Clicked");
            }
        });

        mi2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Popup menu item 2 is Clicked");
            }
        });

        f.add(popupMenu);
        f.setSize(300, 150);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }


    public static void main(String[] args) {
        new JPopupMenuEx();
    }
}