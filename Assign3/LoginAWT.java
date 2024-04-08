package Assign3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginAWT implements ActionListener, MouseListener {

    Frame f=new Frame();

    TextField username, pwd;

    Button login, exit;

    public LoginAWT() {

        f = new Frame("Login Screen");
        Label l1 = new Label("Username");
        l1.setBounds(100, 40, 90, 30);

        TextField user = new TextField();
        user.setBounds(191, 40, 90, 30);
        user.addMouseListener(this);

        Label l2 = new Label("Password");

        l2.setBounds(100, 80, 90, 30);

        TextField pwd = new TextField();
        pwd.setBounds(191, 80, 90, 30);
        pwd.addMouseListener(this);

        Button login = new Button("Login");
        login.setBounds(100, 120, 90, 30);
        login.addActionListener(this);

        Button exit = new Button("Exit");
        exit.setBounds(191, 120, 90, 30);
        exit.addActionListener(this);

        f.add(l1);
        f.add(l2);
        f.add(user);
        f.add(pwd);
        f.add(login);
        f.add(exit);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);

    }

    void loginDialog() {
        Dialog d = new Dialog(f, "Login Dialog", true);
        d.setLayout(null);
        d.setSize(300, 100);
        Label l= new Label("Login was Successful");
        l.setBounds(80, 40, 100, 40);
        d.add(l);
        d.setVisible(true);
        f.add(d);
    }

    void exitDailog() {
        Dialog d = new Dialog(f, "Exit Dialog", true);
        d.setLayout(null);
        d.setSize(300, 200);
        Label l = new Label("Are you sure to exit? Yes/No");
        l.setBounds(100, 40, 120, 40);
        d.add(l);
        Button yes = new Button("Yes");
        yes.setBounds(100, 90, 50, 30);
        yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Button no = new Button("No");
        no.setBounds(155, 90, 50, 30);
        no.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.dispose();
            }
        });

        d.add(yes);
        d.add(no);
        d.setVisible(true);
        f.add(d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login)
            loginDialog();
        if (e.getSource() == exit)
            exitDailog();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == username) {
            username.setText("Username in format username@abc.com");
        }
        else if (e.getSource() == pwd) {
            pwd.setText("Enter password");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }
    public static void main(String[] args) {
        LoginAWT l= new LoginAWT();
    }

}
