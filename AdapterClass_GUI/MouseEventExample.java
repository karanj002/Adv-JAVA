package AdapterClass_GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseEventExample extends Frame {
    Label l=new Label();
    MouseEventExample(){
        setSize(200,100);
        setLayout(new FlowLayout());
        add(l);
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseMoved(MouseEvent e) {
                l.setText(e.getX() + " , " + e.getY());
            }
        });
        setVisible(true);
    }


    public static void main(String[] args) {
        new MouseEventExample();
    }
}
