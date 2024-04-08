package Threading;

public class ThreadTest {
    public static void main(String[] args) {
        classA t1=new classA();
        classB t2=new classB();
        classC t3=new classC();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End of Programm...");
    }
}
