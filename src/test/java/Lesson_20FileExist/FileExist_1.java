package Lesson_20FileExist;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExist_1 {
    public static void main(String[] args) {
        // Masaustunde Test Klasoru içinde deneme.txt isminde bir dosya oluşturalım.
        // daha sonra bu dosyanın biligsayarınızda olduğunu test edin.
        //C:\Users\onder\OneDrive\Masaüstü\Test\deneme.txt
        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\Test";
   // String dosyaYolu ="C:\\Users\\onder\\OneDrive\\Masaüstü\\Test";

       // String dosyaYolu = "C:\\Users\\onder\\OneDrive\\Masaüstü\\Test\\deneme.txt";
        Path path = Paths.get(dosyaYolu);

        Boolean result = Files.exists(path);

       // Boolean result = Files.exists(Paths.get(dosyaYolu));
        if (result){
            System.out.println("Test passed...: "+result);
        }else{
            System.out.println("Test Failed...: "+result);
        }









       // System.out.println(System.getProperty("user.dir"));//C:\testmuhendisi_dersler\SeleniumEmreSaglam
      //  System.out.println(System.getProperty("user.home"));//C:\Users\onder


    }
}
