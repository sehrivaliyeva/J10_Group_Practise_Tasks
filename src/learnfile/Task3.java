package learnfile;

import java.io.File;

public class Task3 {
    public static void main(String[] args) {


        long zaman = System.currentTimeMillis();
        long hours24=10*60*60*1000;

        File file = new File("C:/Users/HP/Downloads/");

        File[] listFiles = file.listFiles();

        for (File files : listFiles) {
            if(zaman - hours24 <files.lastModified()) {
                System.out.println(files.getName());
            };
        }

    }
}
