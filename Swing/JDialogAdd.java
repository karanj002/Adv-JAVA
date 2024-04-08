package Swing;

import javax.swing.*;

public class JDialogAdd {
    public static void main(String[] args) {
        int n=0, a, b, op, res=0;
        String[] options= {"Addition", "Substraction", "Multiplicationn", "Division"};
        while(n==0){
            a=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the first number :"));
            b= Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number :"));
            op=JOptionPane.showOptionDialog(null, "Arithematic Operation :", "Operation",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
            switch (op){
                case 0: res= a+b; break;
                case 1: res= a-b; break;
                case 2: res= a*b; break;
                case 3: res= a/b; break;
            }
            n=JOptionPane.showConfirmDialog(null, "The Answer is : " +res+ "\n Do you wanna continue !","Confirmation",
                    JOptionPane.YES_NO_OPTION);
        }
    }
}
