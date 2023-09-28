package Lesson_16ActionsClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //  https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement sagTik= driver.findElement(By.id("hot-spot"));



        Thread.sleep(3000);
        // cizili olan üzerinde sag click yapalım,
        actions.contextClick(sagTik).perform();
        // Alert te cikan yaziyinin  "you selected a context menu" oldugunu test edelim
        String expectUrl = "You selected a context menu";
        String actualUrl = driver.switchTo().alert().getText();
        Thread.sleep(1000);

       if (expectUrl.equals(actualUrl)){
           System.out.println("Text passed");
           System.out.println("Gercek url degeri:"+actualUrl);
       }else {
           System.out.println("Test failed");
           System.out.println("Gercek url degeri:"+actualUrl);
       }
        // tama diyerek alerti kapatalim.
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        driver.quit();

    }
}
