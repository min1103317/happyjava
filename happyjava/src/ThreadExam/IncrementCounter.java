package ThreadExam;

import java.util.*;

public class IncrementCounter  implements Runnable {

    @Override
    public void run() {

        for(int i = 1; i < 101; i++) {
            System.out.printf("Increment: {%d}\n", i);

            try {
                Thread.sleep((long) (Math.random() * 11));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
