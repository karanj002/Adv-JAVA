package MidTerm.multithreading;

import java.util.SortedMap;

public class Thread2 extends Thread {
    public void run() {
        System.out.println("Start Thread2 ;");
        for (int j = 1; j < 5; j++) {
            System.out.println("From Thread2 : j=" + j);
            if (j == 2) {
                try {
                    join();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

