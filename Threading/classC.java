package Threading;

public class classC extends Thread{
    public void run(){
        System.out.println("Start Thread B ...");
        for (int k=1; k<=5; k++){
            System.out.println("From Thread B: k=" +k);
            if (k==2){
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
