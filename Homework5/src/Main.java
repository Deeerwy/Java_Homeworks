// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.io.IOException;
import java.util.Scanner;
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Practical Task 5. Variant 5. Student Burylin D.S. Group RIBO-03-21");
        Scanner scan = new Scanner(System.in);
        System.out.println("show me the path ");
        String path = scan.nextLine();

        boolean isExistWorkDir = FileUtils.checkWorkDirectory(path);

        if(isExistWorkDir){
            String data = "Super secret info here";
            try{
                FileUtils.writeFileNames(path);
            }catch(IOException ex){
                System.out.println("Error here" + ex.getMessage());
            }

        }
    }
}