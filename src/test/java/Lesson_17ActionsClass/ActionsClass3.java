package Lesson_17ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {
   static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ornekDers();
        ornekUc();
      //  System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        Thread.sleep(2000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350);");

        WebElement titleC = driver.findElement(By.xpath("//li[@name=\"C\"]"));
        WebElement titleD = driver.findElement(By.xpath("//li[@name=\"D\"]"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(titleC).moveToElement(titleD).perform();

        Thread.sleep(3000);

        driver.quit();
        System.out.println("Test passed!!!");



    }
    public static void ornekDers() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Thread.sleep(2000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350);");

        WebElement titleI = driver.findElement(By.xpath("//li[@name=\"I\"]"));
        WebElement titleH = driver.findElement(By.xpath("//li[@name=\"H\"]"));


        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.clickAndHold(titleI).moveToElement(titleH).perform();

        Thread.sleep(3000);
        driver.quit();
        System.out.println("TEST 2 SCSESFULL !!!");

    }
    public static void ornekUc() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        Thread.sleep(2000);
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,350);");

        WebElement titleA = driver.findElement(By.xpath("//li[@name=\"A\"]"));
        WebElement titleL = driver.findElement(By.xpath("//li[@name=\"L\"]"));

        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.clickAndHold(titleA).moveToElement(titleL).perform();

        Thread.sleep(3*1000);
        driver.quit();
        System.out.println("TEST 3 PASSED!!!");


    }
}
