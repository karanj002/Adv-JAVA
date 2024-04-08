package MidTerm.multithreading;

public class Thread3 extends Thread {
    public void run() {
        System.out.println("Start Thread3 :");
        for (int k = 1; k < 5; k++) {
            System.out.println("From Threa3 : k=" + k);
            if (k == 2) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
