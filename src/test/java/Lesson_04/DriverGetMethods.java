package Lesson_04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");

        driver.navigate().to("https://www.youtube.com");

        //amazon sayfasına dön
        driver.navigate().back();

        //şimdi tekrar youtuba dönelim

        driver.navigate().forward();
        Thread.sleep(3000);

        //sayfayı yenileyin reflesh yapın demek.


        driver.navigate().refresh();


        driver.quit();
    }
}
