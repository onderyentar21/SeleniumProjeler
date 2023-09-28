package Lesson_10RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //https://the-internet.herokuapp.com/checkboxes
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);

        Thread.sleep(2000);
        WebElement check1 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        WebElement check2 = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));

        if (!check1.isSelected()){
            Thread.sleep(2000);
            check1.click();
        }
        if (check2.isSelected()){
            Thread.sleep(2000);
            check2.click();

        }
        String currentTitle= driver.getTitle();
        System.out.println(currentTitle);

        WebElement bilgi = driver.findElement(By.xpath("//div[@id=\"content\"]"));
        String takeTest = bilgi.getText();
        System.out.println("Acıklama: "+takeTest);


        Thread.sleep(3000);

        driver.quit();

    }
}
