import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static boolean checkWorkDirectory(String path){
        File workdir = new File(path);
        if(workdir.exists()){
            return true;
        }else {
            return workdir.mkdir();
        }
    }

    public static void writeFileNames(String dirName) throws IOException{
        File dir = new File(dirName);
        System.out.println(dir.getName() + " " + dir.length());

        if (dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null)
                for (File name : list)
                    writeFileNames(name.getPath());
        }
    }

    public static void writeStringToFile(String path, String str) throws IOException{
        FileWriter fw = new FileWriter(path);
        fw.write(str);
        fw.close();
    }

    public static byte[] readBytesFromFile(String path) throws FileNotFoundException, IOException{
        File file = new File(path);
        if(file.exists() && file.isFile()){
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[fis.available()];
            fis.read(data);
            fis.close();

            return data;
        }else{

            return new byte[]{};

        }
    }
}
