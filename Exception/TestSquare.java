package Exception;

import java.util.Scanner;

public class TestSquare {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextInt();
        try {
            Square s = new Square(side);
            System.out.println(s.calculateArea());
        } catch (Exception e) {
        }
    }
}
