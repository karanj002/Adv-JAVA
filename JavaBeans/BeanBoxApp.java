package JavaBeans;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class BeanBoxApp extends Frame {
    private Checkbox checkbox;
    private ColorCanvas colorCanvas;

    public BeanBoxApp() {
        setTitle("BeanBox");
        setSize(300, 180);

        checkbox = new Checkbox(" DONT CLICK !!");
        colorCanvas = new ColorCanvas();

        setLayout(new FlowLayout());
        add(checkbox);
        add(colorCanvas);

        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkbox.getState()) {
                    colorCanvas.setColor(Color.GREEN);
                } else {
                    colorCanvas.setColor(Color.RED);
                }
                colorCanvas.repaint();
            }
        });

    }

    public static void main(String[] args) {
        BeanBoxApp app = new BeanBoxApp();
        app.setVisible(true);
    }
}

class ColorCanvas extends Canvas {
    private Color color;

    public ColorCanvas() {
        setSize(300, 180);
        color = Color.RED;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0,0, getWidth(), getHeight());
    }
}

