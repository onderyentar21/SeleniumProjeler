package Lesson_16ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {
    public static void main(String[] args) throws InterruptedException {
        // Actions Class Lesssons
        /**
         * Action classını kullanarak mouse ve keyboard ile yapabileceğimiz tum işlevleri gercekleştirebiliriz
         * Actions Class bircok kullanışlı mouse ve klavye işlevine sahiptir.
         * Mouse Actions
         *
         * doubleClick(): WebElemenete cift tıklama yapar
         * clicAndHold(): WebElement üzerinde ckick yapili olarak bizden komut bekler
         * dragAndDrog(): WebElementi bir noktadan diğerine sürekler ve bırkalkır
         * moveToElement(): Mouse istediğimiz Wenelementin üzerinde tutar.
         * contextClick(): Mouse ile istediğimiz WebElemente sag tiklama yapar.
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //amazon ana sayfaya gidiniz
        driver.get("https://www.amazon.com");

        // moveToElement(): Mouse istediğimiz Wenelementin üzerinde tutar.
        // Sag uste : hello, sign in elementinin üzerinde mouse bekletin
        Actions actions = new Actions(driver);
        WebElement helloTextElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(helloTextElement).perform();
        Thread.sleep(3000);
        // acilan menu de creat a list linkine tiklayin
        WebElement creatListText = driver.findElement(By.xpath("//span[.='Create a List']"));
        actions.click(creatListText).perform();

        // create a list sayfasini acildiğini test edin

        Thread.sleep(2000);

        String expectUrl = "https://www.amazon.com/hz/wishlist/intro";
        String actualUrl = driver.getCurrentUrl();
        if (expectUrl.equals(actualUrl)){
            System.out.println("TEST PASSED");
            System.out.println("Title: "+driver.getTitle());
        }else{
            System.out.println("TEST FAİLED");
        }
        Thread.sleep(2000);
        //driver.quit();







        // ve new sayfasini aldiğini test edin


    }
}
