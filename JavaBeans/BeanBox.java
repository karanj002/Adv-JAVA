package JavaBeans;
import java.awt.*;
import java.awt.event.*;

public class BeanBox extends Frame {
    private Checkbox checkbox;

    public BeanBox() {
        setTitle("CheckBox");
        setSize(300, 150);
        checkbox = new Checkbox(" Check !!");

        setLayout(new FlowLayout());
        add(checkbox);

        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {}});
    }

    public static void main(String[] args) {
        BeanBox app = new BeanBox();
        app.setVisible(true);
    }
}

