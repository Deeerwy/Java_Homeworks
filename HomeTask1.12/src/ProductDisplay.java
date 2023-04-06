import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ProductDisplay implements Runnable {
    private final String fileName;

    public ProductDisplay(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Product product = (Product) ois.readObject();
            System.out.println("All your fears i see here \n" + product.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

