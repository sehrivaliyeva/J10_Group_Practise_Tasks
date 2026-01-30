package learnfile;

import java.io.File;

public class Task4 {
    public static void main(String[] args) {

        File file = new File("C:/Users/HP/Downloads/");
        long size = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            size = size + f.length();

        }
        System.out.println("Umumi olcu : " + size);

        System.out.println("KiloBaytlarla olan olcuu: " + size / 1024);
        System.out.println("MeqaBaytBaytlarla olan olcu: " + size / 2048);
        System.out.println("GegaBaytBaytlarla olan olcu: " + size / 4096);


    }
}
