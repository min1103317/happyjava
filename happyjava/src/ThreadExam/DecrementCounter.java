package ThreadExam;
import java.util.*;

public class DecrementCounter implements Runnable{
    int counter = 0;

    @Override
    public void run() {

        for (int i = 100; i > 0; i--) {
            System.out.printf("Decrement: {%d}\n" , i);
            try {
                Thread.sleep((long) (Math.random() * 11));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
