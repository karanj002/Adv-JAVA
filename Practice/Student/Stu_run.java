package Practice.Student;
import java.util.Scanner;

public class Stu_run {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Roll number: ");
        int rno= sc.nextInt();

        System.out.println("Total marks: ");
        double marks= sc.nextDouble();

        System.out.println("Name: ");
        sc.nextLine();
        String name= sc.nextLine();

        Student s1= new Student(rno, name, marks);
        System.out.println("Student details: " + rno);
        System.out.println( name );
        System.out.println( marks );

    }
}
