package Lesson_18KeyboardAction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KeyboardActions_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url ="https://www.walmart.com/";
        driver.get(url);
        //driver.findElement(By.xpath("//button[.='Kabul et']")).click();
       Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@type=\"search\"]"));
        Actions actions = new Actions(driver);
        actions.click(searchBox);
        actions.click(searchBox);
        actions.keyDown(Keys.SHIFT);
        actions.sendKeys("s");
        actions.keyUp(Keys.SHIFT);
        actions.sendKeys("amsung");
        actions.sendKeys(Keys.SPACE);
        actions.sendKeys("s23");
        actions.sendKeys(Keys.ENTER);
        actions.perform();
        Thread.sleep(2000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450);");
        jsx.executeScript("window.scrollBy(0,250);");


        Thread.sleep(2000);


        WebElement actualResult = driver.findElement(By.xpath("//h2[@class=\"f4 f3-m lh-title ma0 di\"]"));
         String actualKabul= actualResult.getText();
         String expeckt = "Samsung s23";

         if (actualKabul.equals(expeckt)){
             System.out.println("Test PASSED!");
         }
         else{
             System.out.println("TEST FAILED!");
         }
         driver.quit();







    }
}
