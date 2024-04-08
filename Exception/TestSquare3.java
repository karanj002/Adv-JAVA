package Exception;

import java.util.Scanner;

public class TestSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter value for the sides of square: ");
        double side=sc.nextDouble();
        try{
            SquareVersion2 mySq = new SquareVersion2(side);
            System.out.println("Area ="+ mySq.calculateArea());
        }catch (SquareException e){
            System.out.println(e);
        }
        sc.close();
        System.out.println("End of program");
    }
}
