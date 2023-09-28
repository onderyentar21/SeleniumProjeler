package lesson_08Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
    public static void main(String[] args) throws InterruptedException {

        /**
         * "https://www.amazon.com.tr/" sitesine git
         * cerezleri kabul et
         * arama butununa iphone 11 yaz ve arama işlemi yap
         * arama sonucunun iphone 11 icerip icermediğini kontrol edip
         *
         * // ilk urun fiyatını consola yazdır
         *
         * 2 sn bekle ve browsere kapat
         *
         *
         */

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='sp-cc-accept']")).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("İphone 11");
        WebElement arama= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        arama.sendKeys("iphone 11");
        WebElement tiklama = driver.findElement(By.cssSelector("#nav-search-submit-button"));
        tiklama.click();

        //String aramaSonuc=
              //  driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]")).getText()+
             //   driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[3]")).getText();
       // System.out.println("Arama sonucu : "+aramaSonuc);

      //  if (aramaSonuc.contains("iphone 11")){
           // System.out.println("Arama sonucu iphone 11 içeriyor");
      //  }else{
        //    System.out.println("Arama sonucu iphone 11 içermiyor");
       // }
        WebElement check = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String checkkontrol = check.getText();
        if (checkkontrol.contains("iphone 11")){
             System.out.println(checkkontrol+": Arama sonucu iphone 11 içeriyor");
             }else{
                System.out.println("Arama sonucu iphone 11 içermiyor");
             }

        WebElement check_price =driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
        System.out.println("İlk urun fiyatı : "+check_price.getText());
        Thread.sleep(2000);

        driver.quit();
    }
}
