package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Assign_4 {
    public static void main(String[] args) throws InterruptedException {
        JFrame jf = new JFrame("JTextField");
        Container c = jf.getContentPane();
        jf.setSize(1200, 200);
        c.setLayout(new FlowLayout());


        // TO ADD TEXT FIELD
        c.add(new JLabel("Name"));
        c.add(new JTextField(10));
        jf.setVisible(true);

        JPasswordField jpf = new JPasswordField(10);
        c.add(new JLabel("Password "));
        c.add(jpf);
        jpf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pwd = new String(jpf.getPassword());
                JOptionPane.showMessageDialog(jf, "password is: " + pwd);
            }
        });

         // TO ADD A TABLE
         int row=4, col=2;
         JTable table=new JTable(row,col);
         table.setBounds(200, 200, 30, 80);
         for (int i=0;i<row; i++){
             table.setValueAt(i, i,0);
             table.setValueAt(i*i, i, 1);;
         }
         c.add(table);
 
         
         // TO ADD/MAKE A DROP DOWN MENU
         String[] colors={"c1", "Green", "c2"};
         JComboBox c1=new JComboBox<>(colors);
         c1.setBounds(300, 200, 30, 80);
         JLabel l=new JLabel();
         c1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e){
                 l.setText("Selected :" + c1.getSelectedItem());
             }
         });
         c.add(l);
         c.add(c1);
 
 
         // TO MAKE LIST OF ELMENTS
         DefaultListModel<String> l1 = new DefaultListModel<>();
         l1.addElement("Item1");
         l1.addElement("Item2");
         l1.addElement("Item3");
         l1.addElement("Item4");
         JList<String> list = new JList<>(l1);
         list.setBounds(400, 200, 80 ,80);
         c.add(list);
         jf.setVisible(true);
 
 
 
         //TO MAKE A JTree
         DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
         DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
         DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
         style.add(color);  
         style.add(font);  
         DefaultMutableTreeNode c11=new DefaultMutableTreeNode("Red");  
         DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Blue");  
         DefaultMutableTreeNode f1=new DefaultMutableTreeNode("Calibri");  
         DefaultMutableTreeNode f2=new DefaultMutableTreeNode("Times new roman");  
         color.add(c11); color.add(c2); font.add(f1); font.add(f2);      
         JTree t=new JTree(style);  
         c.add(t);  
         jf.setVisible(true);
         
        // TO MAKE PROGRESS BAR IN SWING
        JProgressBar pb=new JProgressBar(0,100);
        pb.setBounds(300, 400, 30, 80);
        pb.setStringPainted(true);
        c.add(pb);
        for(int i=0; i<=100; i++){
          pb.setValue(i);
          Thread.sleep(100);
        }
        jf.setVisible(true);

    }
}




