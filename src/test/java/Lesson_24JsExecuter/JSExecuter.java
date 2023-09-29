package Lesson_24JsExecuter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class JSExecuter {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
       // Actions actions = new Actions(driver);
        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
              //  sendKeys(Keys.PAGE_DOWN);
        WebElement element = driver.findElement(By.xpath("//a[.='Supply to Amazon']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);



        WebElement dogrulama = driver.findElement(By.xpath("//h1[@class=\"heading align-start font-size-xxxlarge color-squid-ink ember font-heavy\"]"));


        if (dogrulama.isEnabled()){
            System.out.println("Test Passed!!! "+dogrulama.getText());
        }else {
            System.out.println("Test Failed!!!");
        }
        driver.quit();
    }
}
