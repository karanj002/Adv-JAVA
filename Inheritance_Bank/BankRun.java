package Inheritance_Bank;
import java.util.Scanner;
public class BankRun{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // Prompt the user to enter the values
            System.out.print("Enter Acc number: ");
            String accNumber = input.nextLine();

            System.out.print("Enter Acc name: ");
            String accName = input.nextLine();

            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();

            GoldAcc acc = new GoldAcc(accNumber, accName, 1000.0, 500.0);
//            System.out.println("Acc Number: "  + accNumber);
//            System.out.println("Name: " + accName);
//            //System.out.println("Balance: " + balance);
//            //System.out.println(": " + balance-amount);
            BankAcc p1 = new BankAcc(accName, accNumber, amount);
            System.out.println("Acc Number: "  + accNumber);
            System.out.println("Name: " + accName);
            System.out.println("Old Balance: " + acc.getBalance());
            acc.overDraftWithdrawal(amount, acc.getBalance());
           // System.out.println("Deposit : " + p1.deposit(amount));
            //System.out.println("New Balance: " +

        }
    }
