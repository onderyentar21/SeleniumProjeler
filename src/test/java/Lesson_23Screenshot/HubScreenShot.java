package Lesson_23Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HubScreenShot {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.apple.com");

        TakesScreenshot screenshot = (TakesScreenshot) driver;

        String kayitYeri = System.getProperty("user.dir")+"\\screenShot\\resimSS.png";

        File alinanSS = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(alinanSS, new File(kayitYeri));
        driver.quit();

    }
}
