package learnfile;

import java.io.File;

public class Task2 {
    public static void main(String[] args) {
        File file=new File("C:/Users/HP/Downloads/");
        getFile(file,0);

    }


    public static void getFile(File file,int level){
        File[] files=file.listFiles();
        for(File f:files){
            for(int i=0;i<level;i++){
                System.out.print("-");
            }

            System.out.println(f.getAbsolutePath());
            if(f.isDirectory()){
                System.out.println(file.getName() + "/");

                getFile(f,level+1);
            }
            else if(f.isFile()){
                System.out.println(f.getAbsolutePath());
            }
        }

    }
}
