package Inheritance_Employee;

import java.util.Scanner;
public class EmployeeTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the values
        System.out.print("Enter number: ");
        String id = input.nextLine();

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter surname: ");
        String surname = input.nextLine();

        System.out.print("Enter hourly pay: ");
        double hourlyPay = input.nextDouble();

        System.out.print("Enter number of hours: ");
        int nofhrs = input.nextInt();

//        PartTimeEmployee();
        // Print out the valu es entered by the user
        System.out.println("Number: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Hourly Pay: " + hourlyPay);
        System.out.println("Number of Hours: " + nofhrs);
    }
}
