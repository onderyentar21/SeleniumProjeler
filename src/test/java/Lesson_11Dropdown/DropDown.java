package Lesson_11Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.amazon.com";
        driver.get(url);
        Thread.sleep(3000);

        WebElement dropdownElement = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        //dropdownElement.click();

        // 2. islem Select clasında bir parametreli (dropdownElementi olacak) obje olusturmam gerkşyot

        Select select = new Select(dropdownElement);

        Thread.sleep(2000);
        //1. yöntem
     select.selectByIndex(11);
        System.out.println("11 indexteki eleeman : "+select.getFirstSelectedOption().getText());// baby

        Thread.sleep(2000);
        //2. yontem
        select.selectByValue("search-alias=stripbooks");

        System.out.println("Value: "+select.getFirstSelectedOption().getText());//books

        Thread.sleep(2000);
        //3.yontem
        select.selectByVisibleText("Cell Phones & Accessories");

        System.out.println("Visible text: "+ select.getFirstSelectedOption().getText());// cell phone

        Thread.sleep(3000);

        List<WebElement> alloption= select.getOptions();

        int sayac=0;
       for(WebElement w :alloption){
           System.out.println(sayac+ " inci Deger: "+w.getText());
           sayac++;
       }

        driver.quit();


    }
}
