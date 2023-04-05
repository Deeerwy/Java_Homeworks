import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numList = new ArrayList<>();

        Runnable genNumbers = () -> {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                numList.add(rand.nextInt(1000));
            }
        };

        Runnable sortNumbers = () -> {
            Collections.sort(numList);
            System.out.println("Sorted numbers: " + numList);
        };

        Thread t1 = new Thread(genNums);
        t1.start();
        t1.join();

        Thread t2 = new Thread(sortNums);
        t2.start();
    }

}