package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        while (!ok) {
            System.out.println("Enter test score:");
            try {
                int score = sc.nextInt();
                if (score >= 50) {
                    System.out.println("You have a place on the course !!");
                } else {
                    System.out.println("Sorry! You failed your test");
                }
                ok = true;
                sc.close();
            } catch (InputMismatchException e) {
                System.out.println("YOU ENTERED AN INVALID VALUE");
            }
        }
    }
}
