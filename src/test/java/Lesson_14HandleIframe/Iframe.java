package Lesson_14HandleIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.soap.Text;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //         https://the-internet.herokuapp.com/iframe URL gidin
        String url = "https://the-internet.herokuapp.com/iframe";
        driver.get(url);

        WebElement baslikText = driver.findElement(By.xpath("//div//h3"));

        String expectText ="An iFrame containing the TinyMCE WYSIWYG Editor";
        String actualText = baslikText.getText();
        if (expectText.equals(actualText)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("TEST FAİLED");
        }

        //Text boxa "Merhaba Dunya" yaz.
        // 1- ifram'i locate etme işlemi

        Thread.sleep(2000);
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        // driveri iframe icerisine gönderme işlemi aşağıdaki şekilde yapılır.
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);

        WebElement textElement = driver.findElement(By.tagName("p"));
        textElement.clear();
        Thread.sleep(2000);
        textElement.sendKeys("Merhaba Dunya!");

        System.out.println("Sayfanın son hali : "+ textElement.getText());
        Thread.sleep(2000);
        //bu bizi bir üst seviyeki frame çıkarır
        driver.switchTo().parentFrame();
        // bu bizi en üsteki frame git diyoruz.
        //driver.switchTo().defaultContent();
        // ana frame geri dondum ve ana kısmından tekrardan yazı alacağım

        Thread.sleep(2000);

       // System.out.println("Ana sayfa yazisi: "+ baslikText.getText());
        WebElement sonYazi = driver.findElement(By.id("page-footer"));
        System.out.println("son yazi: "+sonYazi.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
