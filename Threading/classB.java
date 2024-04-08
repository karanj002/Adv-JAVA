package Threading;

public class classB extends Thread{
    public void run(){
        System.out.println("Start Thread B ...");
        for (int j=1; j<=5; j++){
            System.out.println("From Thread B: j=" +j);
            if (j==2){
                try{
                    join();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
