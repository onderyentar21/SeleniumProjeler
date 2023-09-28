package Lesson_17ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // https://demoqa.com/droppable adresine gidelim
        String url = "https://selenium08.blogspot.com/2020/01/drag-drop.html";
        driver.get(url);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350);");

        WebElement dragMe = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement dragerX = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions actions = new Actions(driver);

       // actions.clickAndHold(dragMe).moveToElement(dragerX).perform();
        actions.dragAndDrop(dragMe,dragerX).perform();
        Thread.sleep(2000);

        String expectedResult = "Scientech Easy";
        String actualResult = dragerX.getText();

        if (expectedResult.equals(actualResult)){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
            System.out.println("gercek deger: "+dragerX.getText());
        }


        Thread.sleep(2000);
        driver.quit();


    }

}
