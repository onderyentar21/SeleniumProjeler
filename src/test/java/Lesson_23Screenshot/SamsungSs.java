package Lesson_23Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class SamsungSs {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.samsung.com");

        TakesScreenshot sS = (TakesScreenshot) driver;

        String konumNo = System.getProperty("user.dir")+"\\screenShot\\samsungSS.png";

        File cekildi = sS.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(cekildi,new File(konumNo));
        driver.quit();


    }
}
