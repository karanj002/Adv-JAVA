package MidTerm.multithreading;

public class Thread1 extends Thread{
    public void run(){
        System.out.println("Start Thread 1");
        for (int i=1; i<5; i++){
            if(i==2)Thread.yield();
            System.out.println("From Thread1 : i="+i);
        }
        System.out.println("Exit Thread 1");
    }
}
