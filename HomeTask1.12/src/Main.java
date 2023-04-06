import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enlight me with your path, young padawan: ");
        String filePath = scanner.nextLine();

        ProductDisplay deserializationClass = new ProductDisplay(filePath);

        Thread deserializationThread = new Thread(deserializationClass);

        deserializationThread.start();

        try {
            deserializationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("your way s gonna end here, jedi.");
    }
}

