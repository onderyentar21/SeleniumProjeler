package Lesson_09RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // URL : https://www.diemol.com/selenium-4-demo/relative-locators-demo.html"
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement bostonElement = driver.findElement(By.id("pid6_thumb"));
        WebElement newYorkElement = driver.findElement(By.id("pid3_thumb"));
        WebElement bayAreaElement = driver.findElement(By.id("pid8_thumb"));
        WebElement sailorElement = driver.findElement(By.id("pid11_thumb"));

        WebElement berlinElement1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElement));
        WebElement berlinElement2 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).toLeftOf(bayAreaElement));
        WebElement berlinElement3 = driver.findElement(RelativeLocator.with(By.xpath("(//img[@class=\"ui-li-thumb\"])[7]")).below(newYorkElement));
        WebElement berlinElement4 = driver.findElement(RelativeLocator.with(By.id("pid7_thumb")).above(sailorElement));
        //berlinElement4.click();
       // System.out.println("title: "+berlinElement4.getText()+"baslık: "+berlinElement4.getTagName());
        String text1 = berlinElement1.getAttribute("id");
        String text2 = berlinElement2.getAttribute("id");
        String text3 = berlinElement3.getAttribute("id");
        String text4 = berlinElement4.getAttribute("id");

        System.out.println("Text1 :"+text1+" text2: "+text2+" text3: "+text3+" text4: "+text4);

        if(text1.equals(text2)&&text3.equals(text4)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAİLED");
        }







        Thread.sleep(3000);


        driver.quit();
    }
}
