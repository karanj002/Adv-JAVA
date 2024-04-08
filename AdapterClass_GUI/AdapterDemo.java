package AdapterClass_GUI;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdapterDemo extends Frame {
    TextField tf= new TextField(15);
    AdapterDemo(){
        setSize(200,100);
        setLayout(new FlowLayout());
        add(tf);
        tf.addKeyListener(new CaseChanged());
        setVisible(true);
    }
    class CaseChanged extends KeyAdapter {
        public void keyReleased(KeyEvent e){
            int cp = tf.getCaretPosition();
            tf.setText(tf.getText().toUpperCase());
            tf.setCaretPosition(cp);
        }
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }

}
