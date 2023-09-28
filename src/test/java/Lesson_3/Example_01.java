package Lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Sayfanın başlığı: "+driver.getTitle());
        String actualtitle = driver.getTitle();
        String expectedTitle ="amazon";
        if (actualtitle.equals(expectedTitle)){
            System.out.println("title testi passed");
        }else{
            System.out.println("title testi failed");
        }

        System.out.println("sayfanın urlsi: "+driver.getCurrentUrl());

        String actualUrl = driver.getCurrentUrl();
        String expectkUrl ="Amazon";

        if (actualUrl.contains(expectkUrl)){
            System.out.println("Url Test passed");
        }else {
            System.out.println("Url Test Failed!!");
        }


        System.out.println("Sayfanın handle degeri: "+driver.getWindowHandles());

      // System.out.println("Html kodları : "+driver.getPageSource());

       String pageSoru = driver.getPageSource();
       String expeckt = "shopping";

       if (pageSoru.contains(expeckt)){
           System.out.println("HTML Test passed!!");
       }else {
           System.out.println( "HTML Test Failed!!");
       }

        driver.quit();
    }
}
