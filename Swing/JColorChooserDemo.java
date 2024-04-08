package Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JColorChooserDemo {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        Container c=f.getContentPane();
        f.setSize(650,400);
        f.setLayout(new FlowLayout());
        JLabel banner= new JLabel("Sample Text",JLabel.CENTER);
        JColorChooser cc= new JColorChooser(Color.BLACK);
        cc.getSelectionModel().addChangeListener((new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Color newColor=cc.getColor();
                banner.setForeground(newColor);
            }
        }));
        c.add(banner);
        c.add(cc);
        f.setVisible(true);
    }
}
