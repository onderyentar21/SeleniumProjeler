package Lesson_18KeyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]"));
        Actions actions = new Actions(driver);
        actions.click(searchBox).keyDown(Keys.SHIFT).sendKeys("i").keyUp(Keys.SHIFT).
                sendKeys("phone").sendKeys(Keys.SPACE).sendKeys("15").sendKeys(Keys.ENTER).perform();
        //(//div[@class="sg-col-inner"])[1]
        String  actualResult = driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")).getText();

        String expectResult = "\"Iphone 15\"";
        if (actualResult.equals(expectResult)){
            System.out.println("TEST PASSED:"+actualResult);
        }
        else{
            System.out.println("TEST FAİLED:"+actualResult);
        }

        Thread.sleep(2000);

        // browser kapatılır

        driver.quit();



    }
}
