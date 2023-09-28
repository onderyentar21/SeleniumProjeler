package Lesson_12Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://the-internet.herokuapp.com/javascript_alerts";
        driver.get(url);

        WebElement alertButton1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        WebElement result = driver.findElement(By.id("result"));

        Thread.sleep(2000);
        alertButton1.click();

        Thread.sleep(1000);
        // Alert(uyarı kabul yöntemi sadece bir senenek iki tane yöntem:)
        Alert alertKabul = driver.switchTo().alert();
        alertKabul.accept();
      // driver.switchTo().alert().accept();

        String expectedResult = "You successfully clicked an alert";
        String actualResult = result.getText();
        if (expectedResult.equals(actualResult)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("TEST FAILED");
        }


        Thread.sleep(2000);
        driver.quit();

    }
}
