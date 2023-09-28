package Lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriversGetMethohds {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com"); // get : belirtilen url ye gider

       System.out.println("şu anki sayfanın url: "+ driver.getCurrentUrl());   // sayfanın url adresini getirir

        System.out.println("Sayfanın basligi: "+ driver.getTitle()); // bana sayfanın başlığını getir

       driver.getPageSource();// tüm html kodlarını getirir.

        System.out.println("Sayfanın unit degeri: "+driver.getWindowHandles());// bize unit degerini veir ama her calıştırdığımızda degişik deger verir.
        System.out.println("Driver class type: "+driver.getClass()); //org.openqa.selenium.chrome.ChromeDriver; driver hangi class türünde onu verir.

        driver.quit();
    }
}
