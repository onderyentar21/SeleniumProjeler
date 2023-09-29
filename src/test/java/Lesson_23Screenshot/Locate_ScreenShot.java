package Lesson_23Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Locate_ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Amazona git

        driver.get("https://www.amazon.com");
        //Arama kutusuna Apple yaz ve ara

        WebElement searchLook = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchLook.sendKeys("Apple", Keys.ENTER);

        // arama sonucu ekran gorunutusu alma
        // belli bir alanın screenshot işlemide 4 adımda gercekleşir
        //1.adım screenshot işlemini yapacağımız elementi locate etmek

        WebElement locateSS = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]"));
        //2. işlem screenshot'ı kayıt edeceğimiz bir file oluşturma
        String output =System.getProperty("user.dir")+"\\ScreenShot\\locateSS.png";

        File webelementSS = new File(output);

        // gecici resim için bir creenshot dosyası oluştur
        File geciciSS = locateSS.getScreenshotAs(OutputType.FILE);

        //4 gecici resmi asıl dosyasına copy işlemi yapılır
        FileUtils.copyFile(geciciSS, webelementSS);

        driver.quit();






    }
}
