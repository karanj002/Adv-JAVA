package Threading;

public class classA extends Thread{
    public void run(){
        System.out.println("Start Thread A ...");
        for (int i=1; i<=5; i++){
            if(i==2) Thread.yield();
            System.out.println("From Thread A : i=" +i);
        }
        System.out.println("... Exit Thread A");
    }
}
