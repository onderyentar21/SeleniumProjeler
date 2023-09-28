package Lesson_22SynhronizationWaitinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _02_Explicitly_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement element = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        element.sendKeys("iphone");

       // WebElement searchBt = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));

        WebElement searchBt = new WebDriverWait(driver,Duration.ofSeconds(10)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\"nav-search-submit-button\"]")));
        searchBt.click();


    }
}
