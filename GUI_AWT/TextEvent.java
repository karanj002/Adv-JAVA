package GUI_AWT;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextEvent extends Frame {
    TextField tf= new TextField(15);
    TextEvent(){
        setSize(180,80);
        setLayout(new FlowLayout());
        add(tf);

        // Instead of using KeyListner we can use Adapter classes (KeyAdapter)

        // tf.addKeyAdapter(new KeyAdapter() {
        //     int cp=tf.getCaretPosition();
        //     tf.setText(tf.getText().toUpperCase());
        //     tf.setCaretPosition(cp);
        // });
        
        tf.addKeyListener(new KeyListener() {
            public void keyReleased(KeyEvent e) {
                int cp=tf.getCaretPosition();
                tf.setText(tf.getText().toUpperCase());
                tf.setCaretPosition(cp);
            }
            public void keyPressed(KeyEvent e) {}
            public void keyTyped(KeyEvent e){}
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEvent();
    }
}
