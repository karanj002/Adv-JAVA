package Serialisation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Depersist {
    public static void main(String[] args) {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("abc.txt"));
            Student s1 =(Student)in.readObject();
            System.out.println(s1.id+ " " +s1.name);
            in.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
