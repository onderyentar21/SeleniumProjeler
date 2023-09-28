package Lesson_21FileDownloadandFileUptade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class File_download {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // https://the-internet.herokuapp.com/download URL'e gidin
        String url = "https://the-internet.herokuapp.com/download";
        driver.get(url);
        Thread.sleep(2000);
        WebElement downdload = driver.findElement(By.xpath("//a[.='TextDoc.txt']"));
        downdload.click();

        Thread.sleep(3000);

        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\TextDoc.txt";
        System.out.println(dosyaYolu);
        Boolean result = Files.exists(Paths.get(dosyaYolu));

        if (result.equals(true)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed.");
        }
        // close the browser
        driver.quit();


    }

}
