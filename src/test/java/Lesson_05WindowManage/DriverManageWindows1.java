package Lesson_05WindowManage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageWindows1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // youtube sayfasına gidelim
        driver.get("https://www.amazon.com");
        //sayfanın konumlarını ve boyutlarını yazdırın
        System.out.println("Sayfanın konumu:"+driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları : "+driver.manage().window().getSize());
        //3.sayfanın imge durumunu getirin
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();


        //5.sayfanın konumlsrını ve boyutlarını maximize durumunda yazdirin
        System.out.println("max Sayfanın konumu:"+driver.manage().window().getPosition());
        System.out.println("max sayfanın boyutları : "+driver.manage().window().getSize());

        // sayfayı fullscrean yapın
        driver.manage().window().fullscreen();

        //7. sayfanın konumunu ve boyutlarını fullscrean seklşnde yazdirin
        System.out.println("fulscram Sayfanın konumu:"+driver.manage().window().getPosition());
        System.out.println("fulscream sayfanın boyutları : "+driver.manage().window().getSize());



        Thread.sleep(3000);

        driver.quit();
    }
}
