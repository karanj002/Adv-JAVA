package MidTerm.multithreading;

public class Thread_test {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End of Threads");
    }
}


