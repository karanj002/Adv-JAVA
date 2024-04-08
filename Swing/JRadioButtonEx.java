package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JRadioButtonEx extends JFrame implements ActionListener{
    JRadioButton r1,r2;
    JButton b;
    JRadioButtonEx(){
        r1=new JRadioButton("YES");
        r1.setBounds(50,25,100,30);
        r2=new JRadioButton("NO");
        r2.setBounds(150,25,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        JButton b=new JButton("Submit");
        b.setBounds(100,70,80,30);
        b.addActionListener(this);
        add(r1);add(r2);add(b);
        setSize(300,150);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(r1.isSelected()){
            JOptionPane.showMessageDialog(this,"You Selected YES!.");
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(this,"You Selected NO!.");
        }
    }
    public static void main(String args[]){
        new JRadioButtonEx();
    }
}