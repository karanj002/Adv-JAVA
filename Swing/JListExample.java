package Swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JListExample{
    public static void main(String[] args) {
        JFrame f =new JFrame();
        Container c= f.getContentPane();
        c.setLayout(new FlowLayout());
        String[] languages={"C++", "JAVA", "Python"};
        JList list =new JList(languages);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Object values =list.getSelectedValue();
                    System.out.println(values);
            }
        });
        c.add(list);
        f.pack();
        f.setVisible(true);
    }
}
