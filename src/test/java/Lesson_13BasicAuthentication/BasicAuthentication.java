package Lesson_13BasicAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //String url ="https://the-internet.herokuapp.com/basic_auth";
       // driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement yazi = driver.findElement(By.xpath("//div[@class=\"example\"]"));
        System.out.println("aciklama : "+ yazi.getText());

        // HTML komutu : https://username:password@URL bunu kişiden isteyebilirsin

        Thread.sleep(2000);

        driver.quit();

    }
}
