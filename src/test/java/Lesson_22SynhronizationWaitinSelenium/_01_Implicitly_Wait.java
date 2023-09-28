package Lesson_22SynhronizationWaitinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

import java.time.Duration;

public class _01_Implicitly_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement element = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        element.sendKeys("iphone", Keys.ENTER);

    }
}
