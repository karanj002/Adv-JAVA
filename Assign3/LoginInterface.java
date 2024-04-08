package Assign3;
import java.awt.*;
import java.awt.event.*;

public class LoginInterface extends Frame implements ActionListener, MouseMotionListener {

    TextField username, pwd;
    Button Login, Exit;

    public LoginInterface() {
        setTitle("Login Page");
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        Label l1 = new Label("Username:");
        username = new TextField();
        username.addMouseMotionListener(this);

        Label l2 = new Label("Password:");
        pwd = new TextField();
        pwd.setEchoChar('*');
        pwd.addMouseMotionListener(this);

        Login = new Button("Login");
        Login.addActionListener(this);

        Exit = new Button("Exit");
        Exit.addActionListener(this);

        add(l1);
        add(username);
        add(l2);
        add(pwd);
        add(Login);
        add(Exit);
    }

    public void mouseMoved(MouseEvent e) {
        if (e.getSource() == username) {
            String msg = "Username in format username@abc.com";
            setTitle(msg);
        } else if (e.getSource() == pwd) {
            String msg = "Enter password";
            setTitle(msg);
        }
    }

    public void mouseDragged(MouseEvent e) {
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Login) {
            Dialog dialog = new Dialog(this, "Login Successful", true);
            dialog.setSize(200, 100);
            dialog.setVisible(true);
        } else if (e.getSource() == Exit) {
            Dialog dialog = new Dialog(this, "Are you sure to exit", true);
            dialog.setSize(200, 100);
            Button yes = new Button("Yes");
            yes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            Button no = new Button("No");
            no.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            });
            Panel panel = new Panel(new FlowLayout());
            panel.add(yes);
            panel.add(no);
            dialog.add(panel);
            dialog.setVisible(true);
        }
    }
    public static void main(String[] args) {
        LoginInterface login = new LoginInterface();
        login.setVisible(true);
    }

}