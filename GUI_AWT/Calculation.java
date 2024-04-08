package GUI_AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculation extends Frame implements ActionListener{ // Now for the button to perform operations we need to implement a Interface
    // Declaring objects for each Operation/ GUI to be displayed
    Button b1,b2,b3;
    TextField tf1, tf2, tf3;
    Label l1, l2, r;

    //Creating all the Buttons, Lables and text boxes
    Calculation() {
        l1 =new Label("Enter First number :");
        l1.setBounds(20, 80, 150, 30);
        tf1=new TextField("");
        tf1.setBounds(170, 80, 60, 30);


        l2 =new Label("Enter Second number :");
        l2.setBounds(20, 120, 150, 30);
        tf2=new TextField("");
        tf2.setBounds(170, 120, 60, 30);

        r =new Label("Result :");
        r.setBounds(20, 160, 100, 30);
        tf3=new TextField("");
        tf3.setBounds(170, 160, 60, 30);
        
        b1=new Button("Add");
        b1.setBounds(20, 220, 120, 30);

        b2=new Button("Subtract");
        b2.setBounds(140, 220, 120, 30);

        b3=new Button("Exit");
        b3.setBounds(260, 220, 120, 30);

        // Adding all of the buttons and all in the frame
        add(l1);add(l2);add(r);
        add(tf1);add(tf2);add(tf3);
        add(b1);add(b2);add(b3);

        //Setting frame dimensions and parameters
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

    }

    // Operation constructor
    public void actionPerformed(ActionEvent e){
        int a =Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        if (e.getSource()==b1){
            tf3.setText(Integer.toString(a+b));
        }
        if (e.getSource()==b2){
            tf3.setText(Integer.toString(a-b));
        }
        if (e.getSource()==b3){
            System.exit(0);
        }
    }
    //Main function
    public static void main(String[] args) {
        Calculation c= new Calculation();
    }
}
