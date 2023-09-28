package Lesson_19Ornek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise_2 {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // https://html.com/tags/iframe/ sayfasina gidelim
        String url = "https://html.com/tags/iframe/";
        driver.get(url);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.ARROW_UP).perform();
        //video basmak için frame degistir
        WebElement iframe = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);


        WebElement playElement = driver.findElement(By.xpath("//button[@aria-label=\"Play\"]"));

        playElement.click();

        Thread.sleep(4000);
        //videonun calıştığını test edin
        WebElement pausedElement = driver.findElement(By.xpath("//button[@aria-keyshortcuts=\"k\"]"));

        // isEnabled(): metodu ise ulaşabiliyorsa yani trumu yada false mi diye bakıyor.

        if ( pausedElement.isEnabled()){
            System.out.println("video oynatılıyor....");
        }
        //videoyu durdurun
        pausedElement.click();
        Thread.sleep(2000);
        //tarayıcıyı kapatın.
        driver.quit();






    }
}
