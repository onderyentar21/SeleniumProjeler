package lesson_08Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
       driver.manage().window().maximize();

        //search ktucuguna laptop yazdirin
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop xsa");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        WebElement goruntulenen = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]"));
        String degerAl = goruntulenen.getText();
        System.out.println("görüntüleme sayısı : "+degerAl);



        // eski bilgisayar
      //  WebElement ilkResim = driver.findElement(By.xpath("(//img[@class=\"_c2Itd_image_pQREQ\"])[1]"));
       // ilkResim.click();



        WebElement ilkResim2 = driver.findElement(By.xpath("(//span[@class=\"a-truncate-cut\"])[2]"));
        ilkResim2.click();
        WebElement aciklama = driver.findElement(By.xpath("//span[@id=\"productTitle\"]"));
        System.out.println("Acıklama :"+aciklama.getText());
        /*
        if (driver.getCurrentUrl().equals("https://www.amazon.com/s?k=laptop+xsa&crid=3IFFAGMPFZ1WS&sprefix=laptop+xsa%2Caps%2C222&ref=nb_sb_noss")){
            WebElement ilkResim2 = driver.findElement(By.xpath("(//span[@class=\"a-truncate-cut\"])[2]"));
            ilkResim2.click();
            WebElement aciklama = driver.findElement(By.xpath("//span[@id=\"productTitle\"]"));
            System.out.println("Acıklama :"+aciklama.getText());
        } else if (driver.getCurrentUrl().equals("https://www.amazon.com/s?k=laptop+xsa&crid=MHXTGXSWS1H7&sprefix=laptop+xsa%2Caps%2C229&ref=nb_sb_noss")) {
            WebElement ilkResim = driver.findElement(By.xpath("(//img[@class=\"_c2Itd_image_pQREQ\"])[1]"));
            ilkResim.click();
            WebElement aciklama2 = driver.findElement(By.xpath("//span[@id=\"productTitle\"]"));
            System.out.println("Title: "+aciklama2.getText());

        }//else {
           // System.out.println("Her iki linte hata var");

       // }
       */

        System.out.println("Link : "+driver.getCurrentUrl());


        Thread.sleep(2000);
        driver.quit();

    }
}
