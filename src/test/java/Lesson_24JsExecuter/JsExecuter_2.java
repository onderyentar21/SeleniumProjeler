package Lesson_24JsExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JsExecuter_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        WebElement element = driver.findElement(By.xpath("//a[.='Supply to Amazon']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,6000);");
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", element);
        //element.click();


        WebElement dogrulama = driver.findElement(By.xpath("//h1[@class=\"heading align-start font-size-xxxlarge color-squid-ink ember font-heavy\"]"));


        if (dogrulama.isEnabled()){
            System.out.println("Test Passed!!! "+dogrulama.getText());
        }else {
            System.out.println("Test Failed!!!");
        }
        driver.quit();
    }
}
