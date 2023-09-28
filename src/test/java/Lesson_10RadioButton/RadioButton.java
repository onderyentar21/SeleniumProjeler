package Lesson_10RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url= "https://www.facebook.com";
        driver.get(url);

        WebElement yeniHesap = driver.findElement(By.xpath("//a[.=\"Create new account\"]"));
        yeniHesap.click();
        Thread.sleep(2000);
        WebElement maleBotton = driver.findElement(By.xpath("//input[@value=\"2\"]"));

        if(!maleBotton.isSelected()){
            Thread.sleep(2000);
            maleBotton.click();
        }

        Thread.sleep(2000);

        System.out.println("Baslık : "+driver.getTitle());
        driver.quit();


    }
}
