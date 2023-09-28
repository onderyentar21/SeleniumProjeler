package Lesson_12Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);
        WebElement alertComfirm3 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        WebElement result = driver.findElement(By.xpath("//p[@id=\"result\"]"));

        alertComfirm3.click();
        Thread.sleep(2000);

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("son senecege tikladim");
        //  jS Alert içinde bulunan box içine veri girmek için sendKeys() metodu kullanırız.
        Thread.sleep(3000);
        alert3.accept();

        /**
         * burdabu metodu kıulladdfr
         */
        String expectUrl = "You entered: son senecege tikladim";

        String realUrl = result.getText();

        if (expectUrl.equals(realUrl)){
            System.out.println("Result: "+"Your Test Passed");
        }else{
            System.out.println("Your Test Failed");
        }

        System.out.println("Baslık : "+driver.getTitle());
        Thread.sleep(2000);
        driver.quit();

    }
}
