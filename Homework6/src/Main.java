import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> randomIntegers = new ArrayList<>();

        Thread randomThread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int randomInt = random.nextInt(1000);
                randomIntegers.add(randomInt);
            }
        });

        Thread sortThread = new Thread(() -> {
            Collections.sort(randomIntegers);
        });

        randomThread.start();
        sortThread.start();

        try {
            randomThread.join();
            sortThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(randomIntegers);
    }
}