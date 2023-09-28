package Lesson_20FileExist;

import javafx.scene.shape.Path;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class FileExist_2 {

    public static void main(String[] args) {
        // projenizde pom.xml olduğunu test esin
        //C:\testmuhendisi_dersler\SeleniumEmreSaglam\pom.xml
        //System.out.println(System.getProperty("user.dir"));

        String dosyaYolu = System.getProperty("user.dir")+"//pomm.xml";
        System.out.println(dosyaYolu);
        Boolean result = Files.exists(Paths.get(dosyaYolu));
        if (result){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("please check your folder way!!");
        }


    }
}
