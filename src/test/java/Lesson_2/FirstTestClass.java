package Lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {
    public static void main(String[] args) throws InterruptedException {
       //System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice");

        Thread.sleep(3000);

        driver.quit();
    }
}
