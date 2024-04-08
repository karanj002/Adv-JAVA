package Practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        Float n=sc.nextFloat();
        try{
            Check c=new Check(n);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
