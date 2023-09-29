package Lesson_23Screenshot;

//import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FullPage_ScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com");

        WebElement searchLook = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        searchLook.sendKeys("Samsung", Keys.ENTER);

        //1. TakeScreenShot objesi olusturuyorum
        TakesScreenshot tss = (TakesScreenshot) driver;


        //2. Kaydedecegimiz dosyayı olusturacagiz
        String output =System.getProperty("user.dir")+"\\src\\test\\java\\ScreenshotDepo\\tumsayfa.png";
        System.out.println(output);

        File tumSayafaSS = new File(output);

        //3. Bir dosya daha olusturacagiz ve screenshot objesi ile ekran goruntusu alma islemi yapacagiz

        File geciciResim = tss.getScreenshotAs(OutputType.FILE);

        //4. GeciciResmi kaydetmek istedigimiz asil dosyaya copy islemi yapilir.

        FileUtils.copyFile(geciciResim,tumSayafaSS);


        // b u ise tek bir kod satırında yapıldığında

        /*
        File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("target/screenshot/tumsayfaSS.png"));
        driver.quit();

         */










         //driveri kapat.
        driver.quit();


    }
}
