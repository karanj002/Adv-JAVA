package JDBC;

import java.util.Scanner;

public class Employe {
    int id;
    String name;
    int age;
    public void display(){
        System.out.println(id+ " " +name+ " " +age);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        age=sc.nextInt();
        sc.nextLine();
        name=sc.nextLine();
        sc.close();
    }
}
