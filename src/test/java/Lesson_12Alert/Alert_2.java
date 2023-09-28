package Lesson_12Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);

        WebElement comfirmButton = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement realResult = driver.findElement(By.xpath("//p[@id=\"result\"]"));
        Thread.sleep(2000);
        comfirmButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        //driver.switchTo().alert().dismiss(); ikinci vir yolda bunu kullanabiliriz
        alert.dismiss();
        String expecktUrl = "You clicked: Cancel";
        String curentUrl = realResult.getText();

        if (expecktUrl.equals(curentUrl)){
            System.out.println("Test 2 PASSED");
        }else {
            System.out.println("Test 2 Failed");

        }

        driver.quit();

    }
}
