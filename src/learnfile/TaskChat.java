package learnfile;

import java.io.File;

public class TaskChat {


    public static class RecursiveFileSearchWithIndent {

        // Rekursiv metod
        public static void listFiles(File directory, int level) {
            if (directory.exists() && directory.isDirectory()) {
                // Bütün fayl və qovluqları götür
                File[] files = directory.listFiles();

                if (files != null) {
                    for (File file : files) {
                        // Səviyyəyə uyğun olaraq "-" çap et
                        for (int i = 0; i < level; i++) {
                            System.out.print("-");
                        }

                        if (file.isFile()) {
                            System.out.println(file.getName()); // Faylın adı
                        } else if (file.isDirectory()) {
                            System.out.println(file.getName() + "/"); // Qovluq adı
                            // Rekursiv çağırış, səviyyəni 1 artırırıq
                            listFiles(file, level + 1);
                        }
                    }
                }
            } else {
                System.out.println(directory.getAbsolutePath() + " mövcud deyil və ya qovluq deyil!");
            }
        }

        public static void main(String[] args) {
            File rootDir = new File("C:/Users/HP/Downloads");
            listFiles(rootDir, 0); // Başlanğıc səviyyəsi 0
        }
    }

}
