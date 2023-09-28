package Lesson_14HandleIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450);");
        String  info1 = driver.getTitle();
        System.out.println("Bilgiler: "+info1);
        WebElement about = driver.findElement(By.xpath("//h3[contains(.,'Selenium IFrame')]"));
        System.out.println("Yazisi: "+about.getText());

        WebElement iframe1 = driver.findElement(By.xpath("//*[@id=\"post-body-9163515251344049321\"]/div/div/div/div/iframe[1]"));
        driver.switchTo().frame(iframe1);
        Thread.sleep(2000);
        JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,650);");

        WebElement yeniSayfaDog = driver.findElement(By.xpath("//h2[.='Jobs in India']"));
        System.out.println("Yeni sayfa bilgi: "+yeniSayfaDog.getText());

        driver.switchTo().parentFrame();

        WebElement anaSayfa = driver.findElement(By.xpath("//time[@datetime=\"2019-11-21T22:42:00-08:00\"]"));
        System.out.println("Son sayfa: "+anaSayfa.getText());
        Thread.sleep(2000);
        driver.quit();






    }
}
