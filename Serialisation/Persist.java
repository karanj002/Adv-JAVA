package Serialisation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Persist {
    public static void main(String[] args) {
        try{
            Student s1=new Student(123, "Karan");
            FileOutputStream fout= new FileOutputStream("abc.txt");
            ObjectOutputStream out= new ObjectOutputStream(fout);
            out.write(1);
            out.flush();
            out.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
